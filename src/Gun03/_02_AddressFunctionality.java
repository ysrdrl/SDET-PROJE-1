package Gun03;

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

/*
       Senaryo;
       1- Siteyi açınız.
       2- Adress Ekleyiniz.
       3- En son eklenen adresi edit yaparak ad ve soyadı değiştirip kaydediniz.
       4- En son eklenen adresi siliniz.
 */

public class _02_AddressFunctionality extends GenelWebDriver {

    @Test
    void adressAdd(){
        WebElement addressBook= driver.findElement(By.linkText("Address Book"));
        addressBook.click();

        WebElement newAddress=driver.findElement(By.linkText("New Address"));
        newAddress.click();

        WebElement firstName=driver.findElement(By.name("firstname"));
        firstName.sendKeys("Yasar");

        WebElement lastName=driver.findElement(By.name("lastname"));
        lastName.sendKeys("DERELI");

        WebElement company=driver.findElement(By.name("company"));
        company.sendKeys("Techno Study");

        WebElement address1=driver.findElement(By.name("address_1"));
        address1.sendKeys("Yeniay Mahallesi");

        WebElement address2=driver.findElement(By.name("address_2"));
        address2.sendKeys("Surmene/Trabzon");

        WebElement city=driver.findElement(By.name("city"));
        city.sendKeys("Trabzon");

        WebElement postCode=driver.findElement(By.name("postcode"));
        postCode.sendKeys("61600");

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));



       WebElement selectCountry=driver.findElement(By.id("input-country"));
        Select ddMenu=new Select(selectCountry);
        ddMenu.selectByVisibleText("Turkey");


        WebElement findState=driver.findElement(By.id("input-zone"));
        ddMenu=new Select(findState);
        ddMenu.selectByVisibleText("Trabzon");

        WebElement continueButton=driver.findElement(By.cssSelector("input[type='submit'][value='Continue']"));
        continueButton.click();

        Tools.successMessageValidation();

    }

    @Test(dependsOnMethods = {"adressAdd"})
    void addreesEdit() throws InterruptedException {

        List<WebElement> editList=driver.findElements(By.cssSelector("td[class='text-right'] a:not([class$='btn-danger'])"));
        System.out.println(editList.get(editList.size()-1).getCssValue("Value"));
        editList.get(editList.size()-1).click();



        WebElement firstName=driver.findElement(By.id("input-firstname"));
        firstName.clear();
        firstName.sendKeys("Ali");

        WebElement lastName=driver.findElement(By.id("input-lastname"));
        lastName.clear();
        lastName.sendKeys("BETON");

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(2));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[type='submit'][value='Continue']")));


        WebElement continueButton=driver.findElement(By.cssSelector("input[type='submit'][value='Continue']"));
        continueButton.click();



        Tools.successMessageValidation();
    }

    @Test(dependsOnMethods = "adressAdd")
    void addressDelete(){

        List<WebElement> deleteList=driver.findElements(By.cssSelector("td[class='text-right'] a:not([class$='btn-info']"));
        deleteList.get(deleteList.size()-1).click();

        Tools.successMessageValidation();

    }


}
