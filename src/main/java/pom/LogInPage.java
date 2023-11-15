package pom;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class LogInPage {
    private SelenideElement loginArea = $(byAttribute("placeholder", "Login"));
    private SelenideElement passwordArea = $(byAttribute("placeholder", "Password"));

    @Step("Авторизация логин: {login}  пароль: {password}")
    public void logIn(String login, String password) {
        loginArea.setValue(login);
        passwordArea.setValue(password).submit();
    }
}
