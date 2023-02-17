package locator;

import org.openqa.selenium.By;

public interface LoginPageLocator {

    By FIELD_EMAIL_LOGIN = By.xpath("//input[@id='email']");
    By FIELD_PASS_LOGIN = By.xpath("//input[@type='password']");
    By BUTTON_LOGIN = By.xpath("//button[text()='Login']");

    By ERROR_MESSAGE_INVALID_EMAIL = By.xpath("//div[contains(text(),'Email harus diisi dengan benar')]");

    By ERROR_MESSAGE_EMPTY_EMAIL = By.xpath("//div[contains(text(),'Alamat Email wajib diisi')]");

    By ERROR_MESSAGE_EMPTY_PASS = By.xpath("//div[contains(text(),'Password wajib diisi')]");

}
