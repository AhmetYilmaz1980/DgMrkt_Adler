package com.euroTech.pages;

import com.euroTech.utilities.BrowserUtils;
import com.euroTech.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class CategoryPage extends BasePage {
    Actions moveSlider = new Actions(Driver.get());
    @FindBy(className = "filter-price") //Price Slider i görmek icin
    public WebElement priceSlider;
    @FindBy(xpath = "//span[starts-with(@class,\'ui-slider-handle\')]/../span[1]")
    public WebElement sliderLeft; // Sliderin hareketli sol ucu
    @FindBy(xpath = "//span[starts-with(@class,\'ui-slider-handle\')]/../span[2]")
    public WebElement sliderRight;// Sliderin hareketli sag ucu
    @FindBy(id = "price-from")
    public WebElement minValue;
    @FindBy(id = "price-to")
    public WebElement maxValue;
    @FindBy(id = "price-from")
    public WebElement inputMinValue;
    @FindBy(id = "price-to")
    public WebElement inputMaxValue;

    public void moveSlider(WebElement slider, int slideValue) {
        //Actions moveSlider = new Actions(Driver.get()); yukari class düzeyine  aldim
        moveSlider.dragAndDropBy(slider, slideValue, 0).build().perform();
        BrowserUtils.waitForPageToLoad(10);
    }
    public void moveSliderForMetod (WebElement slider, String direction) {

        if (direction == "left") {
            for (int i=0;i<100;i+=10){
                slider.sendKeys(Keys.ARROW_LEFT);
                //BrowserUtils.waitFor(1);
                //Driver.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            }
        }else if (direction=="right"){
            for (int i=0;i<100;i+=10){
                slider.sendKeys(Keys.ARROW_RIGHT);
                //BrowserUtils.waitFor(1);
            }
        }
    }
   /* public void moveSliderRight50(WebElement slider) {
        //Actions moveSlider = new Actions(Driver.get()); yukari class düzeyine  aldim
        moveSlider.dragAndDropBy(slider, 100, 0).build().perform();
        BrowserUtils.waitForPageToLoad(10);
    }

    */

   /* public void moveSliderLeft100(WebElement slider) {
        //Actions moveSlider = new Actions(Driver.get());
        moveSlider.dragAndDropBy(slider, -100, 0).build().perform();
        BrowserUtils.waitForPageToLoad(10);
    }

    public void moveSliderLeft50(WebElement slider) {
        //Actions moveSlider = new Actions(Driver.get());
        moveSlider.dragAndDropBy(slider, -50, 0).build().perform();
        BrowserUtils.waitForPageToLoad(10);
    }

    */

    public void verifyIncreased(WebElement slider, WebElement inputValue) {
        Driver.get().navigate().refresh();
        BrowserUtils.waitForPageToLoad(5);
        Integer ersteValue = Integer.valueOf(inputValue.getAttribute("value"));
        System.out.println("ersteValue = " + ersteValue);
        moveSlider(slider,100);
        Integer secondValue = Integer.valueOf(inputValue.getAttribute("value"));
        System.out.println("secondValue = " + secondValue);
        Assert.assertTrue(ersteValue < secondValue);
        Driver.get().navigate().refresh();

    }

    public void verifyDecreased(WebElement slider, WebElement inputValue) {
        Driver.get().navigate().refresh();
        BrowserUtils.waitForPageToLoad(10);
        Integer ersteValue = Integer.valueOf(inputValue.getAttribute("value"));
        System.out.println("ersteValue = " + ersteValue);
        moveSlider(slider,-100);
        BrowserUtils.waitFor(15);
        Integer secondValue = Integer.valueOf(inputValue.getAttribute("value"));
        System.out.println("secondValue = " + secondValue);
        Assert.assertTrue(ersteValue > secondValue);
    }
}
