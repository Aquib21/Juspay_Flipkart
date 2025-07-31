package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddressPage {
	WebDriver driver;
	private By deliverHereBtn = By.xpath("//button[@class='QqFHMw FA45gW _7Pd1Fp' and text()='Deliver Here']");

	public AddressPage(WebDriver driver) {
		this.driver = driver;
	}

    public void clickDeliverHere() {
        driver.findElement(deliverHereBtn).click();
    }

	public void deliverToAddress() throws InterruptedException {
		Thread.sleep(5000); // wait for address section to load
		driver.findElement(deliverHereBtn).click();
	}
}
