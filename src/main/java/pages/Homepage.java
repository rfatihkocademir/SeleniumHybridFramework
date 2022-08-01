package pages;


import QA.Utility.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage extends Base{

    //Elements
    private final By category = By.cssSelector(":nth-child(1) > .menu-header-item__title");
    private final By subcategory = By.cssSelector("div#landingPageContainer > div > div > div > a:nth-of-type(3)");
    private final By sizeOption =By.xpath("/html/body/div[4]/div/div[4]/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[4]/div[2]/div[2]/div/div[1]/div[3]/a[1]");
    private final By price = By.cssSelector("#rightInfoBar > div:nth-child(1) > div > div:nth-child(3) > div > div");
    private final By addToCart = By.id("pd_add_to_cart");

    private final By productTitle = By.cssSelector("#rightInfoBar > div:nth-child(1) > div > div.row.title-info > div.col-xs-7.col-sm-9 > div.product-title");
    private final By categoryTitle= By.cssSelector("#root > div > div.product-list-container > div.product-list > div.container-fluid.product-list-heading > div:nth-child(1)");
    private final By productList = By.className("product-grid");
    private final By categoryBar = By.className("menu-nav");
    private final By cartButton = By.cssSelector("#header__container > header > div.header__middle > div.header__middle__right > div > div:nth-child(3)");
    private final By productImage = By.xpath("//*[@id=\"productSliderPhotos\"]/div[2]/div[1]");
    private final By homepageButton = By.cssSelector("#header__container > header > div.header__middle > div.header__middle__left");
    private final By cartTitle = By.xpath("/html/body/div[4]/div/div[2]/div[2]/div[1]/div[1]/div[2]/div/span");
    private final By productTitleInCart= By.xpath("//*[@id=\"ShoppingCartContent\"]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div/span[1]");
    private final By productPriceInCart = By.cssSelector("#ShoppingCartContent > div:nth-child(4) > div.col-md-8 > div.products-area > div.rd-cart-item.shoppingcart-item > div.row.mb-5 > div.col-md-4.col-xs-3.text-right.sc-option-detail.pl-0 > span");
    private final By productImageInCart = By.xpath("//*[@id=\"ShoppingCartContent\"]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/a/img");
    private final By someProduct = By.cssSelector("#root > div > div.product-list-container > div.product-list > div:nth-child(5) > div > div.product-grid > div:nth-child(7)");

    public Homepage(WebDriver driver) {
        super(driver);

    }

    public void goToHomepage(){
        openWebsite("https://www.lcwaikiki.com/tr-TR/TR");
    }



    public void checkCategoryBar(){
        isExist(categoryBar);
    }
    public void clickSubcategory(){
        click(subcategory);
    }
    public void checkCategoryTitle(){
        isExist(categoryTitle);
    }
    public void clickCategory() {

        click(category);
    }
    public void clickProduct(){
        click(someProduct);
    }
    public void checkProductTitle(){

        isExist(productTitle);
    }
    public void checkProductList(){
        checkList(productList);
    }
    public void clickSizeOption(){
        click(sizeOption);
    }
    public void checkPrice(){
        isExist(price);
    }
    public void clickAddToCart(){
            elementUtil.WaitAMinute();
            click(addToCart);
    }

    public void checkProductImage(){
        isExist(productImage);
    }
    public void checkProductOptions(){
        isExist(sizeOption);
    }

    public void clickCart(){
        click(cartButton);
    }
    public void checkCartTitle(){
        isExist(cartTitle);
    }
    public void checkProductInCart(){
        isExist(productTitleInCart);
    }
    public void checkProductPriceInCart(){
        isExist(productPriceInCart);
    }

    public void checkProductImageInCart(){
        isExist(productImageInCart);
    }
    public void clickHomepageButton(){
        click(homepageButton);
    }
    public void checkHomepageTitle(){
        elementUtil.WaitAMinute();
        titleCheck("LC Waikiki");
    }

    public void checkHomepageUrl(String url) {
        checkUrl(url);
    }
}
