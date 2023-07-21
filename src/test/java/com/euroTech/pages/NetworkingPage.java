package com.euroTech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NetworkingPage extends BasePage{

    @FindBy(xpath = "(//a[text()='Networking'])[1]")
    public WebElement networkingButton;

    @FindBy(xpath = "//a[@id='compare-total']")
    public WebElement productCompareButton;

    @FindBy(xpath = "//h1[text()='Product Comparison']")
    public WebElement productComparisonText;

    @FindBy(xpath = "//h1[text()='Networking']")
    public WebElement networkingText;

}
