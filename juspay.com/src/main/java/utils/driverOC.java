package utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class driverOC {
	
	
	    private static WebDriver driver;

	    public static WebDriver initDriver() {
	    	ChromeOptions options = new ChromeOptions();
	    	options.addArguments("user-data-dir=C:/Users/aquib/AppData/Local/Google/Chrome/User Data");
	    	options.addArguments("profile-directory=Default");
	    	System.setProperty("webdriver.chrome.driver", "//juspay.com//drivers//chromedriver.exe");
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        return driver;
	    }

	    public static void quitDriver() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}


