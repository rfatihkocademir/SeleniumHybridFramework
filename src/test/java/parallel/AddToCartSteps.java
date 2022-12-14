package parallel;

import QA.Factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;
import pages.Homepage;
import pages.ProductPage;

public class AddToCartSteps {

    private final Homepage homepage = new Homepage(DriverFactory.getDriver());
    private final ProductPage productPage = new ProductPage(DriverFactory.getDriver());

    private final CartPage cartPage = new CartPage(DriverFactory.getDriver());
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
        productPage.checkProductList();
    }
    @When("Bir urune tiklanir")
    public void bir_urune_tiklanir() {
        productPage.clickProduct();
    }
    @Then("urun sayfasinin goruntulendigi kontrol edilir")
    public void urun_sayfasinin_goruntulendigi_kontrol_edilir() {
        productPage.checkProductTitle();
    }

    @Then("urun sayfasinda urunun fiyatinin goruntulendigi kontrol edilir")
    public void urun_sayfasinda_urunun_fiyatinin_goruntulendigi_kontrol_edilir() {
        productPage.checkPrice();
    }

    @Then("urun sayfasinda urunun resmini goruntulendigi kontrol edilir")
    public void urun_sayfasinda_urunun_resmini_goruntulendigi_kontrol_edilir() {
        productPage.checkProductImage();
    }
    @Then("urun sayfasinda urunun seceneklerinin goruntulendigi kontrol edilir")
    public void urun_sayfasinda_urunun_seceneklerinin_goruntulendigi_kontrol_edilir() {
        productPage.checkProductOptions();
    }
    @Then("urun sayfasında urunun aciklamasinin goruntulendigi kontrol edilir")
    public void urun_sayfasında_urunun_aciklamasinin_goruntulendigi_kontrol_edilir() {
        productPage.checkDescription();
    }
    @When("Bir urun secenegi secilir")
    public void bir_urun_secenegi_secilir() {
        productPage.clickSizeOption();
    }
    @When("Sepete Ekle butonuna basilir")
    public void sepete_ekle_butonuna_basilir() {
        productPage.clickAddToCartButton();
    }
    @When("Sepetim butonuna tiklanir")
    public void sepetim_butonuna_tiklanir() {
        homepage.goToCart();
    }
    @Then("Sepet sayfasinin goruntulendigi kontrol edilir")
    public void sepet_sayfasinin_goruntulendigi_kontrol_edilir() {
        cartPage.checkCartTitle();
    }
    @Then("Sepet sayfasinda urunun goruntulendigi kontrol edilir")
    public void sepet_sayfasinda_urunun_goruntulendigi_kontrol_edilir() {
        cartPage.checkProductInCart();
    }
    @Then("Sepet sayfasinda urunun fiyatinin goruntulendigi kontrol edilir")
    public void sepet_sayfasinda_urunun_fiyatinin_goruntulendigi_kontrol_edilir() {
        cartPage.checkProductPriceInCart();
    }

    @Then("Sepet sayfasinda urunun resmini goruntulendigi kontrol edilir")
    public void sepet_sayfasinda_urunun_resmini_goruntulendigi_kontrol_edilir() {
        cartPage.checkProductImageInCart();
    }
    @When("Anasayfaya donulur")
    public void anasayfaya_donulur() {
        homepage.clickHomepageButton();
    }
    @Then("Anasayfa sayfasinin goruntulendigi kontrol edilir")

    @When("Alt kategoriye tiklanir")
    public void alt_kategoriye_tiklanir() {
        homepage.clickSubcategory();
    }




    @Then("urun sayfasinda urunun renklerinin goruntulendigi kontrol edilir")
    public void urun_sayfasinda_urunun_renklerinin_goruntulendigi_kontrol_edilir() {
        // Write code here that turns the phrase above into concrete actions
        productPage.checkProductColors();
    }

    @Then("urun konbin yap butonunun goruntulendigi kontrol edilir")
    public void urun_konbin_yap_butonunun_goruntulendigi_kontrol_edilir() {
        // Write code here that turns the phrase above into concrete actions
        productPage.checkProductFindCombine();
    }

    @Then("urun benzer urunlerinin goruntule butonunun goruntulendigi kontrol edilir")
    public void urun_benzer_urunlerinin_goruntule_butonunun_goruntulendigi_kontrol_edilir() {
        // Write code here that turns the phrase above into concrete actions
        productPage.checkProductSimilarProducts();
    }



    @Then("urun sayfasinda konbin önerilerinin goruntulendigi kontrol edilir")
    public void urun_sayfasinda_konbin_önerilerinin_goruntulendigi_kontrol_edilir() {
        productPage.checkProductCombineRecommendations();
    }
    @Then("urun sayfasinda urunun degerlendirme butonunun goruntulendigi kontrol edilir")
    public void urun_sayfasinda_urunun_degerlendirme_butonunun_goruntulendigi_kontrol_edilir() {
        productPage.checkProductReview();
    }

    @Then("urun sayfasinda benzer ürünlerin goruntulendigi kontrol edilir")
    public void urun_sayfasinda_benzer_ürünlerin_goruntulendigi_kontrol_edilir() {
            productPage.checkProductSimilarProducts();
    }

    @Then("urun sayfasında en cok satanların goruntulendigi kontrol edilir")
    public void urun_sayfasında_en_cok_satanların_goruntulendigi_kontrol_edilir() {
        productPage.checkProductBestSellerRecommendations();
    }
}
