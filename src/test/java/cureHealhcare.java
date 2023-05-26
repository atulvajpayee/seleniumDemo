import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class cureHealhcare {
    WebDriver driver;


    @BeforeClass
    public WebDriver getDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("btn-make-appointment")).click();
        return driver;
    }
    @Test(priority = 1)
    public void Login()  {
driver.findElement(By.id("txt-username")).sendKeys("John Doe");
driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
driver.findElement(By.id("btn-login")).click();
driver.findElement(By.id("menu-toggle")).click();
    }
   /* @Test (priority = 3)
    public void links() {
        //getDriver();

        driver.findElement(By.name("urls[LinkedIn]")).sendKeys("https://www.linkedin.com/");
        driver.findElement(By.name("urls[GitHub]")).sendKeys("https://www.github.com/");
        driver.findElement(By.name("urls[Stack Overflow]")).sendKeys("ww.stack.com");
        driver.findElement(By.name("urls[Portfolio]")).sendKeys("https://Google.com");
        driver.findElement(By.name("urls[Dribbble]")).sendKeys("https://twitter.com");
        driver.findElement(By.name("urls[Twitter]")).sendKeys("https://twitter.com/i/flow/lite/verify_password");

        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(screenshot, new File("//Users//atul.vajpayee//Desktop//CD//asd.jpeg"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    @Test (priority = 2)
    public void checkData(){

        Assert.assertTrue(driver.findElement(By.name("name")).getText().length()>0);
        *//*Assert.assertEquals(driver.findElement(By.name("name")).getText(),"Atul Vajpayee");*//*
        Assert.assertTrue(driver.findElement(By.name("email")).getText().length()>0);
        Assert.assertTrue( driver.findElement(By.name("phone")).getText().length()>0);
        Assert.assertTrue(driver.findElement(By.name("org")).getText().length()>0);
    }
    @Test (priority = 4)
    public void Checkbox(){
        driver.findElement(By.xpath("//*[@class='application-answer-alternative']/../input[contains(@value,\"Basic\")]")).click();
        driver.findElement(By.xpath("//*[@class='application-answer-alternative']/../input[contains(@value,\"Advanced\")]")).click();
        driver.findElement(By.xpath("//*[@type='radio']/../span[contains(text(),\"Events\")]")).click();
        driver.findElement(By.name("cards[2aa31d70-7230-47b5-81de-888fa273e695][field1]")).sendKeys("Compensation Expectations:");
        driver.findElement(By.name("cards[2aa31d70-7230-47b5-81de-888fa273e695][field3]")).sendKeys("Anything else you'd like to add about yourself:");
        driver.findElement(By.name("comments")).sendKeys("ADDITIONAL INFORMATION");
    }
    @AfterClass
    public void AfterMethodTest() throws InterruptedException {
        Thread.sleep(20000);
        driver.quit();
    }







*/

}
