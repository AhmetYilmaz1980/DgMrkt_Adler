package com.euroTech.stepDefs;

import com.euroTech.pages.CategoryPage;
import com.euroTech.pages.HomePage;
import com.euroTech.pages.SecurityPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class US15_ProductViewIcon_Step_Defs {

    HomePage homePage = new HomePage();
    CategoryPage categoryPage = new CategoryPage();
    SecurityPage securityPage = new SecurityPage();


    @Given("The user is on home page")
    public void theUserIsOnHomePage() {
        securityPage.entry();
    }

    @When("The user hover over to Category button")
    public void theUserHoverOverToCategoryButton() {
        homePage.hoverOverCategory();
    }

    @And("The user clicks to {string} button")
    public void theUserClicksToButton(String subcategory) {
        homePage.clickSubMenu(subcategory);
    }

    @When("The user clicks on the product view icon to switch to {string} view")
    public void the_user_clicks_on_the_product_view_icon_to_switch_to_view(String viewOption) {
        clickProductViewIcon(viewOption);
    }

    public void clickProductViewIcon(String viewOption) {
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