package locator;

import org.openqa.selenium.By;

public interface SehatQMainPageLocator {

    By BUTTON_SELECT_LOGIN_LOGO = By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[3]/div/a[2]/img");
    By BUTTON_DAFTAR = By.xpath("//*[@id=\"__next\"]/div/div/div/div/div[2]/div[1]/div[4]/div/div/span/a/span");

    By LEWATI_BUTTON = By.xpath("//span[contains(text(),'Lewati')]");

    By SEHATQ_LOGO = By.xpath("//header/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]");

    By KEMENKES_LOGO = By.xpath("//header/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]");

    By PROFILE_LOGO = By.cssSelector ("header.sc-htpNat.sc-jKJlTe.krhCOB:nth-child(1) div.sc-kGXeez.gFqONy div.sc-dxgOiQ.icuRdK:nth-child(2) div.sc-ckVGcZ.fHfuAF:nth-child(3) div.sc-bdVaJa.eItVTo div.sc-htpNat.fPJWLR:nth-child(3) div.sc-jhAzac.eucjqf div:nth-child(1) > img.sc-jzJRlG.dOVASO");

    By PROFILE_TEXT_BUTTON = By.xpath ("//a[contains(text(),'Profil')]");

    By EDIT_PROFILE_BUTTON = By.xpath("//a[contains(text(),'Edit Profil')]");

    By PILIH_TANGGAL_BUTTON = By.xpath("//button[contains(text(),'Pilih')]");
    By TEXT_TANGGAL = By.xpath("//span[contains(text(),'Tanggal Lahir')]");
    By GENDER_BUTTON = By.xpath("//body/div[@id='__next']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/label[1]/input[1]");
    By SEX_MALE = By.xpath("//li[@id='m']");
    By SEX_FEMALE = By.xpath("//li[@id='f']");
    By HEIGHT_TEXT = By.xpath("//span[contains(text(),'Tinggi Badan (cm)')]");
    By WEIGHT_TEXT = By.xpath("//span[contains(text(),'Berat Badan (kg)')]");
    By PHONE_TEXT = By.xpath("//span[contains(text(),'No. Telepon')]");
    By SIMPAN_BUTTON = By.xpath("//button[contains(text(),'Simpan')]");

    By ERROR_MSG_EMPTY_DOB = By.xpath("//div[contains(text(),'Tanggal Lahir wajib diisi')]");

    By ERROR_MSG_EMPTY_GENDER = By.xpath("//div[contains(text(),'Jenis kelamin wajib diisi')]");

    By ERROR_MSG_EMPTY_HEIGHT = By.xpath("//div[contains(text(),'Tinggi Badan wajib diisi')]");

    By ERROR_MSG_EMPTY_WEIGHT = By.xpath("//div[contains(text(),'Berat Badan wajib diisi')]");

    By ERROR_MSG_EMPTY_ADDRESS = By.xpath("//div[contains(text(),'Alamat wajib diisi')]");

    By ERROR_MSG_INVALID_PHONE = By.xpath("//div[contains(text(),'Kolom No. Telp minimal 9')]");


}
