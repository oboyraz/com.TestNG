package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    static Properties properties;


    static {
        String configPath = "configuration.properties";
        try {

            FileInputStream fis = new FileInputStream(configPath);
            properties = new Properties();
            properties.load(fis);

        } catch (IOException e) {
            System.out.println("configuration.properties file could not be read!");
        }
    }

    public static String getProperty(String key){

        return properties.getProperty(key);
    }
}
