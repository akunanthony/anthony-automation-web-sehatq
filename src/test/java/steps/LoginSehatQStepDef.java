package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.LoginPageSehatQ;
import webdriverpool.WebdriverInitializer;

public class LoginSehatQStepDef {

    LoginPageSehatQ loginPageSehatQ= new LoginPageSehatQ(WebdriverInitializer.driver);

    @Given("I am on login page")
    public void iAmOnLoginPage() {
        loginPageSehatQ.openSehatQLoginPage();
    }

    @When("I input my correct email with {string}")
    public void iInputMyCorrectEmailWith(String arg0) {
        loginPageSehatQ.inputEmailLogin(arg0);
    }

    @And("I input my correct password with {string}")
    public void iInputMyCorrectPasswordWith(String arg0) {
        loginPageSehatQ.inputPassLogin(arg0);
    }

    @And("I press button login")
    public void iPressButtonLogin() {
        loginPageSehatQ.clickButtonLogin();
    }

    @Then("lengkapi profile will be shown")
    public void lengkapiProfileWillBeShown() {
        loginPageSehatQ.closeBrowser();
    }

    @Then("error message email will be shown")
    public void errorMessageEmailWillBeShown() {
        //loginPageSehatQ.errorInvalidEmail();
        Assert.assertEquals("Message is not match", "Email harus diisi dengan benar", loginPageSehatQ.errorInvalidEmail());
        loginPageSehatQ.closeBrowser();
    }

    @Then("error message for empty email will be shown")
    public void errorMessageForEmptyEmailWillBeShown() {
        //loginPageSehatQ.errorEmptyEmail();
        Assert.assertEquals("Message is not match", "Alamat Email wajib diisi", loginPageSehatQ.errorEmptyEmail());
    }

    @And("error message for empty password will be shown")
    public void errorMessageForEmptyPasswordWillBeShown() {
        //loginPageSehatQ.errorEmptyPass();
        Assert.assertEquals("Message is not match", "Password wajib diisi", loginPageSehatQ.errorEmptyPass());
        loginPageSehatQ.closeBrowser();
    }
}
