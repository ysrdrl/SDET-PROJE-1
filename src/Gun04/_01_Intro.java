package Gun04;

import org.testng.annotations.*;

public class _01_Intro {

    /*

                  @BeforeSuit
                    @BeforeTest
                      @BeforeGroups
                        @BeforeClass
                          @BeforeMetod
                                @Test
                                @Test
                          @AfterMetod
                        @AfterClass
                      @AfterGroup
                    @AfterTest
                  @BeforeSuit

     */

    @BeforeSuite
    void bSuit(){
        System.out.println("Before Suit");
    }
    @BeforeTest
    void bTest(){
        System.out.println("Before Test");
    }
    @BeforeGroups
    void bGroups(){
        System.out.println("Before Groups");
    }
    @BeforeClass
    void bClass(){
        System.out.println("Before Class");
    }
    @BeforeMethod
    void bMetod(){
        System.out.println("Before Metod");
    }



    @Test
    void testBir(){
        System.out.println("Birinci test.");
    }

    @Test
    void testIki(){
        System.out.println("İkinci test.");
    }




    @AfterMethod
    void aMetod(){
        System.out.println("After Metod");
    }

    @AfterClass
    void aClass(){
        System.out.println("After class");
    }

    @AfterGroups
    void aGroups(){
        System.out.println("After group");
    }
    @AfterTest
    void aTest(){
        System.out.println("After test");
    }
    @AfterSuite
    void aSuite(){
        System.out.println("After suit");
    }


}
