package com.euroTech.pages;

import com.euroTech.utilities.BrowserUtils;
import com.euroTech.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage {

    @FindBy(xpath = "//a[text()='Account']")
    public WebElement accountText;
    @FindBy(xpath = "//div[text()=' Success: Your account has been successfully updated.']")
    public WebElement editAccountSuccesMessage;
    @FindBy(xpath = "//i[@class='fa fa-home']")
    public WebElement homeButton;


    public void selectButtonFromAccountPage(String buttonName) {
        Driver.get().findElement(By.xpath("//a[text()='" + buttonName + "']")).click();
    }
    public void verifyAccountPage() {
        BrowserUtils.verifyElementDisplayed(accountText);
    }
    public void verifyEditInfoUpdateSuccess(){
        BrowserUtils.waitForVisibility(editAccountSuccesMessage,2);
        Assert.assertTrue(editAccountSuccesMessage.isDisplayed());
    }
}