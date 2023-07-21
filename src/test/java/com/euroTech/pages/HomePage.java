package com.euroTech.pages;
import com.euroTech.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//div[text()=' Congratulation! Login Successfully']")
    public WebElement posLoginMessage;

    @FindBy(xpath = "//span[.='Televisions']")
    public WebElement televisions;

    @FindBy(xpath = "//p[.='151.43€']//../p")
    public WebElement priceTV;

    @FindBy(css ="[data-src=\"https://dgmarkt.com/image/cache/catalog/afm/image6816615-450x450.jpg\"]" )
    public WebElement productTV;


    public void setCurrency(String currency) {
        currencyButton.click();
        if(currency.contains("Euro")) {
            euroButton.click();}
        else if(currency.contains(("Pound"))){
            poundButton.click();
        } else if (currency.contains("Dollar")) {
            dollarButton.click();
        }
        BrowserUtils.waitFor(2);
    }
    public void productPriceWithSymbol(String currency, String symbol) {
        BrowserUtils.scrollToElement(televisions);
        if(currency.contains("Euro")) {
            Assert.assertTrue(priceTV.getText().contains(symbol));;}
        else if(currency.contains(("Pound"))){
            Assert.assertTrue(priceTV.getText().contains(symbol)); ;
        } else if (currency.contains("Dollar")) {
            Assert.assertTrue(priceTV.getText().contains(symbol));;
        }
    }



}
