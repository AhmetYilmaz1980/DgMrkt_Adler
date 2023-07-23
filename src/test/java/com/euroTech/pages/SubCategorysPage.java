package com.euroTech.pages;

import com.euroTech.utilities.BrowserUtils;
import com.euroTech.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SubCategorysPage extends BasePage {
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

    public void moveSlider(WebElement slider,String direction) {
        //Actions moveSlider = new Actions(Driver.get()); yukari class düzeyine  aldim
        switch (direction) {
            case "right":
                moveSlider.dragAndDropBy(slider, 100, 0).build().perform();
                BrowserUtils.waitForPageToLoad(10);
                break;
            case "left":
                BrowserUtils.waitFor(3);
                moveSlider.dragAndDropBy(slider, -100, 0).build().perform();
                BrowserUtils.waitForPageToLoad(10);
        }
    }
//        if (direction=="right"){
//            moveSlider.dragAndDropBy(slider, 100, 0).build().perform();
//            BrowserUtils.waitForPageToLoad(10);
//        }else {
//            moveSlider.dragAndDropBy(slider, -100, 0).build().perform();
//            BrowserUtils.waitForPageToLoad(10);
//        }
//    }
//    public void moveSliderForLoopMetod (WebElement slider, String direction) {
//        if (direction == "left") {
//            for (int i=0;i<100;i+=10){
//                slider.sendKeys(Keys.ARROW_LEFT);
//                //BrowserUtils.waitFor(1);
//                //Driver.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//            }
//        }else if (direction=="right"){
//            for (int i=0;i<100;i+=10){
//                slider.sendKeys(Keys.ARROW_RIGHT);
//                //BrowserUtils.waitFor(1);
//            }
//        }
//    }
    public void verifyMinValueIncreased() {
        Driver.get().navigate().refresh();
        BrowserUtils.waitForPageToLoad(10);
        Integer ersteValue = Integer.valueOf(inputMinValue.getAttribute("value"));
        System.out.println("AersteValue = " + ersteValue);
        moveSlider(sliderLeft,"right");
        BrowserUtils.waitForPageToLoad(10);
        Integer secondValue = Integer.valueOf(inputMinValue.getAttribute("value"));
        System.out.println("secondValue = " + secondValue);
        Assert.assertTrue(ersteValue < secondValue);
        Driver.get().navigate().refresh();
    }
    public void verifyMinValueDecreased() {
        Driver.get().navigate().refresh();
        BrowserUtils.waitForPageToLoad(10);
        moveSlider(sliderLeft,"right");
        BrowserUtils.waitFor(3);
        moveSlider(sliderLeft,"right");
        BrowserUtils.waitFor(3);
        Integer ersteValue = Integer.valueOf(inputMinValue.getAttribute("value"));
        System.out.println("BersteValue = " + ersteValue);
        moveSlider(sliderLeft,"left");
        BrowserUtils.waitFor(3);
        Integer secondValue = Integer.valueOf(inputMinValue.getAttribute("value"));
        System.out.println("secondValue = " + secondValue);
        Assert.assertTrue(ersteValue > secondValue);
        Driver.get().navigate().refresh();
    }
    public void verifyMaxValueDecreased() {
        Driver.get().navigate().refresh();
        BrowserUtils.waitForPageToLoad(5);
        Integer ersteValue = Integer.valueOf(inputMaxValue.getAttribute("value"));
        System.out.println("CersteValue = " + ersteValue);
        moveSlider(sliderRight,"left");
        BrowserUtils.waitForPageToLoad(5);
        Integer secondValue = Integer.valueOf(inputMaxValue.getAttribute("value"));
        System.out.println("secondValue = " + secondValue);
        Assert.assertTrue(ersteValue > secondValue);
        Driver.get().navigate().refresh();

    }  public void verifyMaxValueIncreased() {
        Driver.get().navigate().refresh();
        BrowserUtils.waitForPageToLoad(10);
        moveSlider(sliderRight,"left");
        BrowserUtils.waitFor(3);
        moveSlider(sliderRight,"left");
        BrowserUtils.waitFor(3);
        Integer ersteValue = Integer.valueOf(inputMaxValue.getAttribute("value"));
        System.out.println("DersteValue = " + ersteValue);
        moveSlider(sliderRight,"right");
        BrowserUtils.waitFor(3);
        Integer secondValue = Integer.valueOf(inputMaxValue.getAttribute("value"));
        System.out.println("secondValue = " + secondValue);
        Assert.assertTrue(ersteValue < secondValue);
        Driver.get().navigate().refresh();
    }


}
