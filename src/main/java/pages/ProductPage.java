package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ProductPage extends Base {

    //Elements on the that page

    private final By productTitle = By.cssSelector("#rightInfoBar > div:nth-child(1) > div > div.row.title-info > div.col-xs-7.col-sm-9 > div.product-title");
    private final By productPrice = By.className("advanced-price");
    private final By productDescription = By.xpath("//*[@id=\"accordion\"]/div[1]");
    private final By productImage = By.xpath("#productSliderPhotos > div.product-images-desktop.hidden-xs > div:nth-child(2) > img");
    private final By productAddToCartButton = By.xpath("//button[@id='add_to_cart']");
    private final By sizeOption = By.xpath("/html/body/div[4]/div/div[4]/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[4]/div[2]/div[2]/div/div[1]/div[3]/a[1]");
    private final By someProduct = By.cssSelector("#root > div > div.product-list-container > div.product-list > div:nth-child(5) > div > div.product-grid > div:nth-child(7)");
    private final By productFindCombine = By.xpath("//*[@id=\"rightInfoBar\"]/div[2]/div/div/div/div/a[1]/div");
    private final By productSimilarProducts = By.xpath("//*[@id=\"rightInfoBar\"]/div[2]/div/div/div/div/a[2]/div");
    private final By productReview = By.xpath("//*[@id=\"rightInfoBar\"]/div[2]/div/div/div/div/a[3]/div");
    private final By productColors = By.className("colors-area");
    private final By combineRecommendationsArea = By.className("combine-recommendations");
    private final By bestSellerRecommendationsArea = By.xpath("//*[@id=\"ins-topsellers-recommendations\"]/div[1]/div/div/div/div");
    private final By productsArea = By.className("product-grid");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void clickProduct(){
        click(someProduct);
    }
    public void checkProductTitle(){
        isExist(productTitle);
    }
    public void clickSizeOption(){
        click(sizeOption);
    }
    public void checkPrice(){
        isExist(productPrice);
    }
    public void checkDescription(){
        isExist(productDescription);
    }
    public void clickAddToCartButton(){
        click(productAddToCartButton);
    }
    public void checkProductImage(){
        isExist(productImage);
    }
    public void checkProductOptions(){
        isExist(sizeOption);
    }
    public void checkProductColors(){
        isExist(productColors);
    }
    public void checkProductFindCombine(){
        isExist(productFindCombine);
    }
    public void checkProductSimilarProducts(){
        isExist(productSimilarProducts);
    }
    public void checkProductReview(){
        isExist(productReview);
    }
    public void checkProductCombineRecommendations(){
        isExist(combineRecommendationsArea);
    }
    public void checkProductBestSellerRecommendations(){
        isExist(bestSellerRecommendationsArea);
    }
    public void checkProductList(){
        checkList(productsArea);
    }


}
