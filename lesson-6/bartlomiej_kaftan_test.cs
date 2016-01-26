using System;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading;
using NUnit.Framework;
using OpenQA.Selenium;
using OpenQA.Selenium.Firefox;
using OpenQA.Selenium.Support.UI;

namespace SeleniumTests
{
    [TestFixture]
    public class BartlomiejKaftanTest
    {
        private IWebDriver driver;
        private StringBuilder verificationErrors;
        private string baseURL;
        private bool acceptNextAlert = true;
        
        [SetUp]
        public void SetupTest()
        {
            driver = new FirefoxDriver();
            baseURL = "http://localhost:8080";
            verificationErrors = new StringBuilder();
        }
        
        [TearDown]
        public void TeardownTest()
        {
            try
            {
                driver.Quit();
            }
            catch (Exception)
            {
                // Ignore errors if unable to close the browser
            }
            Assert.AreEqual("", verificationErrors.ToString());
        }
        
        [Test]
        public void TheBartlomiejKaftanTest()
        {
            driver.Navigate().GoToUrl(baseURL + "/registrationform/");
            try
            {
                Assert.AreEqual("Rule Financial Registration Form", driver.Title);
            }
            catch (AssertionException e)
            {
                verificationErrors.Append(e.Message);
            }
            driver.FindElement(By.Name("firstName")).Clear();
            driver.FindElement(By.Name("firstName")).SendKeys("Bartlomiej");
            driver.FindElement(By.Name("lastName")).Clear();
            driver.FindElement(By.Name("lastName")).SendKeys("Kaftan");
            driver.FindElement(By.Name("email")).Clear();
            driver.FindElement(By.Name("email")).SendKeys("barkaf@gmail.com");
            driver.FindElement(By.Name("repeatEmail")).Clear();
            driver.FindElement(By.Name("repeatEmail")).SendKeys("barkaf@gmail.com");
            driver.FindElement(By.XPath("(//button[@class='gwt-Button' and text()='Java'])")).Click();
            driver.FindElement(By.Id("gwt-uid-22")).Click();
            driver.FindElement(By.Id("gwt-uid-26")).Click();
            driver.FindElement(By.XPath("(//button[@class='gwt-Button' and text()='Save'])")).Click();
            driver.FindElement(By.XPath("(//button[@type='button'])[30]")).Click();
        }
        private bool IsElementPresent(By by)
        {
            try
            {
                driver.FindElement(by);
                return true;
            }
            catch (NoSuchElementException)
            {
                return false;
            }
        }
        
        private bool IsAlertPresent()
        {
            try
            {
                driver.SwitchTo().Alert();
                return true;
            }
            catch (NoAlertPresentException)
            {
                return false;
            }
        }
        
        private string CloseAlertAndGetItsText() {
            try {
                IAlert alert = driver.SwitchTo().Alert();
                string alertText = alert.Text;
                if (acceptNextAlert) {
                    alert.Accept();
                } else {
                    alert.Dismiss();
                }
                return alertText;
            } finally {
                acceptNextAlert = true;
            }
        }
    }
}
