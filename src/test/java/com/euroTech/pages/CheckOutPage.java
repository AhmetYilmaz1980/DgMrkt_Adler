package com.euroTech.pages;
import com.euroTech.utilities.BrowserUtils;
import com.euroTech.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends BasePage{
    @FindBy(xpath = "//input[@id='button-payment-address']")
    public WebElement continueButton;
    @FindBy(xpath = "//input[@id='button-shipping-address']")
    public WebElement continueShippingAddress;
    @FindBy(xpath = "//input[@id='button-shipping-method']")
    public WebElement continueShippingMethod;
    @FindBy(xpath = "//input[@id='button-payment-method']")
    public WebElement continuePaymentMethod;
    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement checkbox;
    @FindBy(xpath = "//input[@id='button-confirm']")
    public WebElement confirmButton;
    @FindBy(xpath = "//div[@id='content']//p[1]")
    public WebElement successfulOrderMessage;
    @FindBy(xpath = "//div[@class='pull-right']")
    public WebElement continueAfterOrderButton;



}
