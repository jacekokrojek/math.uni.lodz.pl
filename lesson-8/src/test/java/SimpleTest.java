/**
 * Created by Jacek on 2015-08-01.
 */


import java.util.List;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.*;

public class SimpleTest {

    private static WebDriver driver;

    private static final String URL = "http://localhost:8080/registrationform/";

    @Before
    public  void openBrowser(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
 public Boolean checkAnswer(){
if (driver.findElement(By.xpath("//*[@class='GOFRIDJCEI' and text()='Congratulations! You've won:']")).isDisplayed())
    return true;
else
    return false;

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
        driver.findElement(By.name("firstName")).clear();
        driver.findElement(By.name("firstName")).sendKeys("Michał");
        driver.findElement(By.name("lastName")).clear();
        driver.findElement(By.name("lastName")).sendKeys("Tarabasz");
        
        String email = new String ("m.tarabasz@wp.pl");
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("repeatEmail")).clear();
        driver.findElement(By.name("repeatEmail")).sendKeys(email);
        driver.findElement(By.xpath("//*[@class='gwt-Button' and text()='SQL']")).click();
        driver.findElement(By.xpath("//*[@id='gwt-uid-22']")).click();
        driver.findElement(By.xpath("//*[@id='gwt-uid-26']")).click();
        assertEquals(checkAnswer(), false);
}
@Test
    public  void shouldShowCorrectAnswerPopupWhenAsnwerIsCorrect(){

        driver.get(URL);
        String title = driver.getTitle();
        assertEquals("Rule Financial Registration Form", title);

        /*
         * Your code needs to be here, sample bolow should help you a bit
         * driver.findElement(By.name("firstName")).clear();
         * driver.findElement(By.name("firstName")).sendKeys("Marek");
         */
        driver.findElement(By.name("firstName")).clear();
        driver.findElement(By.name("firstName")).sendKeys("Michał");
        driver.findElement(By.name("lastName")).clear();
        driver.findElement(By.name("lastName")).sendKeys("Tarabasz");
        
        String email = new String ("m.tarabasz999@wp.pl");
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("repeatEmail")).clear();
        driver.findElement(By.name("repeatEmail")).sendKeys(email);
        driver.findElement(By.xpath("//*[@class='gwt-Button' and text()='SQL']")).click();
        driver.findElement(By.xpath("//*[@id='gwt-uid-23']")).click();
        driver.findElement(By.xpath("//*[@id='gwt-uid-26']")).click();
        assertEquals(checkAnswer(), true);
}
    @Test
    public void shouldNotifyUserWhenEmailAddressesAreDifferent(){
    	driver.get(URL);
        String title = driver.getTitle();
        assertEquals("Rule Financial Registration Form", title);
        
        
        
        driver.findElement(By.name("firstName")).clear();
        driver.findElement(By.name("firstName")).sendKeys("Michał");
        driver.findElement(By.name("lastName")).clear();
        driver.findElement(By.name("lastName")).sendKeys("Tarabasz");
        
        String email = new String ("somelongandstrangemail@googel.pl");
        String email2 = new String ("somelong111andstrangemail@googel.pl");
        
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("repeatEmail")).clear();
        driver.findElement(By.name("repeatEmail")).sendKeys(email2);
        
        WebElement divErrorEmailAdress = driver.findElement(By.xpath("html/body/div[2]/div[2]/div/div/div/div[5]/div/div"));
        boolean errorMessage = Boolean.getBoolean(divErrorEmailAdress.getAttribute("aria-hidden"));
        assertEquals(errorMessage, false);
    }
    
    @After
    public void closeBrowser(){
        driver.quit();
    }
}
