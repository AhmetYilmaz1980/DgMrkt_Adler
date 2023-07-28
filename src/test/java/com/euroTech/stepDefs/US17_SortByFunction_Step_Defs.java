package com.euroTech.stepDefs;

import com.euroTech.pages.CategoryPage;
import com.euroTech.pages.Health_BeautyPage;
import com.euroTech.pages.HomePage;
import com.euroTech.pages.SubCategorysPage;
import com.euroTech.utilities.BrowserUtils;
import com.euroTech.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US17_SortByFunction_Step_Defs {
    HomePage homePage = new HomePage();
    CategoryPage categoryPage = new CategoryPage();

    Health_BeautyPage healthBeautyPage = new Health_BeautyPage();

    SubCategorysPage subCategorysPage = new SubCategorysPage();

    @When("The user hover over in category menu")
    public void the_user_hover_over_in_category_menu() {
        homePage.hoverOverCategory();
    }
    @Then("The user clicks subcategory {string}")
    public void the_user_clicks_subcategory(String subMenuName) {
        homePage.clickSubMenu(subMenuName);

    }

    @Then("The user should be able to see sort by in  on the subCategory page {string}")
    public void the_user_should_be_able_to_see_sort_by_in_on_the_sub_category_page(String sortBy) {
        subCategorysPage.sortDropdown(sortBy);
    }
    @Then("The user must have selected {string}")
    public void the_user_must_have_selected(String sortByVerify) {

        subCategorysPage.sortByVerify(sortByVerify);
    }
    @Then("The user should be able to select sort by in  on the subCategory  {string}")
    public void the_user_should_be_able_to_select_sort_by_in_on_the_sub_category(String optionText) {
    subCategorysPage.selectOptions(optionText);

    }
    /// *****************For loop ile Price Range verify
    @When("The user scrolls the price slider to a specific price range {int} and {int}")
    public void the_user_scrolls_the_price_slider_to_a_specific_price_range_and(Integer minValue, Integer maxValue) {
        subCategorysPage.setSpecificPriceRange(minValue, maxValue);
    }

    @Then("Verify that the displayed products are within the selected price range.")
    public void verify_that_the_displayed_products_are_within_the_selected_price_range() {
        subCategorysPage.verifyProduct();

    }
    @Then("Verify that the specified price range {int} and {int} is visible.")
    public void verify_that_the_specified_price_range_is_visible(Integer minValue, Integer maxValue) {
        subCategorysPage.verifySpecifiedPriceRange(minValue, maxValue);

    }


}
