package com.euroTech.stepDefs;

import com.euroTech.pages.Health_BeautyPage;
import com.euroTech.pages.ProductComparePage;
import com.euroTech.pages.SecurityPage;
import com.euroTech.utilities.BrowserUtils;
import com.euroTech.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class US16_ProductCompareFunction_Step_Defs {

    Health_BeautyPage healthBeautyPage = new Health_BeautyPage();
    SecurityPage securityPage =new SecurityPage();
    ProductComparePage productComparePage = new ProductComparePage();


    @When("The user hover over to Category button")
    public void the_user_hover_over_to_category_button() {

    }

    @Then("The user clicks to {string} button")
    public void the_user_clicks_to_button(String category) {
        healthBeautyPage.openProductPage(category);
    }

    @When("The user should be able to choose {string} and hover over to {string} Product")
    public void the_user_should_be_able_to_choose_and_hover_over_to_product(String page, String product) {
       healthBeautyPage.pageandProductClick(Integer.parseInt(page),Integer.parseInt(product));
    }


    @Then("The user should be able to see and click Compare this Product button")
    public void the_user_should_be_able_to_see_and_click_button() {

    }

    @And("The user should be able to see success message")
    public void the_user_should_be_able_to_see_success_message() {
        BrowserUtils.waitFor(2);
        Assert.assertTrue(healthBeautyPage.succesMessage.isDisplayed());
    }


    @Then("The user click the Product Compare button")
    public void the_user_click_the_button() {
        healthBeautyPage.openComparePage();
    }

    @Then("The user is on the Product Compare Page")
    public void the_user_is_on_the_product_compare_page() {
        Assert.assertTrue(healthBeautyPage.productComparisonText.isDisplayed());
    }

    @Then("The user should be able to see the {string} they want to compare on the Product Comparison page")
    public void the_user_should_be_able_to_see_the_they_want_to_compare_on_the_product_comparison_page(String product) {
        BrowserUtils.waitFor(3);
        productComparePage.getCompareProduct();
        BrowserUtils.waitFor(2);
        productComparePage.equalsProduct(Integer.parseInt(product));

    }

    @When("The user click Show button and choose {int}")
    public void the_user_click_show_button_and_choose(Integer num) {
        healthBeautyPage.showButton.click();
        healthBeautyPage.yuzButton.click();
    }
    @When("The user should be able to hover over to {string} Product")
    public void the_user_should_be_able_to_hover_over_to_product(String product) {
        BrowserUtils.waitFor(2);
            healthBeautyPage.clickCompareButton(Integer.parseInt(product));
          //  productComparePage.getTextProduct(Integer.parseInt(product));
    }

    @Then("The user click the add to cart button for first Product")
    public void the_user_click_the_add_to_cart_button_for_first_product() {
        BrowserUtils.waitFor(2);
        productComparePage.clickAddToCart();
    }
    @Then("The user should be able to see add to cart success message")
    public void the_user_should_be_able_to_see_add_to_cart_success_message() {
        BrowserUtils.waitFor(2);
        Assert.assertTrue(productComparePage.successMessage.isDisplayed());
    }
    @Then("The user click the add to cart button for second Product")
    public void the_user_click_the_add_to_cart_button_for_second_product() {
        BrowserUtils.waitFor(2);
        productComparePage.clickAddToCart();
    }
    @Then("The user click the add to cart button for third Product")
    public void the_user_click_the_add_to_cart_button_for_third_product() {
        BrowserUtils.waitFor(2);
        productComparePage.clickAddToCart();
    }

    @Then("The user click the remove button for first Product")
    public void the_user_click_the_remove_button_for_first_product() {
        BrowserUtils.waitFor(2);
        productComparePage.clickRemoveBtn();
    }
    @Then("The user should be able to see remove success message")
    public void the_user_should_be_able_to_see_remove_success_message() {
        BrowserUtils.waitFor(2);
        Assert.assertTrue(productComparePage.removeSuccessMessage.isDisplayed());
    }
    @Then("The user click the remove button for second Product")
    public void the_user_click_the_remove_button_for_second_product() {
        BrowserUtils.waitFor(2);
        productComparePage.clickRemoveBtn();
    }
    @Then("The user click the remove button for third Product")
    public void the_user_click_the_remove_button_for_third_product() {
        BrowserUtils.waitFor(2);
        productComparePage.clickRemoveBtn();
    }

    @Then("The user should be able to see {string} products next to the product comparison button")
    public void the_user_should_be_able_to_see_products_next_to_the_product_comparison_button(String num) {
        BrowserUtils.waitFor(2);
        productComparePage.productCompareNum(Integer.parseInt(num));
    }

}
