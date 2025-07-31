package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderSummaryPage {
	WebDriver driver;

    private By continueBtn = By.xpath("//button[@class='QqFHMw VuSC8m _7Pd1Fp' and text()='CONTINUE']");

    public OrderSummaryPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickContinueButton() {
        driver.findElement(continueBtn).click();
    }

    public void proceedToPayment() throws InterruptedException {
        Thread.sleep(3000); // wait for order summary
        driver.findElement(continueBtn).click();
    }

}
