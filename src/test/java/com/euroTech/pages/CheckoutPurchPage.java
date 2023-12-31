package com.euroTech.pages;

import com.euroTech.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPurchPage extends BasePage {
    @FindBy(css = "[id=\"button-payment-address\"]")
    public WebElement continueBillingAddress;

    @FindBy(css = "[id=\"button-shipping-address\"]")
    public WebElement continueDeliveryAddress;

    @FindBy(css = "[id=\"button-shipping-method\"]")
    public WebElement continueDeliveryMethod;

    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement termsAndConditions;

    @FindBy(css = "[id=\"button-payment-method\"]")
    public WebElement continuePaymentMethod;

    @FindBy(xpath = "(//td[.='151.43€']//../td)[2]")
    public WebElement totalPrice;

    @FindBy(css = "[id=\"button-confirm\"]")
    public WebElement confirmButton;


    public void totalPriceWithSymbol(String currency, String symbol) {
        BrowserUtils.scrollToElement(totalPrice);
        if (currency.contains("Euro")) {
            Assert.assertTrue(totalPrice.getText().contains(symbol));
            ;
        } else if (currency.contains(("Pound"))) {
            Assert.assertTrue(totalPrice.getText().contains(symbol));
            ;
        } else if (currency.contains("Dollar")) {
            Assert.assertTrue(totalPrice.getText().contains(symbol));
        }

    }
    @FindBy(xpath = "//input[@id='button-payment-address']")
    public WebElement continueButton;
    @FindBy(xpath = "//input[@id='button-shipping-address']")
    public WebElement continueShippingAddress;
    @FindBy(xpath = "//input[@id='button-shipping-method']")
    public WebElement continueShippingMethod;

    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement checkbox;
    @FindBy(xpath = "//div[@id='content']//p[1]")
    public WebElement successfulOrderMessage;
    @FindBy(xpath = "//div[@class='pull-right']")
    public WebElement continueAfterOrderButton;
}
