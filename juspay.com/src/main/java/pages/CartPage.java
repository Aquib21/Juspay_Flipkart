package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {
	WebDriver driver;

    //private By placeOrderBtn = By.xpath("//button//span[text()='Place Order']");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickPlaceOrder() {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	WebElement placeOrderBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Place Order']/ancestor::button")));
    	placeOrderBtn.click();
    }

}
