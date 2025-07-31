package pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.ConfigReader;

public class ProductPage {
	WebDriver driver;

	public ProductPage(WebDriver driver) {
		this.driver = driver;
	}

	public void switchToProductTab() {
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1)); // new tab
	}

	public void addToCart() {
		driver.findElement(By.xpath(ConfigReader.get("addToCartBtn"))).click();
	}
}
