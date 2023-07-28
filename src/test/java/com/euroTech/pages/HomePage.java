package com.euroTech.pages;
import com.euroTech.utilities.BrowserUtils;
import org.junit.Assert;
import com.euroTech.utilities.Driver;
import org.openqa.selenium.By;
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
  
   @FindBy(xpath = "//button[@class='button-cart'][contains(@onclick,'5736703')]")
    public WebElement addProductHomepage;

    @FindBy(xpath = "//div[@id='cart']")
    public WebElement cartIcon;


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

      public void hoverOverCategory() {
        WebElement categoryBox = Driver.get().findElement(By.xpath("//span[text()='Category']"));
        BrowserUtils.hover(categoryBox);
    }

      public void clickSubMenu(String subMenuName){
      WebElement subCategory = Driver.get().findElement(By.xpath("//a[text()='"+subMenuName+"']"));
       subCategory.click();
   }
}
