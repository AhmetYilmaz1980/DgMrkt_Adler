package com.euroTech.pages;


import com.euroTech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartIconPage extends BasePage {

    @FindBy(xpath = "//a[text()='eufy C1 Smart Scale White'][1]")
    public WebElement firstProduct;

    @FindBy(xpath = "//*[text()='Your shopping cart is empty!']")
    public WebElement emptyCart;
    @FindBy(xpath = "//a[contains(@href,'checkout/cart')]")
    public WebElement viewCartIcon;

    @FindBy(xpath = "//a[contains(@href,'checkout/checkout')]")
    public WebElement checkOutButton;

    public void subcategories(String subcategory){
        Driver.get().findElement(By.xpath("//a[text()='"+subcategory+"']/parent::h4")).click();
    }
    public  void addProducts(String products){
        Driver.get().findElement(By.xpath("//button[contains(@onclick,'"+products+"')][@title='Add to Cart']")).click();

    }



}

