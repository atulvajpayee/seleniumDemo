
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class AutomationFb {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

       /* System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//src//test//java//drivers//chromedriver");

*/
        WebDriver driver = new ChromeDriver();

        driver.get("https://bit.ly/3TK62Vs");

        driver.findElement(By.name("firstname")).sendKeys("Atul");
        driver.findElement(By.name("lastname")).sendKeys("Vajpayee");
        driver.findElement(By.name("reg_email__")).sendKeys("atul.vajpayee93@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("atul.vajpayee93@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("Vajpayee@222");


        Select s = new Select(driver.findElement(By.id("day")));

        s.selectByVisibleText("13");

        Select s1 = new Select(driver.findElement(By.id("month")));

        s1.selectByValue("6");

        Select s2 = new Select(driver.findElement(By.id("year")));

        s2.selectByValue("1993");

        driver.findElement(By.xpath("//input[@value='2']")).click();

        driver.findElement(By.name("websubmit")).click();
        Object webdriver;

    }
}