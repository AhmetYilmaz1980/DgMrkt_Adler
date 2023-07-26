package com.euroTech.stepDefs;

import com.euroTech.pages.*;
import com.euroTech.utilities.BrowserUtils;
import com.euroTech.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class US07_CartIconFunctionality_Step_Defs {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    CartIcon cartIcon = new CartIcon();
    CheckOutPage checkOutPage = new CheckOutPage();
    SecurityPage securityPage= new SecurityPage();


    @Then("The user is able to see the product added to the cart")
    public void the_user_is_able_to_see_the_product_added_to_the_cart() {
        BrowserUtils.verifyElementDisplayed(cartIcon.firstProduct);

    }

    @When("The user is able to add a product to the cart")
    public void the_user_is_able_to_add_a_to_the_cart() {
        homePage.addProductHomepage.click();

    }

    @Then("The user is able to click the Cart Icon")
    public void the_user_is_able_to_click_the_cart_icon() {
        homePage.cartIcon.click();

    }


    @Then("The user is able to receive a verify message that there isn't any product in the cart.")
    public void the_user_is_able_to_receive_a_there_isn_t_any_product_in_the_cart() {
        String expectedMessage = "Your shopping cart is empty!";
        BrowserUtils.waitFor(2);
        Assert.assertEquals(cartIcon.emptyCart.getText(), expectedMessage);

    }

    @Then("The user is able to click the view cart button on the side window")
    public void the_user_is_able_to_click_the_view_cart_button_on_the_side_window() {
        cartIcon.viewCartIcon.click();
        BrowserUtils.waitFor(3);
    }

    @Then("The user is able to navigate to the shopping cart page")
    public void the_user_is_able_to_navigate_to_the_shopping_cart_page() {
        String expectedUrl = "https://dgmarkt.com/index.php?route=checkout/cart";
        System.out.println("Actual Url: " + Driver.get().getCurrentUrl());
        Assert.assertEquals(Driver.get().getCurrentUrl(), expectedUrl);

    }

    @Then("The user is able to navigate to {string}")
    public void the_user_is_able_to_navigate_to(String subcategiories) {
        cartIcon.subcategories(subcategiories);

    }

    @Then("The user is able to add {string} to the cart")
    public void the_user_is_able_to_add_to_the_cart(String products) {
        cartIcon.addProducts(products);

    }

    @And("The user is able to see the check out button")
    public void the_user_is_able_to_see_the_check_out_button() {
        BrowserUtils.verifyElementDisplayed(cartIcon.checkOutButton);
    }

    @Then("The user is able to navigate to shopping cart by clicking the check out button")
    public void the_user_is_able_to_navigate_to_shopping_cart_by_clicking_the_check_out_button() {
        cartIcon.checkOutButton.click();
        BrowserUtils.waitFor(2);
        String expectedUrl = "https://dgmarkt.com/index.php?route=checkout/checkout";
        Assert.assertEquals(Driver.get().getCurrentUrl(), expectedUrl);

        Assert.assertTrue(Driver.driver.getCurrentUrl().contains("route=checkout/checkout"));
    }

    @Then("The user is able to continue to checkout to order the products")
    public void the_user_is_able_to_continue_to_checkout_to_order_the_products() {

        checkOutPage.continueButton.click();
        BrowserUtils.waitFor(2);
        checkOutPage.continueShippingAddress.click();
        BrowserUtils.waitFor(2);
        checkOutPage.continueShippingMethod.click();
        BrowserUtils.waitFor(2);
        checkOutPage.checkbox.click();
        BrowserUtils.waitFor(2);
        checkOutPage.continuePaymentMethod.click();
        BrowserUtils.waitFor(2);
        checkOutPage.confirmButton.click();
        BrowserUtils.waitFor(3);

        String expectedUrl = "https://dgmarkt.com/index.php?route=checkout/success";
        Assert.assertEquals(expectedUrl, Driver.get().getCurrentUrl());
        BrowserUtils.verifyElementDisplayed(checkOutPage.successfulOrderMessage);
        checkOutPage.continueAfterOrderButton.click();
        securityPage.newsLetterClosedButton.click();
        String homePageUrl="https://dgmarkt.com/";
        Assert.assertEquals(homePageUrl,Driver.get().getCurrentUrl());


    }
}
