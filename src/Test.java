import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test {
    protected static WebDriver driver;

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "src\\Webdrives\\chromedriver.exe");


// open the browser
        driver = new ChromeDriver();
        // maximise the briwser window screen
        driver.manage().window().fullscreen();
        //set implicity wait for driver object
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // open the wbsite
        driver.get("https://demo.nopcommerce.com/");
        //click on register buton
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();
        //enter first name
        driver.findElement(By.id("FirstName")).sendKeys("venus");
        //enter lastname
        driver.findElement( By.xpath("// input[@name= 'LastName']")).sendKeys("patel");
        //enter email
        driver.findElement(By.name("Email")).sendKeys("testtest.com");

driver.findElement(By.name("Email")).sendKeys       ("testtest22@test.com");



    }

}
