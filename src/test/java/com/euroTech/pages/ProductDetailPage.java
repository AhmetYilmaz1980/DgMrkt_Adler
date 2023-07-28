package com.euroTech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailPage extends BasePage{

    @FindBy(xpath = "//button[.='Add to Cart']")
    public WebElement addToCartBtn;

    @FindBy (xpath = "//button[@class='close']")
    public WebElement successCloseBtn;

    @FindBy (xpath = "(//button[@data-toggle='dropdown'])[3]")
    public WebElement basketIcon;

    @FindBy (xpath = "//strong[.=' Checkout']")
    public WebElement checkoutBtn;


}
