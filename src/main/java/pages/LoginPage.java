package pages;

import QA.Utility.ElementUtil;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Base {


    public LoginPage(WebDriver driver) {
        super(driver);
    }
    //Elements
    private final By emailValue = By.cssSelector("input[name='email']");
    private final By passwordValue = By.cssSelector("input[name='password']");
    private final By loginButton = By.cssSelector("button[type='submit']");
    private final By errorMessage = By.xpath("//p[text()='Lütfen E-posta Adresinizi ya da Şifrenizi Kontrol Ediniz.']");
    private final By emailRadioButton = By.cssSelector("label[class='login-form__radio-buttons--first-label']");
    private final By telefonRadioButton = By.cssSelector("label[class='login-form__radio-buttons--second-label']");
    private final By inputEmailErrorMessage = By.xpath("//*[ text()='Lütfen geçerli bir e-posta adresi giriniz.']");
    private final By inputPasswordErrorMessage = By.xpath("//*[ text()='Lütfen şifrenizi giriniz.']");

    public void goToLoginPage() {
        openWebsite("https://www.lcwaikiki.com/tr-TR/TR/giris");
    }
    public void checkLoginPage(){
        titleCheck("Üye Girişi");
    }
    public void enterEmail(String email) {
        enterInput(emailValue, email);
    }
    public void enterPassword(String password) {
        enterInput(passwordValue, password);
    }
    public void clickLoginButton() {

        click(loginButton);
    }
    public void checkEmailRadioButton() {
        isExist(emailRadioButton);
    }
    public void checkTelefonRadioButton() {
        isExist(telefonRadioButton);
    }


    public void checkErrorMessage() {
        isExist(this.errorMessage);
    }
    public void checkEmailInputErrorMessage() {
       isExist(inputEmailErrorMessage);
    }
    public void checkPasswordInputErrorMessage() {
        isExist(inputPasswordErrorMessage);
    }
    public void clearEmail() {
        InputClear(emailValue);
    }
    public void clearPassword() {
        InputClear(passwordValue);
    }
}


