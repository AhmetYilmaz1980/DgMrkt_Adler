package com.euroTech.pages;



import com.euroTech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RegisterAccountPage extends BasePage {
    @FindBy(id = "input-firstname")
    public WebElement firstNameInput;
    @FindBy(id = "input-lastname")
    public WebElement lastNameInput;
    @FindBy(id = "input-register-email")
    public WebElement emailInput;
    @FindBy(id = "input-telephone")
    public WebElement telephoneInput;
    @FindBy(id = "input-register-password")
    public WebElement passwordInput;
    @FindBy(id = "input-confirm")
    public WebElement confirmPasswordInput;
    @FindBy(xpath = "//input[@name='agree']")
    public WebElement privacyPolicyBtn;
    @FindBy(xpath = "//*[@id='ajax-register-form']/div/div/input[2]")
    public WebElement registerContinueBtn;
    @FindBy(xpath = "//*[@id='content']/div[1]/div/div/div/div/div/div[3]/div[3]/div/div/div/div[1]")
    public WebElement yourAccountHasBeenCreated;
    @FindBy(xpath = "//span[text()='Continue']")
    public WebElement continueBtn;
    @FindBy(xpath = "//h2[text()='My Account']")
    public WebElement myAccount;
    @FindBy(xpath = "//span[text()=' Warning: You must agree to the Privacy Policy!']")
    public WebElement privacyPolicy;

    public void register(String firstName, String lastName, String email, String telephone, String password, String passwordConfirm) {
        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        emailInput.sendKeys(email);
        telephoneInput.sendKeys(telephone);
        passwordInput.sendKeys(password);
        confirmPasswordInput.sendKeys(passwordConfirm);
    }

    public void subscribeAndPrivacyPolicy(String yesNo) {
        Driver.get().findElement(By.xpath("//label[text()='" + yesNo + "']")).click();
        privacyPolicyBtn.click();
    }

    public String assertion(String message) {
        String actualMessage = null;
        if (message.contains("First Name")) {
            actualMessage = Driver.get().findElement(By.xpath("//div[text()='" + message + "']")).getText();
        } else if (message.contains("Last Name")) {
            actualMessage = Driver.get().findElement(By.xpath("//div[text()='" + message + "']")).getText();
        } else if (message.contains("E-Mail")) {
            actualMessage = Driver.get().findElement(By.xpath("//div[text()='" + message + "']")).getText();
        } else if (message.contains("Telephone")) {
            actualMessage = Driver.get().findElement(By.xpath("//div[text()='" + message + "']")).getText();
        } else if (message.contains("4 and 20 characters!")) {
            actualMessage = Driver.get().findElement(By.xpath("//div[text()='" + message + "']")).getText();
        } else if (message.contains("does not match password!")) {
            actualMessage = Driver.get().findElement(By.xpath("//div[text()='" + message + "']")).getText();
        } else {
            actualMessage = Driver.get().findElement(By.xpath("//span[text()=' Warning: You must agree to the Privacy Policy!']")).getText();
        }
        return actualMessage;

    }

}
