import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginEmail {
    protected static WebDriver driver;

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "src\\Webdrives\\chromedriver.exe");


// open the browser
        driver = new ChromeDriver();
        // maximise the briwser window screen
        driver.manage().window().fullscreen();
        //set implicity wait for driver object
        driver.manage().timeouts().implicitlyWait(59, TimeUnit.SECONDS);
        // open the wbsite
        driver.get("https://demo.nopcommerce.com/");

        //click on login
        driver.findElement(By.xpath("//a[@class=\"ico-login\"]")).click();


        driver.findElement(By.name("Email")).sendKeys ("testtest1@test.com");
        driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys( "abcd1234");
        driver.findElement(By.xpath("//input[@class=\"button-1 login-button\"]")).click();
        //click on mac product

        driver.findElement(By.linkText("Apple MacBook Pro 13-inch")).click();
        //Email to friend
        driver.findElement(By.xpath("//div[@ class=\"email-a-friend\" ]")).click();
        //enter a friend email

driver.findElement(By.id("FriendEmail")).sendKeys("arpi.shah09@gmial.com");
//enter a personal email
        driver.findElement(By.xpath("//textarea[@id=\"PersonalMessage\" ]")).sendKeys("Good deal I think please have a  look");

driver.findElement(By.xpath("//input [@ value=\"Send email\" ]")).click();

// drive.close






    }
}