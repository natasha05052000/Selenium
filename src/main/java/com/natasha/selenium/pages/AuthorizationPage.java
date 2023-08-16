package com.natasha.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthorizationPage {
    public AuthorizationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@class=\"cEmail\"]")
    public WebElement emailField;

    @FindBy(xpath = "//input[@class=\"cPassword\"]")
    public WebElement passwordField;

    @FindBy(xpath = "//input[@id=\"clicks\"]")
    public WebElement inputButton;
}
