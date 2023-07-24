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

    @FindBy(xpath = "//div[contains(text(),' Success')]")
    public WebElement removeSuccessMessage;

    @FindBy(xpath = "//input[@value='Add to Cart']")
    public List<WebElement> addCartButton;

    @FindBy(xpath = "//a[@class='btn btn-danger btn-block']")
    public List<WebElement> removeButton;

    @FindBy(xpath = "//a[text()='Product Compare (1)']")
    public WebElement productCompareOne;

    @FindBy(xpath = "//a[text()='Product Compare (2)']")
    public WebElement productCompareTwo;

    @FindBy(xpath = "//a[text()='Product Compare (3)']")
    public WebElement productCompareThree;

    int sayac=0;
    int sayac2=0;


    public void clickAddToCart(){

        if(sayac==0){
            BrowserUtils.clickWithJS(addCartButton.get(0));
            sayac ++;
        } else if (sayac==1) {
            BrowserUtils.clickWithJS(addCartButton.get(1));
            sayac++;
        }else if(sayac==2){
            BrowserUtils.clickWithJS(addCartButton.get(2));
        }

    }

    public void clickRemoveBtn(){
        if(sayac2==0){
            BrowserUtils.clickWithJS(removeButton.get(0));
            sayac2 ++;
        } else if (sayac2==1) {
            BrowserUtils.clickWithJS(removeButton.get(1));
            sayac2++;
        }else if(sayac2==2){
            BrowserUtils.clickWithJS(removeButton.get(0));
        }
    }


    public String getTextProduct(int product){
        return healthBeautyPage.products.get(product).getText();
    }

    public String getCompareProduct(){
        return firstProduct.getText();
    }

    public void equalsProduct(int product){
        Assert.assertEquals(getTextProduct(product),getCompareProduct());
    }

    public void productCompareNum(int num){
        if(num==1){
            Assert.assertTrue(productCompareOne.isDisplayed());
        } else if (num==2) {
            Assert.assertTrue(productCompareTwo.isDisplayed());
        } else if (num==3) {
            Assert.assertTrue(productCompareThree.isDisplayed());
        }
    }



}
