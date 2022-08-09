package Gun06;

/*
   Senaryo
   1- Siteye gidiniz
   2- Specials tiklayiniz
   3- Cikan urun sayisi ile indirimli urun sayisi ayni mi dogrulayiniz
   4- Yukarıdaki işlemden sonra her ürünün önceki fiyatının şu andaki fiyattan
      yüksek olduğunu doğrulayınız.
*/


import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class _06_Task extends GenelWebDriver {

    @Test
    void special() {

        WebElement special = driver.findElement(By.linkText("Specials"));
        special.click();

        List<WebElement> urunlist = driver.findElements(By.cssSelector("h4> a"));
        List<WebElement> indirimList = driver.findElements(By.cssSelector("span[class='price-new']"));
        List<WebElement> eskiFiyat = driver.findElements(By.cssSelector("span[class='price-old']"));

        Assert.assertTrue(urunlist.size() == indirimList.size());

        for (int i = 0; i < indirimList.size(); i++) {
            //System.out.println("Eski Fiyat:"+eskiFiyat.get(i).getText().replaceAll("[^0-9\\.]","")+"\nYeni Fiyat:"+indirimList.get(i).getText().replaceAll("[^0-9\\.]",""));
            Assert.assertTrue(Double.parseDouble(eskiFiyat.get(i).getText().replaceAll("[^0-9\\.]","")) > Double.parseDouble(indirimList.get(i).getText().replaceAll("[^0-9\\.]","")));
        }

    }
}
