package parallel;

import QA.Factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginFailedSteps {

    private final LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
    @Given("Login sayfasina gidilir")
    public void login_sayfasina_gidilir() {
        loginPage.goToLoginPage();
    }

    @Then("Login sayfasinda olundugu kontrol edilir")
    public void login_sayfasında_olunduğu_kontrol_edilir() {
        loginPage.checkLoginPage();
    }
    @Then("Telefon ve Email Radio buttonlarının geldiği kontrol edilir")
    public void telefon_ve_email_radio_buttonlarının_geldiği_kontrol_edilir() {
        loginPage.checkEmailRadioButton();
        loginPage.checkTelefonRadioButton();
    }
    @When("{string} ve {string} alanlari doldurulur")
    public void ve_alanlari_doldurulur(String email, String password) {
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
    }

    @When("Giris Yap butonuna tiklanir")
    public void giris_yap_butonuna_tiklanir() {
        loginPage.clickLoginButton();
    }

    @Then("Hatali giris mesaji goruntulenir")
    public void hatali_giris_mesaji_goruntulenir() {
        loginPage.checkErrorMessage();
    }

    @When("{string} ve {string} alanlari silinir")
    public void ve_alanlari_silinir(String string, String string2) {
        loginPage.clearEmail();
        loginPage.clearPassword();
    }

    @Then("input error mesajlari gorulur")
    public void input_error_mesajlari_gorulur() {
        loginPage.checkEmailInputErrorMessage();
        loginPage.checkPasswordInputErrorMessage();
    }
}
