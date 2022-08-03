package Gun01;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_Assertions {
    @Test
    void EqulOrnek(){
        String s1="Merhaba";
        String s2="İyi akşamlar";

        Assert.assertEquals(s1,s2,"Karşılaştırma Sonucu:");
    }

    @Test
    void NotEqulOrnek(){
        String s1="Merhaba";
        String s2="İyi akşamlar";

        Assert.assertNotEquals(s1,s2,"Karşılaştırma Sonucu:");
    }

    @Test
    void TrueOrnek(){
        int s1=55;
        int s2=555;

        Assert.assertTrue(s1==s2,"Karşılaştırma Sonucu:False");
    }

    @Test
    void nullOrnek(){
        String s1=null;


        Assert.assertNull(s1,"Karşılaştırma Sonucu:False");
    }

    @Test
    void directFail(){
        int a=66;
        int b=65;

        if (a!=b) {
            Assert.fail();
        }

    }




}
