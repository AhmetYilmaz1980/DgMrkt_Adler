package com.euroTech.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SearchPage extends BasePage{

    @FindBy(xpath = "//div[@class='dropdown-toggle search-button']")
    public WebElement searchButtonIcon;

    @FindBy(xpath = "//input[@id='text-search']")
    public WebElement searchTextBox;

    @FindBy(xpath = "//button[@id='btn-search-category']")
    public WebElement searchTextBoxButton;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/h1[1]")
    public WebElement resultSearch;
}
