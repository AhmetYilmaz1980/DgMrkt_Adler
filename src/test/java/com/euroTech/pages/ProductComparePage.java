package com.euroTech.pages;

import com.euroTech.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductComparePage extends BasePage{

    Health_BeautyPage healthBeautyPage = new Health_BeautyPage();

    @FindBy(xpath = "//*[@id='content']/table/tbody[1]/tr[1]/td[2]/a")
    public WebElement firstProduct;

    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    public WebElement successMessage;

    @FindBy(xpath = "//input[@value='Add to Cart']")
    public List<WebElement> addCartButton;


    public String getProduct(int product){
        return healthBeautyPage.products.get(product).getText();
    }

    public String getCompareProduct(){
        return firstProduct.getText();
    }

    public void equalsProduct(int product){
        Assert.assertEquals(getProduct(product),getCompareProduct());
    }



}
