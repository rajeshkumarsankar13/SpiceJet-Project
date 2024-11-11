package spicejet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Step8 {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-notifications");
        ChromeDriver chromedriver = new ChromeDriver(options);
        Actions action = new Actions(chromedriver);
        chromedriver.manage().window().maximize();
        chromedriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        chromedriver.navigate().to("https://www.spicejet.com/");
        chromedriver.findElement(By.xpath("//div[text()='round trip']")).click();
        chromedriver.findElement(By.xpath("//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu']")).sendKeys("Chennai");
        chromedriver.findElement(By.xpath("//div[@class='css-76zvg2 r-1xedbs3 r-ubezar']")).click();
        chromedriver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']")).isSelected();
        WebElement date = chromedriver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-ubezar r-16dba41']"));
        action.moveToElement(date).build().perform();
        chromedriver.findElement(By.xpath("//div[text()='Students']")).click();
        chromedriver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();
    }
}
