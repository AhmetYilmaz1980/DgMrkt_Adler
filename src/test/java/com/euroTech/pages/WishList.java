package com.euroTech.pages;

import com.euroTech.utilities.BrowserUtils;
import com.euroTech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WishList extends BasePage { @FindBy(xpath = "//*[@href='https://dgmarkt.com/index.php?route=account/wishlist']")
public WebElement wishList;

    @FindBy(xpath = "//*[@id='content']//table/tbody/tr[1]//td[2]")
    public WebElement firstProduct;

    @FindBy(xpath = "//div[@id='content']")
    public WebElement wishTable;

    @FindBy(xpath = "//button[@onclick=\"cart.add('5668257');\"]")
    public WebElement product1;

    @FindBy(partialLinkText = "https://dgmarkt.com/index.php?route=product/product&product_id")
    public WebElement product;

    @FindBy(xpath = "//i[@class = 'fa fa-shopping-cart']")
    public WebElement cartBtn;

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/table/tbody/tr[2]/td[2]/a")
    public WebElement product2;

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/table/tbody/tr[2]/td[6]/a")
    public WebElement deleteButton;


    public void wishBtn() {
        wishList.click();
    }

    public void assertProduct() {

        String firstProduct = "Capsule Plate 6pcs"; //  I made add product, assign it to string
        String secondProduct = "BaByliss 3663U - Hair rollers";

        // how many product in wish list
        List<WebElement> listOfProduct = Driver.get().findElements(By.xpath("//i[@class='fa fa-times']"));
        int sizeOfList = listOfProduct.size();
        System.out.println("the number of product: " + sizeOfList);
    }

    public void verifyCart() {
        try {
            product1.click();
            BrowserUtils.waitFor(2);
            //wishList.cartBtn.click();
            Thread.sleep(5000);
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
                System.out.println("'" + productName + "' ürün cart'a eklenmiş.");
            } else {
                System.out.println("'" + productName + "' ürün cart'a eklenmemiş.");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clickDeleteButton() {
        // product2.click();
        deleteButton.click();
    }

    public void updateWishlist(){
        Driver.get().navigate().refresh();
    }

    public boolean verifyProductDeleted() {
        WebElement deletedItem = product2;
        return deletedItem.isDisplayed();
    }
}

