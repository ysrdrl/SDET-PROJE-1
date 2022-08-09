package Gun06;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _02_DataProvider_CokBoyutlu {

    @Test(dataProvider = "getData")
    void userNameTest(String username,String password){
        System.out.println("Username:"+username+"\nPassword:"+password);
    }
    @DataProvider
    public Object [][] getData(){

        Object[][] data={{"Yaşar","1234"},{"Aysel","aysel61"},{"Ali","ali1159"}};

        return data;
    }





}
