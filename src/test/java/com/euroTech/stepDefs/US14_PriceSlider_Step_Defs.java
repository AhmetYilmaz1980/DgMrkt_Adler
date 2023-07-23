package com.euroTech.stepDefs;

import com.euroTech.pages.SubCategorysPage;
import com.euroTech.pages.HomePage;
import com.euroTech.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US14_PriceSlider_Step_Defs {
    HomePage homePage = new HomePage();
    SubCategorysPage subCategory = new SubCategorysPage();

    @When("The user hover over category and select {string}.")
    public void the_user_hover_over_category_and_select(String subcategory) {
        BrowserUtils.hover(homePage.Category);
        homePage.clickSubCategory(subcategory);
    }

    @Then("The user sees price slider.")
    public void the_user_sees_price_slider() {
        BrowserUtils.verifyElementDisplayed(subCategory.priceSlider);
    }

    @When("The user slides the left end of the price slider to the right.")
    public void the_user_slides_the_left_end_of_the_price_slider_to_the_right() {
        subCategory.moveSlider(subCategory.sliderLeft, "right");
    }

    @Then("The user sees that the min value of the price slider has increased.")
    public void the_user_sees_that_the_min_value_of_the_price_slider_has_increased() {
        subCategory.verifyMinValueIncreased();
    }

    @When("The user slides the left end of the price slider to the left.")
    public void the_user_slides_the_left_end_of_the_price_slider_to_the_left() {
        subCategory.moveSlider(subCategory.sliderLeft, "right");
        subCategory.moveSlider(subCategory.sliderLeft, "right");
        subCategory.moveSlider(subCategory.sliderLeft, "left");
    }

    @Then("The user sees that the min value of the price slider has decreased.")
    public void the_user_sees_that_the_min_value_of_the_price_slider_has_decreased() {
        subCategory.verifyMinValueDecreased();
    }

    @When("The user slides the right end of the price slider to the left.")
    public void the_user_slides_the_right_end_of_the_price_slider_to_the_left() {
        subCategory.moveSlider(subCategory.sliderRight, "left");
    }

    @Then("The user sees that the max value of the price slider has decreased.")
    public void the_user_sees_that_the_max_value_of_the_price_slider_has_decreased() {
        subCategory.verifyMaxValueDecreased();
    }

    @When("The user slides the right end of the price slider to the right.")
    public void the_user_slides_the_right_end_of_the_price_slider_to_the_right() {
        subCategory.moveSlider(subCategory.sliderRight, "left");
        subCategory.moveSlider(subCategory.sliderRight, "left");
        subCategory.moveSlider(subCategory.sliderRight, "right");
    }

    @Then("The user sees that the max value of the price slider has increased.")
    public void the_user_sees_that_the_max_value_of_the_price_slider_has_increased() {
        subCategory.verifyMaxValueIncreased();
    }
}
