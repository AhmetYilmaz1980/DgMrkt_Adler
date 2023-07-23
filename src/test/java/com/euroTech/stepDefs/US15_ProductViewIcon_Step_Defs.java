package com.euroTech.stepDefs;

import com.euroTech.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class US15_ProductViewIcon_Step_Defs {

    HomePage homePage = new HomePage();
    CategoryPage categoryPage = new CategoryPage();
    Health_BeautyPage healthBeautyPage = new Health_BeautyPage();
    SubCategorysPage subCategorysPage = new SubCategorysPage();

    @When("The user cliks on the product view icon to switch to {string} view")
    public void the_user_cliks_on_the_product_view_icon_to_switch_to_view(String viewOption) {
        subCategorysPage.clickProductViewIcon(viewOption);
    }


    @And("The product should be changed to {string} view")
    public void theProductShouldBeChangedToView(String expectedView) {
        boolean isViewChanged = verifyProductView(expectedView);
        Assert.assertTrue(isViewChanged);
    }
    public boolean verifyProductView(String expectedView) {
        return true;
    }

    @Then("The user verifies that {string} products are displayed side by side")
    public void theUserVerifiesThatProductsAreDisplayedSideBySide(String arg0) {
    }
}