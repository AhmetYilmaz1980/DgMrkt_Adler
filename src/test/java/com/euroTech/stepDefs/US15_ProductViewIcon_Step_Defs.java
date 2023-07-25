package com.euroTech.stepDefs;

import com.euroTech.pages.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US15_ProductViewIcon_Step_Defs {

    SubCategorysPage subCategorysPage = new SubCategorysPage();

    @When("The user clicks on the product view icon to switch to {string} view")
    public void the_user_cliks_on_the_product_view_icon_to_switch_to_view(String viewOption) {
        subCategorysPage.clickProductViewIcon(viewOption);
    }
    @Then("The user verifies that {string} products are displayed as viewOption")
    public void theUserVerifiesThatProductsAreDisplayedAs(String activeViewOption) {
        subCategorysPage.verifyActiveViewOption(activeViewOption);
    }
}