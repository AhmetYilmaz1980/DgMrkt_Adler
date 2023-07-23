package com.euroTech.pages;

import com.euroTech.utilities.BrowserUtils;
import com.euroTech.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SubCategorysPage extends BasePage{
    @FindBy(id = "input-sort")
    public WebElement sortByBox;
    public void sortDropdown(String sortBy){
        WebElement sort = Driver.get().findElement(By.xpath("//option[text()='"+sortBy+"']"));
        Select select=new Select(sortByBox);
        select.selectByVisibleText(sortBy);
        sort.click();
    }

    public void sortByVerify(String sortByVerify) {
        WebElement actuel = Driver.get().findElement(By.xpath("//option[text()='"+sortByVerify+"']"));
        Assert.assertEquals(sortByVerify,actuel.getText());
    }

    // elif's view icon


    public void clickProductViewIcon(String viewOption) {

        WebElement viewIcon = Driver.get().findElement(By.xpath("//button[@class='btn btn-default btn-custom-view btn-" + viewOption + "']"));
        viewIcon.click();
        BrowserUtils.waitFor(2);
    }


}
