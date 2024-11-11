package spicejet;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Step7{
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-notifications");
        ChromeDriver chromedriver = new ChromeDriver(options);
        chromedriver.manage().window().maximize();
        chromedriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        chromedriver.navigate().to("https://www.spicejet.com/");
        chromedriver.navigate().refresh();
        chromedriver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-ubezar']")).click();
        chromedriver.findElement(By.xpath("//div[text()='Email']")).click();
        chromedriver.findElement(By.xpath("//input[@data-testid='user-mobileno-input-box']")).sendKeys("testuser@test.com");
        chromedriver.findElement(By.xpath("//input[@data-testid='password-input-box-cta']")).sendKeys("@Abcd1234");
        chromedriver.findElement(By.xpath("//div[text()='LOGIN']")).click();
    }
}
