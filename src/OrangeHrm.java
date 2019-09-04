import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class OrangeHrm {

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
        driver.get("https://opensource-demo.orangehrmlive.com");
//add username
driver.findElement(By.id("txtUsername")).sendKeys("Admin");

//add password
        driver.findElement(By.xpath("//input[@ name=\"txtPassword\"]")).sendKeys("admin123");
//click on login

        driver.findElement(By.id("btnLogin")).click();

        //click log out

        driver.findElement(By.linkText("Welcome Admin")).click();

        driver.findElement(By.linkText("Logout")).click();


// drive.close



    }


}



















