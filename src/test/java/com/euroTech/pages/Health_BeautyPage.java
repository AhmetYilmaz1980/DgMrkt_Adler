package com.euroTech.pages;

import com.euroTech.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class Health_BeautyPage extends BasePage {

    TVAccessoriesPage tvAccessoriesPage = new TVAccessoriesPage();
    TelevisionsPages televisionsPages = new TelevisionsPages();
    NetworkingPage networkingPage = new NetworkingPage();
    CategoryPage categoryPage = new CategoryPage();

    @FindBy(xpath = "//a[@id='compare-total']")
    public WebElement productCompareButton;

    @FindBy(xpath = "//h1[text()='Product Comparison']")
    public WebElement productComparisonText;

    @FindBy(xpath = "(//a[text()='Health & Beauty'])[1]")
    public WebElement healthandBeautyButton;

    @FindBy(xpath = "//*[@id='header']/div[2]/div/div/ul/li[2]/a")
    public WebElement productPageHealthandBeautyBtn;

    @FindBy(xpath = "//button[@class='button-compare']")
    public List<WebElement> beautyCompareButton;

    @FindBy(xpath = "//select[@id='input-limit']")
    public WebElement showButton;

    @FindBy(xpath = "//option[text()='100']")
    public WebElement hundertButton;

    @FindBy(xpath = "//div[@class='alert alert-fix alert-success alert-dismissible']")
    public WebElement succesMessage;
  
    @FindBy(xpath = "//h1[text()='Health & Beauty']")
    public WebElement health_BeautyPage;

    @FindBy(xpath = "//option[text()='Default']")
    public WebElement sortBydefault;

    @FindBy(xpath = "//option[text()='Name (A - Z)']")
    public WebElement nameAZ;

    @FindBy(xpath = "//option[text()='Name (Z - A)']")
    public WebElement nameZA;


    @FindBy(xpath = " //option[text()='Price (Low > High)']")
    public WebElement priceLowHigh;

    @FindBy(xpath = " //option[text()='Price (High > Low)']")
    public WebElement priceHighLow;

    @FindBy(xpath = "//option[text()='Rating (Highest)']")
    public WebElement ratingHighest;

    public void openProductPage(String category) {
        BrowserUtils.hover(categoryPage.categoryButton);
        BrowserUtils.waitFor(2);
        if (category.contains("Health & Beauty")) {
            healthandBeautyButton.click();
        } else if (category.contains("Televisions")) {
            televisionsPages.televisionsButton.click();
        } else if (category.contains("TV Accessories")) {
            tvAccessoriesPage.tvAccessoriesButton.click();
        } else if (category.contains("Networking")) {
            networkingPage.networkingButton.click();
        }
    }
    public void clickCompareButton(int product) {
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(beautyCompareButton.get(product - 1));
    }

    public void openComparePage() {
        productCompareButton.click();
    }
    }