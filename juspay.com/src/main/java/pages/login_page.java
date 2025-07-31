package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.ConfigReader;
public class login_page {


	    private WebDriver driver;

	    private By loginBtn = By.xpath(ConfigReader.get("loginBtn"));
	    private By phoneInput = By.xpath(ConfigReader.get("phoneInput"));
	    private By requestOtpBtn = By.xpath(ConfigReader.get("requestOtpBtn"));

	    public login_page(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void clickLogin() throws InterruptedException {
	        driver.findElement(loginBtn).click();
	        Thread.sleep(2000);
	    }

	    public void enterPhoneNumber(String number) {
	        driver.findElement(phoneInput).sendKeys(number);
	    }

	    public void clickRequestOTP() {
	        driver.findElement(requestOtpBtn).click();
	    }
	}



