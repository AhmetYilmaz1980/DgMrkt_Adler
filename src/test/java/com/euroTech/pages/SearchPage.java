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

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/h4[1]/a[1]")
    public WebElement resultSearch;

    @FindBy(xpath = "//input[@id='input-search']")
    public WebElement BelowSearchBox;

    @FindBy(xpath = "//select[@name='category_id']")
    public WebElement subCatDDM;

    @FindBy(xpath = "//input[@id='button-search']")
    public WebElement blackSearchButton;

    @FindBy(xpath = "//a[@class='a-top-link']//span[contains(text(),'Home')]")
    public WebElement homePageBut;

    @FindBy(xpath = "//input[@name='sub_category']")
    public WebElement subCatBox;
}
