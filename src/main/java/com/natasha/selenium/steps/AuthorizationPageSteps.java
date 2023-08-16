package com.natasha.selenium.steps;

import com.natasha.selenium.pages.AuthorizationPage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AuthorizationPageSteps {
    private final WebDriver driver;
    private final AuthorizationPage authorizationPage;

    public AuthorizationPageSteps (WebDriver driver) {
        this.driver = driver;
        authorizationPage = new AuthorizationPage(driver);
    }

    @Step
    public void waitPageLoad() {
        ExpectedCondition<WebElement> expectedCondition =
                ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[text()='Авторизация']"));

        new WebDriverWait(driver, Duration.ofSeconds(10)).until(expectedCondition);
    }

    @Step
    public void inputEmail(String email) throws InterruptedException {
        Thread.sleep(1000);
        authorizationPage.emailField.sendKeys(email);
    }

    @Step
    public void inputPassword(String password) throws InterruptedException {
        Thread.sleep(1000);
        authorizationPage.passwordField.sendKeys(password);
    }

    @Step
    public void clickButtonLogin() throws InterruptedException {
        Thread.sleep(1000);
        authorizationPage.inputButton.click();
    }
}
