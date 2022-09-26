package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends Base {
    //constructor
    public CartPage(WebDriver driver) {
        super(driver);
    }
    //elements on the page
    private final By cartTitle = By.xpath("/html/body/div[4]/div/div[2]/div[2]/div[1]/div[1]/div[2]/div/span");
    private final By productTitleInCart= By.xpath("//*[@id=\"ShoppingCartContent\"]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div/span[1]");
    private final By productPriceInCart = By.cssSelector("#ShoppingCartContent > div:nth-child(4) > div.col-md-8 > div.products-area > div.rd-cart-item.shoppingcart-item > div.row.mb-5 > div.col-md-4.col-xs-3.text-right.sc-option-detail.pl-0 > span");
    private final By productImageInCart = By.xpath("//*[@id=\"ShoppingCartContent\"]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/a/img");




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
}
