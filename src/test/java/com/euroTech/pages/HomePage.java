package com.euroTech.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    @FindBy(xpath = "//div[text()=' Congratulation! Login Successfully']")
    public WebElement posLoginMessage;

    @FindBy(xpath = "//span[.='Televisions']")
    public WebElement televisions;

    @FindBy(xpath = "//p[.='151.43€']//../p")
    public WebElement priceTV;



}
