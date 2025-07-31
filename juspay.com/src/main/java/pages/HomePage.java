package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import utils.ConfigReader;

public class HomePage {
	
	    private WebDriver driver;

	    private By searchBox = By.xpath(ConfigReader.get("searchBox"));
	    private By searchButton = By.xpath(ConfigReader.get("searchButton"));

	    public HomePage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void searchProduct() {
	        driver.findElement(By.xpath(ConfigReader.get("searchBox")))
	              .sendKeys(ConfigReader.get("searchKeyword"), Keys.ENTER);
	    }

	    public void selectProduct() {
	        driver.findElement(By.xpath(ConfigReader.get("productLink"))).click();
	    }
	}


