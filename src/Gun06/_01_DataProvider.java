package Gun06;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _01_DataProvider {

    @Test(dataProvider = "getData")
    void userNameTest(String username){
        System.out.println("Username:"+username);
    }
    @DataProvider
    public Object [] getData(){

        Object[] data={"Yaşar","Ali","Aysel","Tuğba"};

        return data;
    }

    //*****************************************************************//


    @Test(dataProvider = "userler")
    void userNameTest2(String username){
        System.out.println("Username:"+username);
    }
    @DataProvider(name = "userler")
    public Object [] getData2(){

        Object[] data={"Yaşar","Ali","Aysel","Tuğba"};

        return data;
    }

}
