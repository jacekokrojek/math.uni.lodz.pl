/**
 * Created by Jacek on 2015-08-01.
 */

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class SimpleTest {

    private static WebDriver driver;

    private static final String URL = "http://localhost:8080/registrationform/";

    @Before
    public  void openBrowser(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public  void shouldShowWrongAnswerPopupWhenAsnwerIsIncorrect(){

        driver.get(URL);
        String title = driver.getTitle();
        assertEquals("Rule Financial Registration Form", title);

        /*
         * Your code needs to be here, sample bolow should help you a bit
         * driver.findElement(By.name("firstName")).clear();
         * driver.findElement(By.name("firstName")).sendKeys("Marek");
         */

    }

    @After
    public void closeBrowser(){
        driver.quit();
    }
}
