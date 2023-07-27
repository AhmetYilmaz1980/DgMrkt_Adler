package com.euroTech.stepDefs;

import com.euroTech.pages.*;
import com.euroTech.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US04_CurrencyFuncitionality_Step_Defs {

    HomePage homePage = new HomePage();

    ProductDetailPage productDetailPage= new ProductDetailPage();

    SecurityPage securityPage = new SecurityPage();

    CheckoutPage checkoutPage=new CheckoutPage();

    OrderPlacedPage orderPlacedPage= new OrderPlacedPage();

    @When("The user clicks currency button and selects {string}")
    public void the_user_clicks_currency_button_and_selects(String currency) {
        homePage.setCurrency(currency);
    }

    @When("The user should close the advertisement tab")
    public void the_user_should_close_the_advertisement_tab() {
        securityPage.newsLetterClosedButton.click();
    }

    @Then("The user scrolls down the page and should be able to see products with {string} of {string}")
    public void the_user_scrolls_down_the_page_and_should_be_able_to_see_products_with_of(String currency, String symbol) {
        homePage.productPriceWithSymbol(currency, symbol);
    }

    @Then("The user clicks on a product\\(TV)")
    public void the_user_clicks_on_a_product_tv() {
        homePage.productTV.click();
    }
    @Then("The user clicks on add to cart button and close the success transaction tab")
    public void the_user_clicks_on_add_to_cart_button_and_close_the_success_transaction_tab() {
        productDetailPage.addToCartBtn.click();
        productDetailPage.successCloseBtn.click();
    }
    @Then("The user scrolls up the basket icon and clicks on it")
    public void the_user_scrolls_up_the_basket_icon_and_clicks_on_it() {
       BrowserUtils.scrollToElement(productDetailPage.basketIcon);
       productDetailPage.basketIcon.click();
    }
    @Then("The user clicks checkout button and should be able to see checkout page")
    public void the_user_clicks_checkout_button_and_should_be_able_to_see_checkout_page() {
       productDetailPage.checkoutBtn.click();
    }
    @Then("The user clicks on continue button with existing address on billing and delivery details tabs")
    public void the_user_clicks_on_continue_button_with_existing_address_on_billing_and_delivery_details_tabs() {
        BrowserUtils.waitFor(2);
        checkoutPage.continueBillingAddress.click();
        checkoutPage.continueDeliveryAddress.click();
        BrowserUtils.waitFor(2);
    }
    @Then("The user clicks on continue button on delivery method tab")
    public void the_user_clicks_on_continue_button_on_delivery_method_tab() {
        checkoutPage.continueDeliveryMethod.click();
        BrowserUtils.waitFor(2);
    }
    @Then("The user clicks on continue and terms &condition button on payment method tab")
    public void the_user_clicks_on_continue_and_terms_condition_button_on_payment_method_tab() {
        checkoutPage.termsAndConditions.click();
        checkoutPage.continuePaymentMethod.click();
        BrowserUtils.waitFor(2);
    }
    @When("The user should be able to be see total price with {string} of {string} and clicks on confirm order button")
    public void the_user_should_be_able_to_be_see_total_price_with_of_and_clicks_on_confirm_order_button(String currency, String symbol) {
        checkoutPage.totalPriceWithSymbol(currency,symbol);
        checkoutPage.confirmButton.click();
        BrowserUtils.waitFor(2);
    }
    @Then("The user should be able to see that the order has been placed message")
    public void the_user_should_be_able_to_see_that_the_order_has_been_placed_message() {
        BrowserUtils.verifyElementDisplayed(orderPlacedPage.orderPlacedMessage);
    }

    @Then("The user scrolls down the page and should be able to see products")
    public void theUserScrollsDownThePageAndShouldBeAbleToSeeProducts() {
        BrowserUtils.scrollToElement(homePage.productTV);
    }

    @And("The user scrolls up to currency button and selects {string}")
    public void theUserScrollsUpToCurrencyButtonAndSelects(String currency) {
        BrowserUtils.scrollToElement(homePage.currencyButton);
        homePage.setCurrency(currency);
    }
}




