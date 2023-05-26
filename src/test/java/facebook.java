import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
        public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//src//test//java//drivers//chromedriver");

            WebDriver driver = new ChromeDriver();
            driver.get("https://www.facebook.com/");
            driver.findElement(By.name("email")).sendKeys("atulcool55@gmail.com");
            driver.findElement(By.name("pass")).sendKeys("Vajpayee");
            driver.findElement(By.name("login")).click();
            WebElement error = driver.findElement(By.xpath("//input[@id='email']/..//div[2]"));
            System.out.println(error.getText());
            System.out.println("Working Directory = " + System.getProperty("user.dir"));

        }

}
