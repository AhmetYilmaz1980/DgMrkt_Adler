package com.euroTech.pages;

import com.euroTech.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

    public void hoverCategory() {
        BrowserUtils.hover(Category);
    }

    public void clickSubCategory(String subcategory) {
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

        }

    }

