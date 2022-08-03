package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Tools {

    public static void compareToList(List<String> menuExpectedList, List<WebElement> menuActual){

        for (int i = 0; i < menuExpectedList.size(); i++) {

            Assert.assertEquals(menuExpectedList.get(i),(menuActual.get(i).getText()),"Karşılaştırma Sonucu:False");

        }

    }

    public static void successMessageValidation (){

        WebElement success= GenelWebDriver.driver.findElement(By.cssSelector("div[class$='alert-dismissible']"));

        Assert.assertTrue(success.getText().contains("Success"));

    }

    public void editTest(){

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
