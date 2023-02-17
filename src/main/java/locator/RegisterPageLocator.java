package locator;

import org.openqa.selenium.By;

public interface RegisterPageLocator {

    By FIELD_FULL_NAME_REGISTER = By.xpath("//input[@id='name']");
    By FIELD_EMAIL_REGISTER = By.xpath("//input[@id='email']");
    By FIELD_PASSWORD_REGISTER= By.xpath("//*[@id=\"__next\"]/div/div/div/div/div[2]/div/form/div[3]/div/label/input");
    By CHECK_TNC= By.xpath("//input[@id='ok-check']");
    By BUTTON_DAFTAR_A = By.xpath("//button[text()='Daftar']");

    By INPUT_OTP_EMAIL = By.xpath("//input[@type='phone']");
    By BUTTON_LANJUTKAN = By.xpath("//button[text()='Lanjutkan']");

    By BUTTON_LEWATI = By.xpath("//span[contains(text(),'Lewati')]");

    By ERROR_EMPTY_FULLNAME_REGISTER = By.xpath("//div[contains(text(),'Nama Lengkap wajib diisi')]");

    By ERROR_EMPTY_EMAIL_REGISTER = By.xpath("//div[contains(text(),'Email wajib diisi')]");

    By ERROR_INVALID_EMAIL_REGISTER = By.xpath("//div[contains(text(),'Email harus diisi dengan benar.')]");

    By ERROR_EMPTY_PASS_REGISTER = By.xpath("//div[contains(text(),'Password wajib diisi')]");


}
