import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class seleniumPract {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//src//test//java//drivers//chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//for wait atleast for 10sec
        driver.manage().window().maximize();
        driver.get("https://www.techbeamers.com/websites-to-practice-selenium-webdriver-online/#1httpsphptravelscomdemo");
        List<WebElement> listOfWebLinks=driver.findElements(By.xpath("//h4//span[contains(@id,'http')]"));
        for (WebElement el:listOfWebLinks)
        System.out.println(el.getText());
Thread.sleep(12000);
driver.quit();
    }
}
