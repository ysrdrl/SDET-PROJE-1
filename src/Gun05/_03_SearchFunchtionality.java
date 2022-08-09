package Gun05;

/*
       Senaryo ;
       1- Siteyi açınız.
       2- mac kelimeini göndererek aratınız.
       3- Çıkan sonuçlarda mac kelimesinin geçtiğini doğrulayınız.
       4- aynı işlemi samsung için de yapınız
     */

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class _03_SearchFunchtionality extends GenelWebDriver {

    @Test
    @Parameters("mesaj")
    void SearchFunchtionality(String mesaj){

        WebElement searchBox= driver.findElement(By.name("search"));
        searchBox.sendKeys(mesaj);

        WebElement searchButton= driver.findElement(By.className("btn-default"));
        searchButton.click();

        List<WebElement> list=driver.findElements(By.cssSelector("div[class='caption']"));

        for (WebElement e :list){
            Assert.assertTrue(e.getText().toLowerCase().contains(mesaj));
        }




    }



}
