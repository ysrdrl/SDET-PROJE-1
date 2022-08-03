package Gun01;

import org.testng.annotations.Test;

public class _01_Giris {

    @Test(priority = 1)

    void webSitesiniAc(){
        System.out.println("Driver tanimlandi ve web sitesi acildi.");
    }

    @Test(priority = 2)
    void loginTestIsleminiYap(){
        System.out.println("Login test islemleri yapildi.");
    }

    @Test(priority = 3)
    void driveriKapat(){
        System.out.println("Driver kapatildi ve cikildi.");
    }

}
