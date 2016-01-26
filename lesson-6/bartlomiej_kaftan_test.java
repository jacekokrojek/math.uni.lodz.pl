package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BartlomiejKaftanTest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://localhost:8080";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testBartlomiejKaftan() throws Exception {
    driver.get(baseUrl + "/registrationform/");
    try {
      assertEquals("Rule Financial Registration Form", driver.getTitle());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.name("firstName")).clear();
    driver.findElement(By.name("firstName")).sendKeys("Bartlomiej");
    driver.findElement(By.name("lastName")).clear();
    driver.findElement(By.name("lastName")).sendKeys("Kaftan");
    driver.findElement(By.name("email")).clear();
    driver.findElement(By.name("email")).sendKeys("barkaf@gmail.com");
    driver.findElement(By.name("repeatEmail")).clear();
    driver.findElement(By.name("repeatEmail")).sendKeys("barkaf@gmail.com");
    driver.findElement(By.xpath("(//button[@class='gwt-Button' and text()='Java'])")).click();
    driver.findElement(By.id("gwt-uid-22")).click();
    driver.findElement(By.id("gwt-uid-26")).click();
    driver.findElement(By.xpath("(//button[@class='gwt-Button' and text()='Save'])")).click();
    driver.findElement(By.xpath("(//button[@type='button'])[30]")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
