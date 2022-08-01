package QA.Factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.time.Duration;

public class DriverFactory {



    public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<WebDriver>();

    public WebDriver setDriver(String browser) {
        switch (browser) {
            case "chrome": {
                ChromeOptions options = new ChromeOptions();
                WebDriverManager.chromedriver().setup();
                tlDriver.set(new ChromeDriver(options));

                //tlDriver.set(new ChromeDriver());
                break;
            }
            case "firefox": {
                FirefoxOptions options = new FirefoxOptions();
                options.setHeadless(true);
                WebDriverManager.firefoxdriver().setup();
                tlDriver.set(new FirefoxDriver(options));
                break;
            }
            case "ie":
                WebDriverManager.iedriver().setup();
                tlDriver.set(new InternetExplorerDriver());
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                tlDriver.set(new EdgeDriver());
                break;
            default:
                System.out.println("Browser is not supported");
                break;
        }

        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        return getDriver();


    }
    public static synchronized WebDriver getDriver() {
        return tlDriver.get();
    }


}
