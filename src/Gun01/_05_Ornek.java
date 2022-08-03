package Gun01;

/*
   Senaryo ;
     1- http://opencart.abstracta.us/index.php?route=account/login  sitesini açınız.
     2- asd@gmail.com  ve 123qweasd   bilgileri ile login olan test metodunu yazınız.
     3- Login olup olmadığınızı assert ile kontrol ediniz.

     114s9p1cvr7s7t15

 */


import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class _05_Ornek extends GenelWebDriver {




    @Test
    void LoginTest(){

        WebElement username= driver.findElement(By.cssSelector("input[name='email']"));
        username.sendKeys("yasar1@gmail.com");

        WebElement password= driver.findElement(By.cssSelector("input[name='password']"));
        password.sendKeys("114s9p1cvr7s7t15");

        WebElement login= driver.findElement(By.cssSelector("input[value='Login']"));
        login.click();

        WebElement myAccount= driver.findElement(By.xpath("(//div[@id='content']//h2)[1]"));

        Assert.assertTrue(myAccount.getText().contains("My Account"));


    }
}
