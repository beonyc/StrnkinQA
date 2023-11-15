package autotests.web;

import autotests.BaseTest;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Condition.*;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import pom.LogInPage;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.*;

class MainTest extends BaseTest {
    private LogInPage logInPage = page(LogInPage.class);

    @ParameterizedTest
    @CsvSource({"first,second", "third,fourth"})
    @DisplayName("Test1")
    public void sad(String login, String password) throws InterruptedException {
        $$(".ti-user").filterBy(visible).get(0).click();
        logInPage.logIn(login, password);
        $(".alert.alert-danger").shouldBe(visible).shouldHave(text("Ошибка"));
    }
}