package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage extends AbstractBase{

    //Elements on the that page

    private final By productName = By.cssSelector("#rightInfoBar > div:nth-child(1) > div > div.row.title-info > div.col-xs-7.col-sm-9 > div.product-title");
    private final By productPrice = By.className("advanced-price");
    private final By productDescription = By.xpath("//*[@id=\"accordion\"]/div[1]");
    private final By productImage = By.xpath("#productSliderPhotos > div.product-images-desktop.hidden-xs > div:nth-child(2) > img");
    private final By productAddToCartButton = By.xpath("//button[@id='add_to_cart']");
    private final By sizeOption =By.xpath("/html/body/div[4]/div/div[4]/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[4]/div[2]/div[2]/div/div[1]/div[3]/a[1]");

    private final By productSizeArea = By.className("option-size");
    private final By productFindCombine = By.xpath("//*[@id=\"rightInfoBar\"]/div[2]/div/div/div/div/a[1]/div");
    private final By productSimilarProducts = By.xpath("//*[@id=\"rightInfoBar\"]/div[2]/div/div/div/div/a[2]/div");
    private final By productEvaluations = By.xpath("//*[@id=\"rightInfoBar\"]/div[2]/div/div/div/div/a[3]/div");
    private final By productColors = By.className("colors-area");
    private final By combineRecommendationsArea = By.className("combine-recommendations");
    private final By similarItemsRecommendationsArea = By.id("similar-items-recommendations");
    private final By bestSellerRecommendationsArea = By.xpath("//*[@id=\"ins-topsellers-recommendations\"]/div[1]/div/div/div/div");
    private static WebDriver driver;
    //constructor
    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void openWebsite(String url) {
        driver.get(url);
    }

    @Override
    public void click(By element) {
        driver.findElement(element).click();
    }

    @Override
    public void getText(By element) {
        driver.findElement(element).getText();
    }

    @Override
    public void enterInput(By element, String email) {
        driver.findElement(element).sendKeys(email);
    }

    @Override
    public void isExist(By element) {
        Assert.assertTrue(driver.findElement(element).isDisplayed());
    }

    @Override
    public void titleCheck(String browserTitle) {
        String title = driver.getTitle();
        Assert.assertTrue(title.contains(browserTitle));
    }

    @Override
    public void TextAssertion(By element, String string) {
        String text = driver.findElement(element).getText();
        Assert.assertTrue(text.contains(string));
    }

    @Override
    public void checkList(By element) {
        List<WebElement> elements = driver.findElements(element);
        Assert.assertTrue(elements.size() > 0);
    }

    @Override
    public void hitEnter(By element) {
        driver.findElement(element).sendKeys("\n");
    }

    @Override
    public void InputClear(By element) {
        driver.findElement(element).clear();
    }

    @Override
    public void checkUrl(String url) {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains(url));
    }
}
