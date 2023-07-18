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



}
