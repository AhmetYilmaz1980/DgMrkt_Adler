package com.euroTech.pages;

import com.euroTech.utilities.BrowserUtils;
import com.euroTech.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertEquals;

public class PasswordChangePage extends BasePage {
    AccountPage accountPage = new AccountPage();

    @FindBy(xpath = "//a[text()='Change Password']")
    public WebElement changePasswordText;
    @FindBy(id = "input-password")
    public WebElement passwordInput;
    @FindBy(id = "input-confirm")
    public WebElement passwordInputConfirm;
    @FindBy(css = "[value='Continue']")
    public WebElement continueButton;
    @FindBy(css = "//div[contains(text(),'must be between')]")
    public WebElement passwordWarningMessage;
    @FindBy(css = "//div[contains(text(),'not match')]")
    public WebElement confirmdWarningMessage;
    @FindBy(xpath = "//div[contains(text(),'Success')]")
    public WebElement succesMessage;

    public void changePassword(String password, String confirm) {
        passwordInput.sendKeys(password);
        passwordInputConfirm.sendKeys(confirm);
        continueButton.click();
    }

    public void verifyChangePasswordPage() {
        BrowserUtils.verifyElementDisplayed(changePasswordText);
    }

    public void verifyChangePasswordSucces() {
        BrowserUtils.verifyElementDisplayed(succesMessage);
    }

    /**Reset Password -
     * am Anfang um keinen Fehler (Negative Benachrichtigungen) zu bekommen
     * muss man Password credentials erneuern - zürücksetzen
     */
    public void resetPassword() {
        accountPage.selectButtonFromAccountPage("Password");
        passwordInput.sendKeys(ConfigurationReader.get("emailPassword"));
        passwordInputConfirm.sendKeys(ConfigurationReader.get("emailPassword"));
        continueButton.click();
    }

    /**VerifyWarningMessages
     * mit einem step gibt es 2 warning messages
     * um es zu handeln muss man diese 'if' structure erstellen
     */
    public void verifyWarningMessage(String passwordWarning, String comfirmWarning) {

        if (passwordInput != null && passwordInputConfirm == null) {
            assertEquals(comfirmWarning, confirmdWarningMessage.getText());
        }

        if (passwordInput == null && passwordInputConfirm != null) {
            assertEquals(comfirmWarning, confirmdWarningMessage.getText());
            assertEquals(passwordWarning, passwordWarningMessage.getText());
        }

        if (passwordInput == null && passwordInputConfirm == null) {
            assertEquals(passwordWarning, passwordWarningMessage.getText());
        }
    }
}
