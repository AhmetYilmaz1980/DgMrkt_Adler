package com.euroTech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TelevisionsPages extends BasePage{

    @FindBy(xpath = "(//a[text()='Televisions'])[1]")
    public WebElement televisionsButton;

}
