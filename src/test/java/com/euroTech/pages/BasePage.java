package com.euroTech.pages;

import com.euroTech.utilities.BrowserUtils;
import com.euroTech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "// span [text()='My Account']")
    public WebElement myAccountButton;

    @FindBy (xpath = "// a[text()='Login']")
    public WebElement loginButton;

    @FindBy(xpath= "//span[text()='My Account']")
    public WebElement accountButton;

    public void selectButton(String buttonName){
        accountButton.click();
        BrowserUtils.waitFor(1);
        try {
            Driver.get().findElement(By.xpath("//a[text()='Login']/../../li/a[text()='"+buttonName+"']")).click();
        }catch(Exception e){
            Driver.get().findElement(By.xpath("//a[text()='My Account']/../../li/a[text()='"+buttonName+"']")).click();}
    }

}
