# 🔄 Flipkart End-to-End Automation Framework

This project automates the end-to-end purchase flow on [Flipkart](https://www.flipkart.com) using **Selenium WebDriver**, **TestNG**, and **Java**, following the **Page Object Model (POM)** architecture.

## 🧰 Tech Stack

- Java 21+
- Selenium WebDriver
- TestNG
- Maven
- ChromeDriver
- Page Object Model (POM) Design
- Manual OTP Handling
- Configuration via `.properties` file

---

## ✅ Automated Flow

1. Open Chrome with a user profile (pre-logged in Flipkart)
2. Login using Mobile Number
3. Wait for manual OTP entry
4. Search product (e.g., "webcam")
5. Select product and add to cart
6. Proceed to checkout
7. Choose delivery address
8. Review order summary
9. Enter saved debit card details
10. Submit payment (CVV entered from config)

---

## 📁 Project Structure

```
src/
├── main/
│   ├── java/
│   │   ├── pages/               # Page classes (Login, Home, Product, Cart, etc.)
│   │   ├── utils/               # DriverFactory, ConfigReader
│   │   └── resources/
│   │       └── config.properties # Test data and locators
│
├── test/
│   └── java/
│       └── tests/              # TestNG test classes
│           └── PaymentTest.java
```

---

## ⚙️ Setup Instructions

### 1. 📦 Prerequisites

- Install Java 21+
- Install Maven
- Download [Chrome](https://www.google.com/chrome/)
- Ensure [ChromeDriver](https://chromedriver.chromium.org/) version matches your browser
- Configure your Flipkart account and ensure you are logged in using the correct Chrome profile

### 2. 🛠 Configuration

Update the `config.properties` file in `src/main/resources`:

```properties
# --- Base ---
baseUrl=https://www.flipkart.com/

# --- Login ---
loginBtn=//span[text()='Login']
phoneInput=//input[@type='text' and @class='r4vIwl BV+Dqf']
requestOtpBtn=//button[contains(text(),'Request OTP')]
mobileNumber=9154671933

# --- Product ---
searchKeyword=webcam
productLink=//a[contains(@href, 'zebronics-crystal-clear')]
addToCartBtn=//button[contains(text(),'Add to cart')]

# --- Cart ---
placeOrderBtn=//button[@class='QqFHMw zA2EfJ _7Pd1Fp']/span[text()='Place Order']

# --- Address ---
deliverHereBtn=//button[.='Deliver Here']

# --- Summary ---
continueBtnSummary=//button[.='CONTINUE']

# --- Payment ---
selectCardOption=//div[contains(@class, 'qsHXPi')]
cardNumberInput=//input[contains(@class, 'z2D4XG') and @name='cardNumber']
monthDropdown=//select[@name='month']
yearDropdown=//select[@name='year']
cvvInput=//input[@type='password' and @name='cvv']
payBtn=//button[contains(text(),'PAY ₹')]
cardNumber=1234123412341234
cardMonth=12
cardYear=2027
cvv=000
```

---

### 3. 🧪 Run Tests

Use Maven or your IDE (e.g., IntelliJ, Eclipse):

```bash
mvn clean test
```

---

## 🔐 OTP Login Note

- OTP input is **manual**. You’ll be given **30 seconds** to enter the OTP in the browser.
- Ensure you are **already logged in** using Chrome profile if skipping OTP.

---

## 🔧 Debug Tips

- ❌ `NoSuchElementException`: Check XPath in `config.properties`
- ❌ `net::ERR_NAME_NOT_RESOLVED`: Flipkart may block bot-like behavior. Use real profile.
- ❌ `ElementNotInteractable`: Use waits or add `Thread.sleep` for demo purposes

---

## 📌 Best Practices Followed

- Page Object Model
- Configurable locators & test data
- Reusable utility classes
- Organized folder structure
- Minimal hard-coded values

---

## 🧑‍💻 Author

**Aquib** — Flipkart automation project using Java Selenium & TestNG.

---

## 📃 License

This project is for educational/demo purposes only. Do not misuse Flipkart services.
