package com.euroTech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = " //span[text()='Category']")
    public WebElement Category;
    @FindBy(linkText = "Health & Beauty")
    public WebElement subHealthBeauty;
    @FindBy(linkText = "Televisions")
    public WebElement subTelevisions;
    @FindBy(linkText = "TV Accessories")
    public WebElement subTVAccessories;
    @FindBy(linkText = "Networking")
    public WebElement subNetworking;


}
