package com.euroTech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPlacedPage extends BasePage{
    @FindBy(xpath ="//h1[.='Your order has been placed!']")
    public WebElement orderPlacedMessage;

}
