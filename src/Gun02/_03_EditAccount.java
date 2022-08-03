package Gun02;

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

    /*
      1- Siteyi açınız.
      2- Edit Account a tıklatınız.
      3- Yeni isim ve soyisim göndererek Continue yapınız.
      4- İşlem sonucunu kontrol ediniz.
      5- Bu işlemi 2 kez çalıştırarak eski haline getiriniz.
     */

public class _03_EditAccount extends GenelWebDriver {

    @Test(priority = 1)
    void edit1(){
        for (int i = 0; i < 2; i++) {
            editTest();
        }
    }


@Test(priority = 3)
    void editTestEskiHali(){

        WebElement edit= driver.findElement(By.linkText("Edit Account"));
        edit.click();

        WebElement name= driver.findElement(By.cssSelector("input[name='firstname']"));
        name.clear();
        name.sendKeys("Yasar");

        WebElement lastname= driver.findElement(By.cssSelector("input[name='lastname']"));
        lastname.clear();
        lastname.sendKeys("DERELI");

        WebElement continueButton= driver.findElement(By.cssSelector("input[value='Continue']"));
        continueButton.click();


        Tools.successMessageValidation();

    }

    void editTest(){

        WebElement edit= GenelWebDriver.driver.findElement(By.linkText("Edit Account"));
        edit.click();

        WebElement name= GenelWebDriver.driver.findElement(By.cssSelector("input[name='firstname']"));
        name.clear();
        name.sendKeys("Ali");

        WebElement lastname= GenelWebDriver.driver.findElement(By.cssSelector("input[name='lastname']"));
        lastname.clear();
        lastname.sendKeys("TEZCAN");

        WebElement continueButton= GenelWebDriver.driver.findElement(By.cssSelector("input[value='Continue']"));
        continueButton.click();


        Tools.successMessageValidation();

    }



}

