package Gun02;

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


        /*
        Senaryo;
        1- Siteyi açınız
        2- Top Menudeki menu elemanlarının olduğunu doğrulayınız.
        */

public class _01_ValidateMenu extends GenelWebDriver {

    @Test
    void menuTest() {

        List<String > liste = new ArrayList<>();
        liste.add("Desktops");
        liste.add("Laptops & Notebooks");
        liste.add("Components");
        liste.add("Tablets");
        liste.add("Software");
        liste.add("Phones & PDAs");
        liste.add("Cameras");
        liste.add("MP3 Players");


        List<WebElement> lis1 = driver.findElements(By.cssSelector("ul[class='nav navbar-nav']>li"));

        Tools.compareToList(liste,lis1);



    }
}
