package com.euroTech.pages;

import com.euroTech.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoryPage extends BasePage {

    @FindBy(xpath = "//span[text()='Category']")
    public WebElement categoryButton;
}
