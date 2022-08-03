package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GenelWebDriver {

    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    public void baslangicIslemleri(){
        System.out.println("Driver start ....");

        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        //driver.manage().window().maximize(); // max
        driver.manage().deleteAllCookies();  //

        wait=new WebDriverWait(driver, Duration.ofSeconds(30));

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30)); // sadece ana sayfa yüklenirken en başta
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // bütün webElement için geçerli
        driver.get("http://opencart.abstracta.us/index.php?route=account/login");

        login();
    }

@AfterClass
    public void bitisIslemleri(){
        System.out.println("Driver stop ....");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

    public void login(){
        WebElement username= driver.findElement(By.cssSelector("input[name='email']"));
        username.sendKeys("yasar1@gmail.com");

        WebElement password= driver.findElement(By.cssSelector("input[name='password']"));
        password.sendKeys("114s9p1cvr7s7t15");

        WebElement login= driver.findElement(By.cssSelector("input[value='Login']"));
        login.click();
    }




}
