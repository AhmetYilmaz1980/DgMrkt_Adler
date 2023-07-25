package com.euroTech.pages;

import com.euroTech.utilities.BrowserUtils;
import com.euroTech.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;

public class SubCategorysPage extends BasePage {
    Actions actions = new Actions(Driver.get());
    @FindBy(id = "input-sort")
    public WebElement sortByBox;
    @FindBy(className = "filter-price")
    public WebElement priceSlider;
    @FindBy(xpath = "//span[starts-with(@class,\'ui-slider-handle\')]/../span[1]")
    public WebElement sliderLeft;
    @FindBy(xpath = "//span[starts-with(@class,\'ui-slider-handle\')]/../span[2]")
    public WebElement sliderRight;
    @FindBy(id = "price-from")
    public WebElement minValue;
    @FindBy(id = "price-to")
    public WebElement maxValue;
    @FindBy(id = "price-from")
    public WebElement inputMinValue;
    @FindBy(id = "price-to")
    public WebElement inputMaxValue;

    public void sortDropdown(String sortBy) {
        WebElement sort = Driver.get().findElement(By.xpath("//option[text()='" + sortBy + "']"));
        Select select = new Select(sortByBox);
        select.selectByVisibleText(sortBy);
        sort.click();
    }

    public void sortByVerify(String sortByVerify) {
        WebElement actuel = Driver.get().findElement(By.xpath("//option[text()='"+sortByVerify+"']"));
        Assert.assertEquals(sortByVerify,actuel.getText());
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
    public void moveSlider(String priceSlider, String direction) {
        WebElement slider;
        if (priceSlider.equals("sliderLeft") ) {
            slider = sliderLeft;
        } else {slider = sliderRight;}
        BrowserUtils.waitFor(3);
        switch (direction) {
            case "right":
                actions.dragAndDropBy(slider, 100, 0).build().perform();
                break;
            case "left":
                actions.dragAndDropBy(slider, 100, 0).build().perform();
                BrowserUtils.waitFor(3);
                actions.dragAndDropBy(slider, -100, 0).build().perform();
                break;
        }
    }
    public void verifyPriceSliderChange(String priceSlider, String direction){
        WebElement slider;
        if (priceSlider.equals("sliderLeft")& direction.equals("right"))  {
            verifyMinValueIncreased();
        } else if (priceSlider.equals("sliderLeft")& direction.equals("left")){
            verifyMinValueDecreased();
        } else if (priceSlider.equals("sliderRight")& direction.equals("left")) {
            verifyMaxValueDecreased();
        } else if (priceSlider.equals("sliderRight")& direction.equals("right")) {
            verifyMaxValueIncreased();
        }
    }
    public void verifyMinValueIncreased() {
        Driver.get().navigate().refresh();
        BrowserUtils.waitForPageToLoad(10);
        Integer ersteValue = Integer.valueOf(inputMinValue.getAttribute("value"));
        System.out.println("AersteValue = " + ersteValue);
        actions.dragAndDropBy(sliderLeft, 100, 0).build().perform();
        BrowserUtils.waitForPageToLoad(10);
        Integer secondValue = Integer.valueOf(inputMinValue.getAttribute("value"));
        System.out.println("secondValue = " + secondValue);
        Assert.assertTrue(ersteValue < secondValue);
    }
    public void verifyMinValueDecreased() {
        Driver.get().navigate().refresh();
        BrowserUtils.waitForPageToLoad(10);
        actions.dragAndDropBy(sliderLeft, 100, 0).build().perform();
        //moveSlider("sliderLeft", "right");
        //moveSlider("sliderLeft", "right");
        BrowserUtils.waitFor(3);
        Integer ersteValue = Integer.valueOf(inputMinValue.getAttribute("value"));
        System.out.println("BersteValue = " + ersteValue);
        actions.dragAndDropBy(sliderLeft, -50, 0).build().perform();
        //moveSlider("sliderLeft", "left");
        BrowserUtils.waitFor(3);
        Integer secondValue = Integer.valueOf(inputMinValue.getAttribute("value"));
        System.out.println("secondValue = " + secondValue);
        Assert.assertTrue(ersteValue > secondValue);
    }
    public void verifyMaxValueDecreased() {
        Driver.get().navigate().refresh();
        BrowserUtils.waitForPageToLoad(5);
        Integer ersteValue = Integer.valueOf(inputMaxValue.getAttribute("value"));
        System.out.println("CersteValue = " + ersteValue);
        actions.dragAndDropBy(sliderRight, -100, 0).build().perform();
        BrowserUtils.waitForPageToLoad(13);
        Integer secondValue = Integer.valueOf(inputMaxValue.getAttribute("value"));
        System.out.println("secondValue = " + secondValue);
        Assert.assertTrue(ersteValue > secondValue);
    }

    public void verifyMaxValueIncreased() {
        Driver.get().navigate().refresh();
        BrowserUtils.waitForPageToLoad(10);
        actions.dragAndDropBy(sliderRight, -100, 0).build().perform();
        BrowserUtils.waitFor(3);
        Integer ersteValue = Integer.valueOf(inputMaxValue.getAttribute("value"));
        System.out.println("DersteValue = " + ersteValue);
        actions.dragAndDropBy(sliderRight, 50, 0).build().perform();
        BrowserUtils.waitFor(3);
        Integer secondValue = Integer.valueOf(inputMaxValue.getAttribute("value"));
        System.out.println("secondValue = " + secondValue);
        Assert.assertTrue(ersteValue < secondValue);
    }

    // elif's view icon


    public void clickProductViewIcon(String viewOption) {

        WebElement viewIcon = Driver.get().findElement(By.xpath("//button[@onclick=\"category_view.changeView('"+viewOption+"')\"]"));
        viewIcon.click();
        BrowserUtils.waitFor(2);
    }

}
