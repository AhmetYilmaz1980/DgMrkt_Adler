package com.euroTech.pages;


import com.euroTech.utilities.BrowserUtils;
import com.euroTech.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecurityPage extends BasePage{

    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//a[@class='a-close-newsletter']")
    public WebElement newsLetterClosedButton;

    public void entry(){
        email.sendKeys(ConfigurationReader.get("username"));
        password.sendKeys(ConfigurationReader.get("password"));
        submitButton.click();
        BrowserUtils.waitFor(2);
        newsLetterClosedButton.click();
    }


}
