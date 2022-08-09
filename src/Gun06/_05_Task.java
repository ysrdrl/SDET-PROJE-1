package Gun06;

import Utils.ParametreWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Bir önceki task da yapılan testi PARAMETERDRIVER ile yapınız
 * sonrasında fakrlı tarayıcılar ile çalıştırınız.
 * sonrasında paralel çalıştırınız.
 */

public class _05_Task extends ParametreWebDriver {

    @Test(dataProvider = "getData")
    @Parameters("test1")
    void SearchFunchtionality(String mesaj) {

        WebElement searchBox = driver.findElement(By.name("search"));
        searchBox.clear();
        searchBox.sendKeys(mesaj);


        WebElement searchButton = driver.findElement(By.className("btn-default"));
        searchButton.click();

        //wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("div[class='caption']")));

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
