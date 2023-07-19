package com.euroTech.stepDefs;

import com.euroTech.pages.Health_BeautyPage;
import com.euroTech.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US16_ProductCompareFunction_Step_Defs {

    Health_BeautyPage healthBeautyPage = new Health_BeautyPage();


    @When("The user hover over to Category button")
    public void the_user_hover_over_to_category_button() {
    }

    @Then("The user clicks to {string} button")
    public void the_user_clicks_to_button(String category) {
        healthBeautyPage.openProductPage(category);
    }

    @When("The user scroll to Products and hover over to {string} Product")
    public void the_user_scroll_to_products_and_hover_over_to_product(String product) {
        healthBeautyPage.click(Integer.parseInt(product));
    }

    @Then("The user should be able to see and click Compare this Product button")
    public void the_user_should_be_able_to_see_and_click_button() {

    }

    @And("The user should be able to see success message")
    public void the_user_should_be_able_to_see_success_message() {
        BrowserUtils.waitFor(2);
        Assert.assertTrue(healthBeautyPage.succesMessage.isDisplayed());
    }


}
