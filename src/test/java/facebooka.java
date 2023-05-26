import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class facebooka {

    static WebDriver driver ;


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//src//test//java//drivers//chromedriver");

driver =  new ChromeDriver();
        String name="atulcool55@gmail.com";
        String pass="Vajpayee";



        driver.get("https://www.facebook.com/");
        driver.findElement(By.name("email")).sendKeys("atulcool55@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("");
        driver.findElement(By.name("login")).click();

        facebooka fb = new facebooka();
        fb.invalidLoginWithPass(name,pass);
        fb.invaliudLoginWithUserName();
        fb.loginWithValidData(name,pass);
        fb.validateErrorInBlankCase(name,pass);

    }

    public void invaliudLoginWithUserName(){

        driver.findElement(By.name("email")).sendKeys("atulcool55@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("");
        driver.findElement(By.name("login")).click();

    }

    public void invalidLoginWithPass(String name, String pass){

        driver.findElement(By.name("email")).sendKeys(name);
        driver.findElement(By.name("pass")).sendKeys(pass);
        driver.findElement(By.name("login")).click();

    }

    public void loginWithValidData(String name, String pass){

        driver.findElement(By.name("email")).sendKeys(name);
        driver.findElement(By.name("pass")).sendKeys(pass);
        driver.findElement(By.name("login")).click();

    }

    public void validateErrorInBlankCase(String name, String pass){

        driver.findElement(By.name("email")).sendKeys(name);
        driver.findElement(By.name("pass")).sendKeys(pass);
        driver.findElement(By.name("login")).click();

    }
    public void loginpage()
    {
        driver.get("https://www.facebook.com/");
    }
}