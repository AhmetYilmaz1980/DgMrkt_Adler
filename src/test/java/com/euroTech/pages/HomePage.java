package com.euroTech.pages;
import com.euroTech.utilities.BrowserUtils;
import com.euroTech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    @FindBy(xpath = "//div[text()=' Congratulation! Login Successfully']")
    public WebElement posLoginMessage;

    public void hoverOverCategory(){
        WebElement categoryBox = Driver.get().findElement(By.xpath("//span[text()='Category']"));
        BrowserUtils.hover(categoryBox);
    }

      public void clickSubMenu(String subMenuName){
      WebElement subCategory = Driver.get().findElement(By.xpath("//a[text()='"+subMenuName+"']"));
       subCategory.click();
   }
}
