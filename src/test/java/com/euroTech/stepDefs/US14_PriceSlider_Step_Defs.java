package com.euroTech.stepDefs;

import com.euroTech.pages.SubCategorysPage;
import com.euroTech.pages.HomePage;
import com.euroTech.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US14_PriceSlider_Step_Defs {
    HomePage homePage = new HomePage();
    SubCategorysPage subCategorysPage = new SubCategorysPage();
    // Test Case 1
    @When("The user hover over category and select {string}.")
    public void the_user_hover_over_category_and_select(String subcategory) {
        homePage.hoverOverCategory();
       // BrowserUtils.hover(homePage.Category);
        homePage.clickSubMenu(subcategory);
    }

    @Then("The user sees price slider.")
    public void the_user_sees_price_slider() {
        BrowserUtils.verifyElementDisplayed(subCategorysPage.priceSlider);
    }

    @When("The user slides the left end of the price slider to the right.")
    public void the_user_slides_the_left_end_of_the_price_slider_to_the_right() {
        subCategorysPage.moveSlider(subCategorysPage.sliderLeft, "right");
    }

    @Then("The user sees that the min value of the price slider has increased.")
    public void the_user_sees_that_the_min_value_of_the_price_slider_has_increased() {
        subCategorysPage.verifyMinValueIncreased();
    }

    @When("The user slides the left end of the price slider to the left.")
    public void the_user_slides_the_left_end_of_the_price_slider_to_the_left() {
        subCategorysPage.moveSlider(subCategorysPage.sliderLeft, "right");
        subCategorysPage.moveSlider(subCategorysPage.sliderLeft, "right");
        subCategorysPage.moveSlider(subCategorysPage.sliderLeft, "left");
    }

    @Then("The user sees that the min value of the price slider has decreased.")
    public void the_user_sees_that_the_min_value_of_the_price_slider_has_decreased() {
        subCategorysPage.verifyMinValueDecreased();
    }

    @When("The user slides the right end of the price slider to the left.")
    public void the_user_slides_the_right_end_of_the_price_slider_to_the_left() {
        subCategorysPage.moveSlider(subCategorysPage.sliderRight, "left");
    }

    @Then("The user sees that the max value of the price slider has decreased.")
    public void the_user_sees_that_the_max_value_of_the_price_slider_has_decreased() {
        subCategorysPage.verifyMaxValueDecreased();
    }

    @When("The user slides the right end of the price slider to the right.")
    public void the_user_slides_the_right_end_of_the_price_slider_to_the_right() {
        subCategorysPage.moveSlider(subCategorysPage.sliderRight, "left");
        subCategorysPage.moveSlider(subCategorysPage.sliderRight, "left");
        subCategorysPage.moveSlider(subCategorysPage.sliderRight, "right");
    }

    @Then("The user sees that the max value of the price slider has increased.")
    public void the_user_sees_that_the_max_value_of_the_price_slider_has_increased() {
        subCategorysPage.verifyMaxValueIncreased();
    }
    // Test Case 2

    @When("The user scrolls the price slider to a specific price range {int} and {int}")
    public void the_user_scrolls_the_price_slider_to_a_specific_price_range_and(Integer int1, Integer int2) {
subCategorysPage.moveSliderForLoopMetod(20);
    }
    @Then("The products displayed should be within the selected price range")
    public void the_products_displayed_should_be_within_the_selected_price_range() {

    }
}
