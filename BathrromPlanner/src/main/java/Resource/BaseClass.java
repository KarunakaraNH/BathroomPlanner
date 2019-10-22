package Resource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {

    public WebDriver driver;
    public Properties prop;

    public void initializeDriver() throws IOException {

        prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\nhkar\\IdeaProjects\\BathrromPlanner\\src\\base.properties");

        prop.load(fis);
        String browserName = prop.getProperty("browser");
        System.out.println(browserName);

        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver",
                    "C:\\Program Files\\Selenium WebDrivers\\chromedriver\\win32\\2.41\\chromedriver.exe");
            driver = new ChromeDriver();
            // execute in chrome driver

        } else if (browserName.equals("Firefox")) {
            System.setProperty("webdriver.gecko.driver",
                    "C:\\Users\\nhkar\\SeleniumWebdriver\\geckodriver.exe");
            driver = new FirefoxDriver();

        } else if (browserName.equals("IE")) {
            System.setProperty("WebDriver.ie.driver",
                    "C:\\Program Files\\Selenium WebDrivers\\geckodriver\\win64\\0.21.0\\geckodriver.exe");
            driver = new InternetExplorerDriver();
        }


    }


}
