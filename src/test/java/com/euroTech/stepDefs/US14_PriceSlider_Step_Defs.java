package com.euroTech.stepDefs;

import com.euroTech.pages.CategoryPage;
import com.euroTech.pages.Health_BeautyPage;
import com.euroTech.pages.HomePage;
import com.euroTech.utilities.BrowserUtils;
import com.euroTech.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;

public class US14_PriceSlider_Step_Defs {
    HomePage homePage = new HomePage();
    CategoryPage subCategory =new CategoryPage();


    @When("The user hover over category and select {string}.")
    public void the_user_hover_over_category_and_select(String subcategory) {
        BrowserUtils.hover(homePage.Category);
        Driver.get().manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        homePage.clickSubCategory(subcategory);
    }

    @Then("The user sees price slider")
    public void the_user_sees_price_slider() {
        BrowserUtils.verifyElementDisplayed(subCategory.priceSlider);
        Driver.get().manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
    }

    @Then("The user slides the left end of the price slider to the right")
    public void the_user_slides_the_left_end_of_the_price_slider_to_the_right() {
        subCategory.moveSliderRight(subCategory.sliderLeft);

    }

    @Then("The user sees that the min value of the price slider has increased")
    public void the_user_sees_that_the_min_value_of_the_price_slider_has_increased() {

    }

    @Then("The user slides the left end of the price slider to the left")
    public void the_user_slides_the_left_end_of_the_price_slider_to_the_left() {

    }

    @Then("The user sees that the min value of the price slider has decreased")
    public void the_user_sees_that_the_min_value_of_the_price_slider_has_decreased() {

    }

    @Then("The user slides the right end of the price slider to the left")
    public void the_user_slides_the_right_end_of_the_price_slider_to_the_left() {

    }

    @Then("The user sees that the max value of the price slider has decreased")
    public void the_user_sees_that_the_max_value_of_the_price_slider_has_decreased() {

    }

    @Then("The user slides the right end of the price slider to the right")
    public void the_user_slides_the_right_end_of_the_price_slider_to_the_right() {

    }

}
