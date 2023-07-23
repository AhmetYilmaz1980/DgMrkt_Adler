package com.euroTech.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartIcon extends BasePage{

    @FindBy(xpath = "//a[text()='eufy C1 Smart Scale White'][1]")
    public WebElement firstProduct;
}
