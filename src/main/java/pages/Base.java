package pages;
import QA.Factory.DriverFactory;
import QA.Utility.ElementUtil;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public  class Base {

    //Page Object Model Base Class
    private static WebDriver driver;
    //Constructor of Base class
    public Base(WebDriver driver) {
        this.driver = driver;

    }
    //Open Website
    ElementUtil elementUtil = new ElementUtil(driver);
    public void openWebsite(String url) {
        driver.get(url);
    }
    //Page actions - methods
    public void click(By element) {
        driver.findElement(element).click();
    }
    public void getText(By element) {
        driver.findElement(element).getText();
    }
    public void enterInput(By element, String email) {
        driver.findElement(element).sendKeys(email);
    }
    public void isExist(By element) {
       Assert.assertTrue(driver.findElement(element).isDisplayed());
    }
    public void titleCheck(String browserTitle) {
        String title = driver.getTitle();
        Assert.assertTrue(title.contains(browserTitle));
    }

    public void TextAssertion(By element, String string) {
        String text = driver.findElement(element).getText();
        Assert.assertTrue(text.contains(string));
    }

    public void checkList(By element) {
        List<WebElement> elements = driver.findElements(element);
        Assert.assertTrue(elements.size() > 0);
    }

    public void hitEnter(By element) {
        driver.findElement(element).sendKeys("\n");
    }
    public void InputClear(By element) {
        driver.findElement(element).clear();
    }
    public void checkUrl(String url) {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains(url));
    }
    public void JSExecutor(By element) {
        elementUtil.JSExecutor().executeScript("$x(\\\"(//input[@value='Google Search'])[2]\\\").click()");
    }
}
