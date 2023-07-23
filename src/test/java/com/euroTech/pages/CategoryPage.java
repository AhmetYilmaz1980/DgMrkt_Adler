package com.euroTech.pages;

import com.euroTech.pages.BasePage;
import com.euroTech.utilities.Driver;
import org.apache.hc.client5.http.impl.DefaultRedirectStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoryPage extends BasePage {

   public void clickSubMenu(String subMenuName){
      WebElement subCategory = Driver.get().findElement(By.xpath("//a[text()='"+subMenuName+"']"));
       subCategory.click();
   }


}
