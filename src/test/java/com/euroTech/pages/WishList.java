package com.euroTech.pages;

import com.euroTech.utilities.BrowserUtils;
import com.euroTech.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class WishList extends BasePage {

    @FindBy(xpath = "//*[@href='https://dgmarkt.com/index.php?route=account/wishlist']")
    public WebElement wishListIcon;
    @FindBy(xpath = "//*[@id='content']//table/tbody/tr[1]//td[2]")
    public WebElement firstProduct;
    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/table/tbody/tr[2]/td[2]/a")
    public WebElement product2;
    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/table/tbody/tr[2]/td[6]/a")
    public WebElement deleteButton;

    public void wishBtn() {
        wishListIcon.click();
    }

    public void verifyProduct() {
        String firstProduct= "eufy P1 Smart Scale Blue and Black";

        //with getPageSource()
        //assertTrue(Driver.get().getPageSource().contains(firstProduct));

        // how many product in wish list
        List<WebElement> listOfProduct = Driver.get().findElements(By.xpath("//i[@class='fa fa-times']"));
        int sizeOfList = listOfProduct.size();
        System.out.println("the number of product: " + sizeOfList);
    }

    public void verifyCart() {

        List<WebElement> cartItems = Driver.get().findElements(By.xpath("//button[@data-original-title='Add to Cart']"));
        String productName = "Fitbit Aria Air Smart Bathroom Scale";

        boolean found = true;
        for (WebElement element : cartItems) {
            if (element.getText().contains(productName)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("'" + productName + "' ürünü cart'a eklenmiş.");
        } else {
            System.out.println("'" + productName + "' ürünü cart'a eklenmemiş.");
        }
    }

    public void scrollDown(){
        JavascriptExecutor jsExecutor = (JavascriptExecutor) Driver.get();
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", product2);
        BrowserUtils.waitFor(2);
    }

    public void clickDeleteButton() {
        // product2.click();
        deleteButton.click();
    }

    public void updateWishlist() {
        Driver.get().navigate().refresh();
    }

    public void verifyProductDeleted() {
        WebElement deletedItem = product2;
        boolean isProductDeleted = deletedItem.isDisplayed();
        Assert.assertTrue(isProductDeleted);
    }
}