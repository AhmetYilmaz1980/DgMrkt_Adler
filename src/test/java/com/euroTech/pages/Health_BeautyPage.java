package com.euroTech.pages;

import com.euroTech.pages.BasePage;
import com.euroTech.utilities.BrowserUtils;
import com.euroTech.utilities.Driver;
import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

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

    @FindBy(xpath = "//button[@class='button-compare']")
    public List<WebElement> beautyCompareButton;

    @FindBy(xpath = "//div[@class='caption']")
    public List<WebElement> products;

    @FindBy(xpath = "//select[@id='input-limit']")
    public WebElement showButton;

    @FindBy(xpath = "//option[text()='100']")
    public WebElement yuzButton;

    @FindBy(xpath = "//div[text()=' to your ']")
    public WebElement succesMessage;

    @FindBy(xpath = "//a[text()='2']")
    public WebElement secondPage;

    @FindBy(xpath = "//a[text()='3']")
    public WebElement thirdPage;

    @FindBy(xpath = "//a[text()='4']")
    public WebElement fourthPage;

    @FindBy(xpath = "//a[text()='5']")
    public WebElement fifthPage;

    @FindBy(xpath = "//a[text()='6']")
    public WebElement sixthPage;

    @FindBy(xpath = "//a[text()='7']")
    public WebElement seventhPage;

    @FindBy(xpath = "//a[text()='4']")
    public WebElement eighthPage;

    @FindBy(xpath = "//a[text()='5']")
    public WebElement ninthPage;

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

    public void pageandProductClick(int page, int product) {


        if (page == 1) {
            BrowserUtils.waitFor(2);
            clickCompareButton(product);
        } else if (page == 2) {
            BrowserUtils.clickWithJS(secondPage);
            BrowserUtils.waitFor(2);
            clickCompareButton(product);
        } else if (page == 3) {
            BrowserUtils.clickWithJS(thirdPage);
            BrowserUtils.waitFor(2);
            clickCompareButton(product);
        } else if (page == 4) {
            BrowserUtils.clickWithJS(fourthPage);
            BrowserUtils.waitFor(2);
            clickCompareButton(product);
        } else if (page == 5) {
            BrowserUtils.clickWithJS(fifthPage);
            BrowserUtils.waitFor(2);
            clickCompareButton(product);
        } else if (page == 6) {
            BrowserUtils.clickWithJS(sixthPage);
            BrowserUtils.waitFor(2);
            clickCompareButton(product);
        } else if (page == 7) {
            BrowserUtils.clickWithJS(seventhPage);
            BrowserUtils.waitFor(2);
            clickCompareButton(product);
        } else if (page == 8) {
            BrowserUtils.clickWithJS(eighthPage);
            BrowserUtils.waitFor(2);
            clickCompareButton(product);
        } else if (page == 9) {
            BrowserUtils.clickWithJS(ninthPage);
            BrowserUtils.waitFor(2);
            clickCompareButton(product);
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






