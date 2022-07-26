import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;

public class login {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/home/roshan/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://iris-ddf.scienaptic.com/iris/");

        Thread.sleep(2000);

        WebElement emailId = driver.findElement(By.xpath("//input[@placeholder= \"Email\"]"));
        emailId.sendKeys("roshan.vijay@scienaptic.com");

        WebElement password = driver.findElement(By.xpath("//input[@placeholder= \"Password\"]"));
        password.sendKeys("Automation@123456");

        driver.findElement(By.xpath("//button[@class= \"btn btn-primary au-target\"]")).click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);


       driver.findElement(By.xpath("//a[text() = 'Postman67']")).click();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       driver.findElement(By.xpath("//button[@click.delegate= 'selectSource()' and @type = 'button']")).click();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       driver.findElement(By.xpath("//a[@data-original-title='PMML']")).click();


    }
}