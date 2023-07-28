package com.euroTech.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends BasePage{

    @FindBy(xpath = "//span[normalize-space()='My Account']")
    public WebElement myAccountDDM;

    @FindBy(xpath = "//a[@id='pt-logout-link']")
    public WebElement logoutDDM;

    @FindBy(xpath = "//h2[normalize-space()='Account Logout']")
    public WebElement logoutVerify;

    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right pt-account']//a[normalize-space()='My Account']")
    public WebElement myAccountDDM2;

    @FindBy(xpath = "//a[@class='list-group-item'][normalize-space()='Logout']")
    public WebElement myAccountPageLogout;

    @FindBy(xpath = "//h1[normalize-space()='Account Logout']")
    public WebElement myAccountPageLogoutVerify;



}
