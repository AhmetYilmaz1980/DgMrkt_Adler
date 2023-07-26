package com.euroTech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Health_BeautyPage extends BasePage {

    @FindBy(xpath = "//h1[text()='Health & Beauty']")
    public WebElement health_BeautyPage;

    @FindBy(xpath = "//option[text()='Default']")
    public WebElement sortBydefault;

    @FindBy(xpath = "//option[text()='Name (A - Z)']")
    public WebElement nameAZ;

    @FindBy(xpath = "//option[text()='Name (Z - A)']")
    public WebElement nameZA;


    @FindBy(xpath = " //option[text()='Price (Low > High)']")
    public WebElement priceLowHigh;

    @FindBy(xpath = " //option[text()='Price (High > Low)']")
    public WebElement priceHighLow;

    @FindBy(xpath = "//option[text()='Rating (Highest)']")
    public WebElement ratingHighest;
}