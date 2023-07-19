package com.euroTech.pages;

import com.euroTech.pages.BasePage;
import com.euroTech.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Health_BeautyPage extends BasePage {

    TVAccessoriesPage tvAccessoriesPage = new TVAccessoriesPage();
    TelevisionsPages televisionsPages = new TelevisionsPages();
    NetworkingPage networkingPage = new NetworkingPage();
    CategoryPage categoryPage = new CategoryPage();


    @FindBy(xpath = "(//a[text()='Health & Beauty'])[1]")
    public WebElement healthandBeautyButton;

    @FindBy(xpath = "//button[@class='button-compare']")
    public List <WebElement> beautyCompareButton;

    @FindBy(xpath = "//div[text()=' to your ']")
    public WebElement succesMessage;


    public void openProductPage(String category){
        BrowserUtils.hover(categoryPage.categoryButton);
        BrowserUtils.waitFor(2);
        if(category.contains("Health & Beauty")){
            healthandBeautyButton.click();
        } else if (category.contains("Televisions")) {
            televisionsPages.televisionsButton.click();
        } else if (category.contains("TV Accessories")) {
            tvAccessoriesPage.tvAccessoriesButton.click();
        } else if (category.contains("Networking")) {
            networkingPage.networkingButton.click();
        }
    }

    public void click(int product){
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(beautyCompareButton.get(product-1));
    }

}
