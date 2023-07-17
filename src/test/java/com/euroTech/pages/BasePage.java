package com.euroTech.pages;

import com.euroTech.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "// span [text()='My Account']")
    public WebElement myAccountButton;

    @FindBy (xpath = "// a[text()='Login']")
    public WebElement loginButton;

    @FindBy (xpath = "//input [@id='input-email']")
    public WebElement inputEmail;

    @FindBy (xpath = "//input [@id='input-password']")
    public WebElement inputPassword;

    @FindBy (xpath = "//span[text()='Login']")
    public WebElement blackLogin;

    @FindBy(xpath = "//div[text()=' Congratulation! Login Successfully']")
    public WebElement posLoginMessage;

    public void login(String email, String password) {
        inputEmail.sendKeys(email);
        inputPassword.sendKeys(password);
    }





}
