package com.natasha.selenium.steps;

import com.natasha.selenium.pages.RegistrationPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class RegistrationPageSteps {
    private final RegistrationPage registrationPage;

    public RegistrationPageSteps(WebDriver driver) {
        registrationPage = new RegistrationPage(driver);
    }

    @Step
    public void inputEmail(String email) throws InterruptedException {
        Thread.sleep(1000);
        registrationPage.emailField.sendKeys(email);
    }

    @Step
    public void inputName(String name) throws InterruptedException {
        Thread.sleep(1000);
        registrationPage.nameField.sendKeys(name);
    }

    @Step
    public void inputPassword(String password) throws InterruptedException {
        Thread.sleep(1000);
        registrationPage.passwordField.sendKeys(password);
    }

    @Step
    public void inputConfirmationPassword(String confirmationPassword) throws InterruptedException {
        Thread.sleep(1000);
        registrationPage.confirmationPasswordField.sendKeys(confirmationPassword);
    }

    @Step
    public void clickButtonRegistration() throws InterruptedException {
        Thread.sleep(1000);
        registrationPage.inputButton.click();
    }
}
