package com.euroTech.stepDefs;

import com.euroTech.pages.Health_BeautyPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US16_ProductCompareFunction_Step_Defs {

    Health_BeautyPage healthBeautyPage = new Health_BeautyPage();


    @When("The user hover over to Category button")
    public void the_user_hover_over_to_category_button() {
    }

    @Then("The user clicks to {string} button")
    public void the_user_clicks_to_button(String s) {
        healthBeautyPage.openProductPage(s);
    }

    @When("The user scroll to Products and hover over to {string} Product")
    public void the_user_scroll_to_products_and_hover_over_to_product(int i) {

        healthBeautyPage.click(i);
    }

    @Then("The user should be able to see and click {string} button")
    public void the_user_should_be_able_to_see_and_click_button() {

    }

    @And("The user should be able to see success message")
    public void the_user_should_be_able_to_see_success_message() {
    }


}
