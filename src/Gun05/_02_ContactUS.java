package Gun05;

/*
  1- ContactUs a tıklayınız
  2- Mesaj kutusuna en az 10 karakterlik bir mesaj yazınız.
  3- Submit ettikten sonra Contact US yazısını doğrulayınız.
 */

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _02_ContactUS extends GenelWebDriver {

@Test
@Parameters("mesaj")//XML'deki adı
    void ContactUS(String gelenMesaj){//Metoddaki adı.

    WebElement contactsUS= driver.findElement(By.linkText("Contact Us"));
    contactsUS.click();

    WebElement enquiry= driver.findElement(By.id("input-enquiry"));
    enquiry.sendKeys(gelenMesaj);

    WebElement submit= driver.findElement(By.className("btn-primary"));
    submit.click();

    WebElement dogrulama= driver.findElement(By.cssSelector("div[id='content'] h1"));

    Assert.assertTrue(dogrulama.getText().contains("Contact Us"));

}



}
