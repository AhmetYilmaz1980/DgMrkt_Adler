package com.euroTech.pages;

import com.euroTech.utilities.BrowserUtils;
import com.euroTech.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class SubCategorysPage extends BasePage {
    @FindBy(id = "input-sort")
    public WebElement sortByBox;

    public void sortDropdown(String sortBy) {
        WebElement sort = Driver.get().findElement(By.xpath("//option[text()='" + sortBy + "']"));
        Select select = new Select(sortByBox);
        select.selectByVisibleText(sortBy);
        sort.click();
    }

    public void sortByVerify(String sortByVerify) {
        WebElement actuel = Driver.get().findElement(By.xpath("//option[text()='" + sortByVerify + "']"));
        Assert.assertEquals(sortByVerify, actuel.getText());
    }


    public void selectOptions(String optionsText) {
        BrowserUtils.waitFor(7);
        WebElement dropdownElement = Driver.get().findElement(By.id("input-sort"));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText(optionsText);
       // BrowserUtils.waitFor(2);
        String actualOption = dropdown.getFirstSelectedOption().getText();
       System.out.println("actualOption = " + actualOption);
        System.out.println("optionsText = " + optionsText);
        Assert.assertEquals(optionsText, actualOption);
    }


}
