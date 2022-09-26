package parallel;

import QA.Factory.DriverFactory;
import QA.Utility.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class ApplicationHooks {

    private DriverFactory driverFactory;
    private WebDriver driver;
    private ConfigReader configReader;
    Properties prop;
    @Before(order=0)
    public void getProperty() {
        configReader = new ConfigReader();
        prop = configReader.setProperties();
    }
    @Before(order=1)
    //launchBrowser() method is used to launch the browser
    public void launchBrowser() {
        String browserName = prop.getProperty("browser");
        driverFactory = new DriverFactory();
        driver = driverFactory.setDriver(browserName);
    }

    @After(order=0)
    //closeBrowser() method is used to close the browser
    public void closeBrowser() {
        driver.quit();
    }
    @After(order=1)
    //teardown() method is used to take screenshot if is failed
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            //Take screenshot...
            String screenshotName = scenario.getName().replaceAll(" ", "_");
            //This takes a screenshot from the driver at save it to the specified location
            byte[] screenshotPath =((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshotPath,"image/png",screenshotName);

        }
    }

}
