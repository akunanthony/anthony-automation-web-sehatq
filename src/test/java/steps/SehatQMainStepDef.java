package steps;

import io.cucumber.java.en.*;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.SehatQMainPage;
import webdriverpool.WebdriverInitializer;

public class SehatQMainStepDef {

    SehatQMainPage sehatQMainPage= new SehatQMainPage(WebdriverInitializer.driver);
    @Given("I am not currently logged in")
    public void iAmNotCurrentlyLoggedIn() { sehatQMainPage.openSehatQMainPage();
    }

    @When("I am on the Login page")
    public void iAmOnTheLoginPage() {
        sehatQMainPage.clickLoginPage();
    }

    @And("I press {string}")
    public void iPress(String arg0) {
        sehatQMainPage.clickRegistrationPage();
    }

    @Then("Daftar Page will be shown")
    public void daftarPageWillBeShown() {
        sehatQMainPage.daftarSehatPage();
    }

    @And("I fill in Nama Lengkap with {string}")
    public void iFillInNamaLengkapWith(String arg0) {
        sehatQMainPage.inputFullNameField(arg0);
    }

    @And("I fill in Email with {string}")
    public void iFillInEmailWith(String arg1) {
        sehatQMainPage.inputEmailField(arg1);
    }

    @And("I fill in Password with {string}")
    public void iFillInPasswordWith(String arg2) {
        sehatQMainPage.inputPasswordField(arg2);
    }

    @And("I tick TnC")
    public void iTickTnC() throws InterruptedException {
        sehatQMainPage.checkTNC();
    }

    @And("I press Daftar")
    public void iPressDaftar() {
        sehatQMainPage.clickButtonDaftar();
    }

    @Then("I should see Verify-otp page")
    public void iShouldSeeVerifyOtpPage() {
    }

    @When("I input otp with {string}")
    public void iInputOtpWith(String arg0) {
        sehatQMainPage.inputOTPEmail(arg0);
    }

    @And("I press Lanjutkan")
    public void iPressLanjutkan() {
        sehatQMainPage.clickLanjutkanButton();
    }

    @Then("Lengkapi Profile will be shown")
    public void lengkapiProfileWillBeShown() {
        sehatQMainPage.lengkapiProfilePage();
    }

    @And("I click lewati button")
    public void iClickLewatiButton() {
        sehatQMainPage.clickLewatiButton();
    }

    @Then("welcome page will be shown")
    public void welcomePageWillBeShown() {
        sehatQMainPage.welcomePage();
    }

    @Then("error message for empty full name will show")
    public void errorMessageForEmptyFullNameWillShow() {
        //sehatQMainPage.errorFullname();
        Assert.assertEquals("Message is not match", "Nama Lengkap wajib diisi", sehatQMainPage.errorFullname());
    }

    @Then("error message empty email will be shown")
    public void errorMessageEmptyEmailWillBeShown() {
        //sehatQMainPage.errorEmptyEmail();
        Assert.assertEquals("Message is not match", "Email wajib diisi", sehatQMainPage.errorEmptyEmail());
    }

    @Then("error message invalid email will be shown")
    public void errorMessageInvalidEmailWillBeShown() {
        //sehatQMainPage.errorInvalidEmail();
        Assert.assertEquals("Message is not match", "Email harus diisi dengan benar.", sehatQMainPage.errorInvalidEmail());
    }
}
