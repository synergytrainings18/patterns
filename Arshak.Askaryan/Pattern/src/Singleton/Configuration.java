package Singleton;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configuration {
    private static volatile Configuration instance = null;
    private static Properties applicationProperties;

    private Configuration() {
    }

    public static Configuration getInstance() {
        if (instance == null) {
            synchronized (Configuration.class) {
                if (instance == null) {
                    applicationProperties = initApplicationProperties();
                    instance = new Configuration();
                }
            }

        }
        return instance;
    }

    private static Properties initApplicationProperties() {
        Properties properties = new Properties();
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("src/resources/application.properties");
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return properties;

    }

    public String getProperty(String k) {
        return applicationProperties.getProperty(k);
    }
}
