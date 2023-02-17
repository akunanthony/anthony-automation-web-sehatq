package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.SehatQMainPage;
import webdriverpool.WebdriverInitializer;

public class EditProfileStepDef {

    SehatQMainPage sehatQMainPage = new SehatQMainPage(WebdriverInitializer.driver);
    @And("I press Lewati")
    public void iPressLewati() {
        sehatQMainPage.clickLewatiButton();
    }

    @And("I press profile logo")
    public void iPressProfileLogo() {
        sehatQMainPage.clickProfileLogo();
    }

    @And("I press profile text")
    public void iPressProfileText() {
        sehatQMainPage.clickProfileTextButton();
    }

    @And("I press edit profile")
    public void iPressEditProfile() {
        sehatQMainPage.clickEditProfile();
    }

    @And("I input tanggal lahir")
    public void iInputTanggalLahir() {
        sehatQMainPage.chooseDOB();
    }

    @And("I input jenis kelamin pria")
    public void iInputJenisKelaminPria() {
        sehatQMainPage.chooseGender();
    }

    @And("I input my height")
    public void iInputMyHeight() {
        sehatQMainPage.inputHeight();
    }

    @And("I input my weight")
    public void iInputMyWeight() {
        sehatQMainPage.inputWeight();
    }

    @And("I input my phone number")
    public void iInputMyPhoneNumber() {
        sehatQMainPage.setPhoneNumber();
    }

    @And("I press simpan")
    public void iPressSimpan() {
        sehatQMainPage.clickSimpan();
    }

    @Then("Error message on DOB filed will be shown")
    public void errorMessageOnDOBFiledWillBeShown() {
        Assert.assertEquals("Message is not match", "Tanggal Lahir wajib diisi", sehatQMainPage.errorEmptyDOB());
    }

    @And("Error message on gender filed will be shown")
    public void errorMessageOnGenderFiledWillBeShown() {
        Assert.assertEquals("Message is not match", "Jenis kelamin wajib diisi", sehatQMainPage.errorEmptyGender());
    }

    @And("Error message on Height filed will be shown")
    public void errorMessageOnHeightFiledWillBeShown() {
        Assert.assertEquals("Message is not match", "Tinggi Badan wajib diisi", sehatQMainPage.errorEmptyHeight());
    }

    @And("Error message on Weight filed will be shown")
    public void errorMessageOnWeightFiledWillBeShown() {
        Assert.assertEquals("Message is not match", "Berat Badan wajib diisi", sehatQMainPage.errorEmptyWeight());
    }

    @And("Error message on Address filed will be shown")
    public void errorMessageOnAddressFiledWillBeShown() {
        Assert.assertEquals("Message is not match", "Alamat wajib diisi", sehatQMainPage.errorEmptyAddress());
    }

    @And("I input my phone number with {string}")
    public void iInputMyPhoneNumberWith(String arg0) {
    }

    @Then("Error message on Phone number filed will be shown")
    public void errorMessageOnPhoneNumberFiledWillBeShown() {
        Assert.assertEquals("Message is not match", "Kolom No. Telp minimal 9", sehatQMainPage.errorInvalidPhone());
    }
}
