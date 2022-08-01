package parallel;

import QA.Factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.Homepage;

public class AddToCartSteps {

    private final Homepage homepage = new Homepage(DriverFactory.getDriver());

    @Given("Anasayfaya gidilir {string}")
    public void anasayfaya_gidilir(String string) {
        homepage.goToHomepage();
    }
    @Then("Sayfa basligi kontrol edilir {string}")
    public void sayfa_basligi_kontrol_edilir(String string) {
        homepage.titleCheck(string);
    }
    @Then("Kategori navbarinin goruntulendigi kontrol edilir")
    public void kategori_navbarinin_goruntulendigi_kontrol_edilir() {
        homepage.checkCategoryBar();
    }
    @When("Kategori navbarinda bir kategoriye tiklanir")
    public void kategori_navbarinda_bir_kategoriye_tiklanir() {
        homepage.clickCategory();
    }
    @Then("Kategori sayfasinin goruntulendigi kontrol edilir")
    public void kategori_sayfasinin_goruntulendigi_kontrol_edilir() {
        homepage.checkCategoryTitle();
    }
    @Then("Kategori sayfasinda urunlerin goruntulendigi kontrol edilir")
    public void kategori_sayfasinda_urunlerin_goruntulendigi_kontrol_edilir() {
        homepage.checkProductList();
    }
    @When("Bir urune tiklanir")
    public void bir_urune_tiklanir() {
        homepage.clickProduct();
    }
    @Then("urun sayfasinin goruntulendigi kontrol edilir")
    public void urun_sayfasinin_goruntulendigi_kontrol_edilir() {
        homepage.checkProductTitle();
    }

    @Then("urun sayfasinda urunun fiyatinin goruntulendigi kontrol edilir")
    public void urun_sayfasinda_urunun_fiyatinin_goruntulendigi_kontrol_edilir() {
        homepage.checkPrice();
    }

    @Then("urun sayfasinda urunun resmini goruntulendigi kontrol edilir")
    public void urun_sayfasinda_urunun_resmini_goruntulendigi_kontrol_edilir() {
        homepage.checkProductImage();
    }
    @Then("urun sayfasinda urunun seceneklerinin goruntulendigi kontrol edilir")
    public void urun_sayfasinda_urunun_seceneklerinin_goruntulendigi_kontrol_edilir() {
        homepage.checkProductOptions();
    }
    @When("Bir urun secenegi secilir")
    public void bir_urun_secenegi_secilir() {
        homepage.clickSizeOption();
    }
    @When("Sepete Ekle butonuna basilir")
    public void sepete_ekle_butonuna_basilir() {
        // Write code here that turns the phrase above into concrete actions
        homepage.clickAddToCart();
    }
    @When("Sepetim butonuna tiklanir")
    public void sepetim_butonuna_tiklanir() {
        homepage.clickCart();
    }
    @Then("Sepet sayfasinin goruntulendigi kontrol edilir")
    public void sepet_sayfasinin_goruntulendigi_kontrol_edilir() {
        homepage.checkCartTitle();
    }
    @Then("Sepet sayfasinda urunun goruntulendigi kontrol edilir")
    public void sepet_sayfasinda_urunun_goruntulendigi_kontrol_edilir() {
        homepage.checkProductInCart();
    }
    @Then("Sepet sayfasinda urunun fiyatinin goruntulendigi kontrol edilir")
    public void sepet_sayfasinda_urunun_fiyatinin_goruntulendigi_kontrol_edilir() {
        homepage.checkProductPriceInCart();
    }

    @Then("Sepet sayfasinda urunun resmini goruntulendigi kontrol edilir")
    public void sepet_sayfasinda_urunun_resmini_goruntulendigi_kontrol_edilir() {
        homepage.checkProductImageInCart();
    }
    @When("Anasayfaya donulur")
    public void anasayfaya_donulur() {
        homepage.clickHomepageButton();
    }
    @Then("Anasayfa sayfasinin goruntulendigi kontrol edilir {string}")
    public void anasayfa_sayfasinin_goruntulendigi_kontrol_edilir(String string) {
        homepage.checkHomepageTitle();
        homepage.checkHomepageUrl(string);
    }
    @When("Alt kategoriye tiklanir")
    public void alt_kategoriye_tiklanir() {
        homepage.clickSubcategory();
    }


}
