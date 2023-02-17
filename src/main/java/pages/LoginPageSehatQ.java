package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static locator.LoginPageLocator.*;
import static locator.SehatQMainPageLocator.*;

public class LoginPageSehatQ {

    ChromeDriver driver;

    private static WebElement element;

    public LoginPageSehatQ(ChromeDriver driver) {
        this.driver = driver;
    }

    public void openSehatQLoginPage() {
        driver.get("https://www.sehatq.com/login/email");
    }

    public void  inputEmailLogin(String email){

        driver.findElement(FIELD_EMAIL_LOGIN).sendKeys(email);
    }

    public void  inputPassLogin(String pass){
        driver.findElement(FIELD_PASS_LOGIN).sendKeys(pass);
    }

    public void clickButtonLogin(){
        driver.findElement(BUTTON_LOGIN).click();
    }

    public void lengkapiProfilePage(){
        driver.get("https://www.sehatq.com/lengkapi-profil?redirectUrl=https://www.sehatq.com/");
        driver.findElementByXPath("//input[@name='phone']");
    }

    public String errorInvalidEmail(){
        element = driver.findElement(ERROR_MESSAGE_INVALID_EMAIL);
        return element.getText();
    }

    public String errorEmptyEmail(){
        element = driver.findElement(ERROR_MESSAGE_EMPTY_EMAIL);
        return element.getText();
    }

    public String  errorEmptyPass(){
        element = driver.findElement(ERROR_MESSAGE_EMPTY_PASS);
        return element.getText();
    }

    public void closeBrowser(){
        driver.close();
    }

    public void clickLewati(){
        driver.findElement(LEWATI_BUTTON).click();
    }

    public void clickLogoProfile(){
        driver.findElement(PROFILE_LOGO).click();
    }
}
