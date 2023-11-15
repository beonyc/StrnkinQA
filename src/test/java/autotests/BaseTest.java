package autotests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Description;
import lombok.extern.log4j.Log4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.ArrayList;

import static com.codeborne.selenide.Selenide.*;

@ExtendWith(Listenner.class)
@DisplayName("класс с предусловиями с постусловиями")
@Log4j
public class BaseTest {
    @BeforeEach
    @Description("Предусловные события")
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        Configuration.browser = "chrome";
        log.info("Запускаем браузер");
        open("https://stankin.ru/");
        WebDriverRunner.getWebDriver().manage().window().maximize();

    }

    @AfterEach
    @Description("Постусловные события")
    public void tearDown() {
        log.info("Закрытие окон");
        ArrayList<String> windows = new ArrayList<>(WebDriverRunner.getWebDriver().getWindowHandles());
        while (!windows.isEmpty()) {
            switchTo().window(windows.size() - 1);
            String windowToRemove = windows.get(windows.size() - 1);
            closeWindow();
            windows.remove(windowToRemove);
        }

    }
}
