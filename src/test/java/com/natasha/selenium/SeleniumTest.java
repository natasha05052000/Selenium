package com.natasha.selenium;

import com.natasha.selenium.steps.AuthorizationPageSteps;
import com.natasha.selenium.steps.RegistrationPageSteps;
import io.qameta.allure.Owner;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@Owner("Мизанова Н. У.")
public class SeleniumTest {

    @Test
    public void test() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/registration");

        RegistrationPageSteps registrationPageSteps = new RegistrationPageSteps(driver);
        
        registrationPageSteps.inputEmail("natasha@mail.ru");
        registrationPageSteps.inputName("natasha");
        registrationPageSteps.inputPassword("49094909332299b");
        registrationPageSteps.inputConfirmationPassword("49094909332299b");
        registrationPageSteps.clickButtonRegistration();

        AuthorizationPageSteps authorizationPageSteps = new AuthorizationPageSteps(driver);

        authorizationPageSteps.waitPageLoad();
        authorizationPageSteps.inputEmail("natasha@mail.ru");
        authorizationPageSteps.inputPassword("49094909332299b");
        authorizationPageSteps.clickButtonLogin();
    }
}
