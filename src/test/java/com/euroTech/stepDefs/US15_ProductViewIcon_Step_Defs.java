package com.euroTech.stepDefs;

import com.euroTech.pages.*;
import com.euroTech.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US15_ProductViewIcon_Step_Defs {

    SubCategorysPage subCategorysPage = new SubCategorysPage();

    @When("The user clicks on the product view icon to switch to {string} view")
    public void the_user_cliks_on_the_product_view_icon_to_switch_to_view(String viewOption) {
        subCategorysPage.clickProductViewIcon(viewOption);
    }
    @Then("The user verifies that {string} products are displayed as viewOption")
    public void theUserVerifiesThatProductsAreDisplayedAs(String activeViewOption) {
        WebElement activeViewIcon = Driver.get().findElement(By.xpath("//button[@class='btn btn-default btn-custom-view " + activeViewOption + " active']")) ;
        Assert.assertTrue( activeViewIcon.isDisplayed());
    }
}