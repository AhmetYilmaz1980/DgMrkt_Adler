package com.euroTech.stepDefs;

import com.euroTech.pages.CartIconPage;
import com.euroTech.pages.HomePage;
import com.euroTech.pages.LoginPage;
import com.euroTech.pages.WishListPage;
import com.euroTech.utilities.BrowserUtils;
import com.euroTech.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class US06_WishList_Step_Defs {

    LoginPage loginPage = new LoginPage();
    WishListPage wishListPage = new WishListPage();
    CartIconPage cartIconPage = new CartIconPage();
    HomePage homePage = new HomePage();

    @Given("The user logs in to My Account")
    public void the_user_logs_in_to_my_account() {
        loginPage.myAccountButton.click();
        loginPage.loginButton.click();
        loginPage.login("elfgmlk@gmail.com", "Test1234");
    }

    @When("The user clicks on wish list button")
    public void the_user_clicks_on_wish_list_button() {
        BrowserUtils.waitFor(2);
        wishListPage.wishBtn();
    }

    @Then("The user verifies the product is in wish list")
    public void the_user_verifies_the_product_is_in_wish_list() {
        wishListPage.verifyProduct();
    }

    @When("The user sees and clicks cart button")
    public void the_user_sees_and_clicks_cart_button() {
    }

    @Then("The user verify that the {string} has been added")
    public void the_user_verify_that_the_product_has_been_added(String productName) {
        wishListPage.verifyCart(productName);
    }

    @And("The user scrolls down")
    public void theUserScrollsDown() {
        wishListPage.scrollDown();
    }

    @When("The user sees and clicks delete button")
    public void the_user_sees_and_clicks_delete_button() {
        wishListPage.clickDeleteButton();
    }

    @When("The user updates wishlist")
    public void the_user_updates_wishlist() {
        wishListPage.updateWishlist();
    }

    @Then("The user verify that the product has been deleted")
    public void the_user_verify_that_the_product_has_been_deleted() {
        wishListPage.verifyProductDeleted();
    }

    @Then("The user is able to add a product to the wish list")
    public void the_user_is_able_to_add_product_to_the_wish_list() {
        wishListPage.productToWishList.click();
    }

    @And("The user clicks cart button on the wish list page")
    public void the_user_clicks_cart_button_on_the_wish_list_page() {
        wishListPage.addToCartIconOnWishListPage.click();

    }

    @Then("The user verifies that the product has been added")
    public void the_user_verifies_that_the_product_has_been_added() {
        wishListPage.cartIconOnTheWishListPage.click();
        BrowserUtils.waitFor(2);
        cartIconPage.viewCartIcon.click();
        BrowserUtils.waitFor(2);
        Assert.assertEquals(wishListPage.productInCartVerification.getText(), wishListPage.addToCartIconOnWishListPage.getText());

    }

    @And("The user clicks remove button to remove the product button")
    public void the_user_clicks_remove_button_to_remove_the_product_button() {
        wishListPage.removeButton.click();
        BrowserUtils.waitFor(2);

    }

    @Then("The user verifies that the product has been deleted")
    public void the_user_verifies_that_the_product_has_been_deleted() {
        BrowserUtils.verifyElementNotDisplayed(By.xpath("//td[@class='text-left']//a"));
    }

}