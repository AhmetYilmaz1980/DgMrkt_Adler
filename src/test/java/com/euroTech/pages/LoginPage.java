package com.euroTech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class LoginPage extends BasePage {

    @FindBy(xpath = "//input [@id='input-email']")
    public WebElement inputEmail;

    @FindBy(xpath = "//input [@id='input-password']")
    public WebElement inputPassword;

    @FindBy(xpath = "//span[text()='Login']")
    public WebElement blackLogin;

    @FindBy(xpath = "//div [text()=' Warning: No match for E-Mail Address and/or Password.']")
    public WebElement negLoginMessage;

    public void login(String email, String password) {
        inputEmail.sendKeys(email);
        inputPassword.sendKeys(password);
        blackLogin.click();
    }

}
