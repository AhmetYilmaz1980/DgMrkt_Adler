package com.euroTech.stepDefs;

import com.euroTech.pages.AccountPage;
import com.euroTech.pages.EditInfoPage;
import com.euroTech.pages.LoginPage;
import com.euroTech.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


public class US08_AccountPageStepDefs {
    AccountPage accountPage = new AccountPage();
    LoginPage loginPage = new LoginPage();
    EditInfoPage editInfoPage = new EditInfoPage();

    @Then("The user clicks {string} from MyAccountButton")
    public void the_user_clicks_from_account_button(String selectedButton) {accountPage.selectButton(selectedButton);
    }
    @Then("The user logs into DgMrkt with valid credentials")
    public void the_user_logs_into_dg_mrkt_with_valid_credentials() {
       loginPage.login(ConfigurationReader.get("email"),ConfigurationReader.get("emailPassword"));
    }
    @Then("Verify that the user is on the AccountPage")
    public void verify_that_the_user_is_on_the_account_page() {
       accountPage.verifyAccountPage();
    }
    @And("The user clicks {string} from AccountPage")
    public void the_user_clicks_from_accountPage(String selectedButton) {
        accountPage.selectButtonFromAccountPage(selectedButton);
    }
    @Then("Verify that the user is on the Edit Information Page")
    public void verify_that_the_user_is_on_the_edit_information_page() {
        editInfoPage.verifyEditInformationPage();
    }
}
