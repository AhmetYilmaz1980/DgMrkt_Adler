package com.euroTech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TVAccessoriesPage extends BasePage{

    @FindBy(xpath = "(//a[text()='TV Accessories'])[1]")
    public WebElement tvAccessoriesButton;

    @FindBy(xpath = "//a[@id='compare-total']")
    public WebElement productCompareButton;

    @FindBy(xpath = "//h1[text()='Product Comparison']")
    public WebElement productComparisonText;

    @FindBy(xpath = "//h1[text()='TV Accessories']")
    public WebElement tvAccessoriesText;

}
