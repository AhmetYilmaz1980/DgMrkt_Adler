package com.euroTech.stepDefs;

import com.euroTech.pages.HomePage;
import com.euroTech.pages.LoginPage;
import com.euroTech.pages.WishList;
import com.euroTech.utilities.BrowserUtils;
import com.euroTech.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class US06_WishList_Step_Defs {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    WishList wishList = new WishList();

    @Given("The user logs in to My Account")
    public void the_user_logs_in_to_my_account() {
        loginPage.myAccountButton.click();
        loginPage.loginButton.click();
        loginPage.login("elfgmlk@gmail.com", "Test1234");
    }

    @When("The user clicks on wish list button")
    public void the_user_clicks_on_wish_list_button() {
        BrowserUtils.waitFor(2);
        wishList.wishBtn();
    }

    @Then("The user verifies the product is in wish list")
    public void the_user_verifies_the_product_is_in_wish_list() {
        wishList.firstProduct.click();
        wishList.assertProduct();
    }

    @When("The user sees and clicks cart button")
    public void the_user_sees_and_clicks_cart_button() {
    }

    @Then("The user verify that the product has been added")
    public void the_user_verify_that_the_product_has_been_added() {
        wishList.verifyCart();
    }

    @And("The user scrolls down")
    public void theUserScrollsDown() {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) Driver.get();
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", wishList.product2);
        BrowserUtils.waitFor(2);
    }

    @When("The user sees and clicks delete button")
    public void the_user_sees_and_clicks_delete_button() {
        BrowserUtils.waitFor(2);
        wishList.clickDeleteButton();
    }

    @When("The user updates wishlist")
    public void the_user_updates_wishlist() {
        wishList.updateWishlist();
    }

    @Then("The user verify that the product has been deleted")
    public void the_user_verify_that_the_product_has_been_deleted() {
        boolean isProductDeleted = wishList.verifyProductDeleted();
        Assert.assertTrue(isProductDeleted);
    }
}