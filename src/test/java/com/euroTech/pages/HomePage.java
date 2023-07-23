package com.euroTech.pages;
import com.euroTech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    @FindBy(xpath = "//div[text()=' Congratulation! Login Successfully']")
    public WebElement posLoginMessage;


    @FindBy (xpath = "//button[@class='button-cart'][contains(@onclick,'5736703')]")
    public WebElement addProductHomepage;
    
    public WebElement addNumerousProducts(String product){
        return Driver.get().findElement(By.xpath("//button[@class='button-cart'][contains(@onclick,'"+product+"')]"));
    }
    @FindBy (xpath = "//div[@id='cart']")
    public WebElement cartIcon;


}
