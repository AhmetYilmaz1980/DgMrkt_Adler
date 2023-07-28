package com.euroTech.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TelevisionsPages extends BasePage{

    @FindBy(xpath = "(//a[text()='Televisions'])[1]")
    public WebElement televisionsButton;

    @FindBy(xpath = "//a[@id='compare-total']")
    public WebElement productCompareButton;

    @FindBy(xpath = "//h1[text()='Product Comparison']")
    public WebElement productComparisonText;

    @FindBy(xpath = "//h1[text()='Televisions']")
    public WebElement televisionsText;

}
