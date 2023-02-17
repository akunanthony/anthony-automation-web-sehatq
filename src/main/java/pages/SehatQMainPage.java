package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static locator.LoginPageLocator.ERROR_MESSAGE_EMPTY_PASS;
import static locator.SehatQMainPageLocator.*;
import static locator.RegisterPageLocator.*;


public class SehatQMainPage {

    ChromeDriver driver;

    private static WebElement element;

    public SehatQMainPage(ChromeDriver driver) {
        this.driver = driver;
    }

    public void openSehatQMainPage() {
        driver.get("https://www.sehatq.com/");
    }

    public void lengkapiProfilePage(){
        driver.get("https://www.sehatq.com/lengkapi-profil?newUser=true&redirectUrl=https://www.sehatq.com/");
    }

    public void welcomePage(){
        driver.get("https://www.sehatq.com/selamat-datang?newUser=true&redirectUrl=https%3A%2F%2Fwww.sehatq.com%2F");
    }

    public void  clickLoginPage(){
        driver.findElement(BUTTON_SELECT_LOGIN_LOGO).click();
    }

    public void daftarSehatPage(){
        driver.get("https://account.sehatq.com/daftar/email");
    }
    public void clickRegistrationPage(){
        driver.findElement(BUTTON_DAFTAR).click();
    }
    public void inputFullNameField(String name) {
        driver.findElement(FIELD_FULL_NAME_REGISTER).sendKeys(name);
    }

    public void inputEmailField(String email)  {
        driver.findElement(FIELD_EMAIL_REGISTER).sendKeys(email);
    }

    public void inputPasswordField(String pass) {
        driver.findElement(FIELD_PASSWORD_REGISTER).sendKeys(pass);
    }

    public void checkTNC() {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.elementToBeClickable(CHECK_TNC)).click();
        WebElement cb = driver.findElement(CHECK_TNC);
        new Actions(driver).moveToElement(cb, 1, 1).click().perform();

    }

    public void clickButtonDaftar(){
        driver.findElement(BUTTON_DAFTAR_A).click();
    }

    public void inputOTPEmail(String otpEmail){
        driver.findElement(INPUT_OTP_EMAIL).sendKeys(otpEmail);
    }
    public void getOtpEmail(){
        driver.get("https://yopmail.com/");
        driver.findElement(By.xpath("//input[@id='login']")).sendKeys();
        driver.findElement(By.xpath("//button[@title='Check Inbox @yopmail.com']")).click();
        driver.findElement(By.xpath("//iframe[@id='ifinbox']")).click();

    }

    public void clickLanjutkanButton(){
        driver.findElement(BUTTON_LANJUTKAN).click();
    }

    public void clickLewatiButton(){
        driver.findElement(BUTTON_LEWATI).click();
    }

    public void clickProfileLogo(){ driver.findElement(PROFILE_LOGO).click();}

    public void clickProfileTextButton(){ driver.findElement(PROFILE_TEXT_BUTTON).click();}

    public String errorFullname(){
        //driver.findElement(ERROR_EMPTY_FULLNAME_REGISTER).isDisplayed();
        element = driver.findElement(ERROR_EMPTY_FULLNAME_REGISTER);
        return element.getText();
    }

    public String errorEmptyEmail(){
        //driver.findElement(ERROR_EMPTY_EMAIL_REGISTER).isDisplayed();
        element = driver.findElement(ERROR_EMPTY_EMAIL_REGISTER);
        return element.getText();
    }

    public String  errorInvalidEmail(){
        //driver.findElement(ERROR_INVALID_EMAIL_REGISTER).isDisplayed();
        element = driver.findElement(ERROR_INVALID_EMAIL_REGISTER);
        return element.getText();
    }

    public void clickEditProfile(){
        driver.findElement(EDIT_PROFILE_BUTTON).click();
    }

    public void chooseDOB(){
        driver.findElement(TEXT_TANGGAL).click();
        driver.findElement(PILIH_TANGGAL_BUTTON).click();
    }

    public void chooseGender(){
        driver.findElement(GENDER_BUTTON).click();
        driver.findElement(SEX_MALE);
    }

    public void inputHeight(){
        driver.findElement(HEIGHT_TEXT).sendKeys("168");
    }

    public void inputWeight(){
        driver.findElement(WEIGHT_TEXT).sendKeys("60");
    }
    public void setPhoneNumber(){
        driver.findElement(PHONE_TEXT).sendKeys("081112223331");
    }

    public void clickSimpan(){
        driver.findElement(SIMPAN_BUTTON).click();
    }

    public String  errorEmptyDOB(){
        element = driver.findElement(ERROR_MSG_EMPTY_DOB);
        return element.getText();
    }

    public String  errorEmptyGender(){
        element = driver.findElement(ERROR_MSG_EMPTY_GENDER);
        return element.getText();
    }

    public String  errorEmptyHeight(){
        element = driver.findElement(ERROR_MSG_EMPTY_HEIGHT);
        return element.getText();
    }

    public String  errorEmptyWeight(){
        element = driver.findElement(ERROR_MSG_EMPTY_WEIGHT);
        return element.getText();
    }

    public String errorEmptyAddress(){
        element = driver.findElement(ERROR_MSG_EMPTY_ADDRESS);
        return element.getText();
    }

    public String errorInvalidPhone(){
        element = driver.findElement(ERROR_MSG_INVALID_PHONE);
        return element.getText();
    }

}
