package com.euroTech.pages;

import com.euroTech.pages.BasePage;
import com.euroTech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class  CategoryPage extends BasePage {
    Actions moveSlider = new Actions(Driver.get());
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
    public void moveSliderRight(WebElement slider) {
        //Actions moveSlider = new Actions(Driver.get());
        moveSlider.dragAndDropBy(slider, 110, 0).build().perform();
        Driver.get().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    public void moveSliderLeft(WebElement slider) {
        //Actions moveSlider = new Actions(Driver.get());
        moveSlider.dragAndDropBy(slider, -100, 0).build().perform();
        Driver.get().manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
    }
}
