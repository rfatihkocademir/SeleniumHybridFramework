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
    public void WaitElementClickable(By Element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(Element));
    }
    public void WaitElementVisibility(By Element){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(Element));
    }

    //Wait a minute
    public void WaitAMinute(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    //Javascript Executor

    public JavascriptExecutor JSExecutor(){
       JavascriptExecutor JS = (JavascriptExecutor)driver;
       return JS;

    }


}
