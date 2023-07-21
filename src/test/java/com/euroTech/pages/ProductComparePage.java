package com.euroTech.pages;

import com.euroTech.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductComparePage extends BasePage{

    Health_BeautyPage healthBeautyPage = new Health_BeautyPage();

    @FindBy(xpath = "//*[@id='content']/table/tbody[1]/tr[1]/td[2]/a")
    public WebElement firstProduct;


    public String getProductString(int product){
        String s = healthBeautyPage.products.get(product).getText();
        return s;
    }


}
