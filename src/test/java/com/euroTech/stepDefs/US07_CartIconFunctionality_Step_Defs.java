package com.euroTech.stepDefs;

import com.euroTech.pages.AccountPage;
import com.euroTech.pages.CartIcon;
import com.euroTech.pages.HomePage;
import com.euroTech.pages.LoginPage;
import com.euroTech.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US07_CartIconFunctionality_Step_Defs {
    HomePage homePage=new HomePage();
    LoginPage loginPage = new LoginPage();
    CartIcon cartIcon=new CartIcon();
    @When("The user is able to add a {string} to the cart")
    public void the_user_is_able_to_add_a_to_the_cart(String product) {
        homePage.addProductHomepage.click();

    }
    @Then("The user is able to click the Cart Icon")
    public void the_user_is_able_to_click_the_cart_icon() {
        homePage.cartIcon.click();

    }
    @Then("The user is able to see the product added to the cart")
    public void the_user_is_able_to_see_the_product_added_to_the_cart() {
        BrowserUtils.verifyElementDisplayed(cartIcon.firstProduct);

    }
}
