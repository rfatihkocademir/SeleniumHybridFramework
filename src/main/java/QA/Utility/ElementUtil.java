package QA.Utility;

import netscape.javascript.JSException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementUtil {
    private WebDriver driver;
    public ElementUtil(WebDriver driver) {
        this.driver = driver;
    }


    //selenium wait for element to be visible
    public void waitForElementVisible(By by, int timeOutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOutInSeconds));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    //selenium wait for element to be clickable
    public void waitForElementClickable(By element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }



    //Wait a minute
    public void WaitForIt(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    //Javascript Executor

    public JavascriptExecutor JSExecutor(){
       JavascriptExecutor executor = (JavascriptExecutor)driver;
       return executor;

    }


}
