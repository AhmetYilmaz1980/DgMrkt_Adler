package com.euroTech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishList extends BasePage {

    @FindBy(xpath = "//*[@href='https://dgmarkt.com/index.php?route=account/wishlist']")
    public WebElement wishList;

    @FindBy(xpath = "//*[@id='content']//table/tbody/tr[1]//td[2]")
    public WebElement firstProduct;

}
