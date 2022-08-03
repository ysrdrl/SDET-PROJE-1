package Gun01;

import org.testng.annotations.*;

public class _02_Annotations {

    /*

    @BeforeClass --> Her class çal???yorken önce buras? çal???r.
        @BeforeMetod --> Her metoddan(test metod) önce çal???r.
            @Test    -->testlerin çal??t??? metodlar
                 @Test


    @AfterClass  --> Her class çal???yorken sonra buras? çal???r.
    @AfterMetod --> Her metoddan(test metod) sonra çal???r.


     */


@BeforeClass
    void beforeClass(){
        System.out.println("Her class'tan önce çalışacak : Before Class");
    }
@BeforeMethod
    void beforeMetod(){
        System.out.println("Her test metod'dan önce çalışacak : Before Metod");
    }

@Test
    void test1(){
        System.out.println("Test1 çalıştı.");
    }
    @Test
    void test2(){
        System.out.println("Test 2 çalıştı.");
    }


@AfterClass
    void afterClass(){
        System.out.println("Her class'tan sonra çalışacak : After Class");
    }

@AfterMethod
    void afterMetod(){
        System.out.println("Her test metod'dan sonra çalışacak : After  Metod");
    }




}
