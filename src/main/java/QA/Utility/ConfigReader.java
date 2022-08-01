package QA.Utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    //read config.properties file from src/test/config/config.properties
    private Properties prop;

    public Properties setProperties() {
        prop = new Properties();
        try {
           FileReader reader = new FileReader("./src/test/java/config/config.properties");
              prop.load(reader);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return prop;
    }
}
