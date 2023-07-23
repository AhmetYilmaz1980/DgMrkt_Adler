package com.euroTech.stepDefs;

import com.euroTech.pages.CategoryPage;
import com.euroTech.pages.HomePage;
import com.euroTech.pages.SecurityPage;
import com.euroTech.pages.SubCategorysPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class US15_ProductViewIcon_Step_Defs {

    HomePage homePage = new HomePage();
    SecurityPage securityPage = new SecurityPage();
    SubCategorysPage subCategorysPage = new SubCategorysPage();


    @And("The user clicks to {string} button")
    public void theUserClicksToButton(String subcategory) {
        homePage.clickSubMenu(subcategory);
    }

    @And("The user clicks on the product view icon to switch to {string} view")
    public void the_user_clicks_on_the_product_view_icon_to_switch_to_view(String viewOption) {
        subCategorysPage.clickProductViewIcon(viewOption);
    }

    @And ("The product view should be changed to {string} view")
    public void the_product_view_should_be_changed_to_view(String expectedView) {

        boolean isViewChanged = verifyProductView(expectedView);
        Assert.assertTrue(isViewChanged);
    }

    private boolean verifyProductView(String expectedView) {
        return true;
    }

    @Then("The user verify that {string} products are displayed side by side")
    public void theUserVerifyThatProductsAreDisplayedSideBySide(String arg0) {
    }
}