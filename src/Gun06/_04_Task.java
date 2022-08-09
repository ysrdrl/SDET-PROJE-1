package Gun06;

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Daha önceki derslerde yaptğımı Search fonksiyonunu
 * Mac,ipod ve samsung için Dataprovider ile yapınız.
 */

public class _04_Task extends GenelWebDriver {

    @Test(dataProvider = "getData")
    void SearchFunchtionality(String mesaj) {

            WebElement searchBox = driver.findElement(By.name("search"));
            searchBox.clear();
            searchBox.sendKeys(mesaj);


            WebElement searchButton = driver.findElement(By.className("btn-default"));
            searchButton.click();

            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("div[class='caption']")));

            List<WebElement> list = driver.findElements(By.cssSelector("div[class='caption']"));

            for (WebElement e : list) {
                Assert.assertTrue(e.getText().toLowerCase().contains(mesaj));
            }
    }


    @DataProvider
    public Object[] getData(){

        Object[] data={"mac","samsung","ipod"};


        return data;
    }


    }



