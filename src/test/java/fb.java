import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
/*import org.testng.annotations.*;*/

public class fb {
    static WebDriver driver ;


      /* @BeforeClass
       public void facbookTest()
       {

            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//src//test//java//drivers//chromedriver");
            driver = new ChromeDriver();
           *//*driver.get("https://www.facebook.com/");*//*
        }
*/

        @Test
        public void invaliudLoginWithUserName(){

            driver.findElement(By.name("email")).sendKeys("atulcool55@gmail.com");
            driver.findElement(By.name("pass")).sendKeys("");
            driver.findElement(By.name("login")).click();

        }
        @Test
        public void invalidLoginWithPass(){

            driver.findElement(By.name("email")).sendKeys("");
            driver.findElement(By.name("pass")).sendKeys("Vajpayee");
            driver.findElement(By.name("login")).click();

        }

        @Test
        public void loginWithValidData(){

            driver.findElement(By.name("email")).sendKeys("atulcool55@gmail.com");
            driver.findElement(By.name("pass")).sendKeys("Vajpayee");
            driver.findElement(By.name("login")).click();

        }

        @Test
        public void validateErrorInBlankCase(){

            driver.findElement(By.name("email")).sendKeys("");
            driver.findElement(By.name("pass")).sendKeys("");
            driver.findElement(By.name("login")).click();

        }

    @BeforeMethod
    public void BfrMethodTest()
    {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//src//test//java//drivers//chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
    }
@AfterMethod
public void AfterMethodTest(){
        driver.quit();
}
}

