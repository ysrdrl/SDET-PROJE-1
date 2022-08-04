package Gun03;

import Utils.GenelWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_Dependency{

    @Test
    void startCar(){
        System.out.println("car started.");
    }
   @Test(dependsOnMethods = {"startCar"})
    void driveCar(){
       System.out.println("Car driven.");
       Assert.fail();//Assert koymamın sebebi 'SKİP' durumunu görmek için.
    }
    @Test(dependsOnMethods = {"startCar","driveCar"})
    void parkCar(){
        System.out.println("Car parked.");
    }

    @Test(dependsOnMethods = {"startCar","parkCar"},alwaysRun = true)
    void stop(){
        System.out.println("Car stoped.");
    }





}
