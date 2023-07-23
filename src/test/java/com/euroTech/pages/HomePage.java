package com.euroTech.pages;

import com.euroTech.utilities.BrowserUtils;
import com.euroTech.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.concurrent.TimeUnit;
public class HomePage extends BasePage {
    @FindBy(xpath = "//div[text()=' Congratulation! Login Successfully']")
    public WebElement posLoginMessage;
    @FindBy(xpath = " //span[text()='Category']")
    public WebElement Category;
    @FindBy(linkText = "Health & Beauty")
    public WebElement subHealthBeauty;
    @FindBy(linkText = "Televisions")
    public WebElement subTelevisions;
    @FindBy(linkText = "TV Accessories")
    public WebElement subTVAccessories;
    @FindBy(linkText = "Networking")
    public WebElement subNetworking;
    public void clickSubCategory(String subcategory) { // SubCategory lere click yapmak icin olusturuldu.
        switch (subcategory) {
            case "Health_Beauty":
                subHealthBeauty.click();
                break;
            case "Televisions":
                subTelevisions.click();
                break;
            case "TV_Accessories":
                subTVAccessories.click();
                break;
            case "Networking":
                subNetworking.click();
                break;
        }
        Driver.get().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

}

