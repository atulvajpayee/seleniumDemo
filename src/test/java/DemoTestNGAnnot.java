import com.google.common.annotations.VisibleForTesting;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.List;

public class DemoTestNGAnnot {




    @Test(priority = 3, description = "this is demo test 1")
    public  void thisTestCaseOne(){
        System.out.println("in 1");
    }

    @Test(priority = 4)
    public  void thisTestCaseTwo(){
        System.out.println("in 2");
        new SkipException("Cannot proceed test as search option and search inputs are mismatched.");
    }

    @Test(priority = 2)
    public  void thisTestCaseThree(){
        System.out.println("in 3");
        int n=3;
        int div=12/13;
        List<Integer> lst = new ArrayList<>();
        lst.add(11);
        lst.add(19);
        lst.add(14);
        lst.add(15);
        lst.add(51);

        for(int i =0; i<lst.size();i++) {
            Assert.assertTrue(lst.get(i) > 10, "List contains value less then 10  the value is::"+lst.get(i)+" at index ::"+i);
        }
    }


    @Test(priority = 1, enabled = false)
    public  void thisTestCaseFour(){
        System.out.println("in 4");
    }


    @AfterMethod
    public void aftMethodTest(){
        System.out.println("in after  method");
    }


    @AfterClass
    public void afterClassTest(){
        System.out.println("in after class method");
    }

    @BeforeClass
    public void beforeClassTest(){
        System.out.println("in before class method");
    }

    @BeforeMethod
    public void BfrMethodTest(){
        System.out.println("in before  method");
    }
}