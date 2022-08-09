package Gun06;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _03_DataProviderIterator {

    @Test(dataProvider = "getData")
    void userNameTest(String username){
        System.out.println("Username:"+username);
    }
    @DataProvider
    public Iterator<Object> getData() {

       List<Object> data = new ArrayList<>();
       data.add("Yaşar");
       data.add("Ali");
       data.add("Tuğba");
       data.add("Aysel");



        return data.iterator();
    }

    //*******************************************************************

    @Test(dataProvider = "getData2")
    void userNameTest2(String username,String password){
        System.out.println("Username:"+username+"\nPassword:"+password);
    }
    @DataProvider
    public Iterator<Object[]> getData2() {



        List<Object[]> data = new ArrayList<>();
        data.add(new Object[]{"Yaşar","12345"});
        data.add(new Object[]{"Ali","ali11"});
        data.add(new Object[]{"Tuğba","tt161"});
        data.add(new Object[]{"Aysel","aysel1969"});




        return data.iterator();
    }


}
