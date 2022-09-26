package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage extends Base{
    //Elements
    private final By category = By.cssSelector(":nth-child(1) > .menu-header-item__title");
    private final By subcategory = By.cssSelector("div#landingPageContainer > div > div > div > a:nth-of-type(3)");
    private final By categoryTitle= By.cssSelector("#root > div > div.product-list-container > div.product-list > div.container-fluid.product-list-heading > div:nth-child(1)");
    private final By categoryBar = By.className("menu-nav");
    private final By cartButton = By.cssSelector("#header__container > header > div.header__middle > div.header__middle__right > div > div:nth-child(3)");
    private final By homepageButton = By.cssSelector("#header__container > header > div.header__middle > div.header__middle__left");
    //Constructor
    public Homepage(WebDriver driver) {
        super(driver);
    }
    //Methods
    public void goToHomepage(){
        openWebsite("https://www.lcwaikiki.com/tr-TR/TR");
    }
    public void goToCart(){
        click(cartButton);
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
    public void clickHomepageButton(){
        click(homepageButton);
    }
    public void checkHomepageTitle(){
        elementUtil.WaitForIt(10);
        titleCheck("LC Waikiki");
    }
    public void checkHomepageUrl() {
        checkUrl("https://www.lcwaikiki.com/tr-TR/TR");
    }
}
