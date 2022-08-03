package Gun02;

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;



/*
  Senaryo
  1- Siteyi açınız.
  2- Newsletter  Subscribe ve UnSubscribe işlemlerini ayrı ayı testlerde yapınız.
  3- Newsletter  üyelik işlemini, üye ise , üyelikten çıkma, değilse ekleme şeklinde yapınız
 */

public class _02_Subscribe extends GenelWebDriver {

    By link=By.linkText("Newsletter");

    @Test(priority = 1)
    void subscribeYesTest(){

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));

        wait.until(ExpectedConditions.visibilityOfElementLocated(link));

        WebElement newsletter= driver.findElement(link);
        newsletter.click();

        WebElement yes= driver.findElement(By.cssSelector("input[name='newsletter'][value='1']"));
        //WebElement yes= driver.findElement(By.xpath("//label[@class='radio-inline'])[1]"));
        yes.click();

        WebElement continueButton= driver.findElement(By.cssSelector("input[class$='btn-primary']"));
        continueButton.click();

        //WebElement success= driver.findElement(By.cssSelector("div[class$='alert-dismissible']"));

        Tools.successMessageValidation();


    }

    @Test(priority = 2)
    void subscribeNoTest(){


        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));

        wait.until(ExpectedConditions.visibilityOfElementLocated(link));

        WebElement newsletter= driver.findElement(link);
        newsletter.click();

        WebElement no= driver.findElement(By.cssSelector("input[name='newsletter'][value='0']"));
        //WebElement no= driver.findElement(By.xpath("//label[@class='radio-inline'])[2]"));
        no.click();

        WebElement continueButton=driver.findElement(By.cssSelector("input[class$='btn-primary']"));
        continueButton.click();

        //WebElement success= driver.findElement(By.cssSelector("div[class$='alert-dismissible']"));

        Tools.successMessageValidation();

    }

    @Test(priority = 2)
    void subscribeTersTest(){


        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));

        wait.until(ExpectedConditions.visibilityOfElementLocated(link));

        WebElement newsletter= driver.findElement(link);
        newsletter.click();

        //WebElement no= driver.findElement(By.cssSelector("input[name='newsletter'][value='1']"));
        WebElement tersi= driver.findElement(By.cssSelector("input[name='newsletter']:not([checked='checked'])"));
        tersi.click();

        WebElement continueButton=driver.findElement(By.cssSelector("input[class$='btn-primary']"));
        continueButton.click();

        //WebElement success= driver.findElement(By.cssSelector("div[class$='alert-dismissible']"));

        Tools.successMessageValidation();

    }

}
