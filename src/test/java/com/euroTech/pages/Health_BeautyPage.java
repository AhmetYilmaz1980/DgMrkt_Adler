package com.euroTech.pages;

import com.euroTech.pages.BasePage;
import com.euroTech.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Health_BeautyPage extends BasePage {

    @FindBy(xpath = "//span[text()='Category']")
    public WebElement categoryButton;

    @FindBy(xpath = "(//a[text()='Health & Beauty'])[1]")
    public WebElement healthandBeautyButton;

    @FindBy(xpath = "(//a[text()='Televisions'])[1]")
    public WebElement televisionsButton;

    @FindBy(xpath = "(//a[text()='TV Accessories'])[1]")
    public WebElement tvAccessoriesButton;

    @FindBy(xpath = "(//a[text()='Networking'])[1]")
    public WebElement networkingButton;

    @FindBy(xpath = "//a[@id='compare-total']")
    public WebElement compareTotalNumber;

    @FindBy(xpath = "//div[@class='product-thumb']" )
    public List <WebElement> beautyProduct;

    @FindBy(xpath = "//button[@class='button-compare']")
    public List <WebElement> beautyCompareButton;

    @FindBy(xpath = "(//button[@class='button-compare'])[2]")
    public WebElement capsuleCompareButton;


    public void openProductPage(String categ){
        BrowserUtils.hover(categoryButton);
        BrowserUtils.waitFor(2);
        if(categ.contains("Health & Beauty")){
            healthandBeautyButton.click();
        } else if (categ.contains("Televisions")) {
            televisionsButton.click();
        } else if (categ.contains("TV Accessories")) {
            tvAccessoriesButton.click();
        } else if (categ.contains("Networking")) {
            networkingButton.click();
        }


    }

    public void click(int num){
        BrowserUtils.waitFor(2);
        BrowserUtils.scrollToElement(beautyProduct.get(num-1));
        BrowserUtils.waitFor(2);
        BrowserUtils.hover(beautyProduct.get(num-1));
        BrowserUtils.waitFor(2);
        beautyCompareButton.get(num-1).click();
    }

}
