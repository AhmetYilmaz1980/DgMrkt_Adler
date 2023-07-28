package com.euroTech.stepDefs;

import com.euroTech.pages.SubCategorysPage;
import com.euroTech.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US14_PriceSlider_Step_Defs {
    SubCategorysPage subCategorysPage = new SubCategorysPage();
    @Then("The user sees price slider.")
    public void the_user_sees_price_slider() {
        BrowserUtils.verifyElementDisplayed(subCategorysPage.priceSlider);
    }

    @When("The user slides the {string} to the {string}.")
    public void the_user_slides_the_to_the(String priceSlider, String direction) {
        subCategorysPage.moveSlider(priceSlider, direction);
    }
    @Then("The user sees that the value of the {string} changes in proportion to the slider movement {string}.")
    public void the_user_sees_that_the_value_of_the_changes_in_proportion_to_the_slider_movement(String priceSlider, String direction) {
        subCategorysPage.verifyPriceSliderChange(priceSlider,direction);
    }
}
