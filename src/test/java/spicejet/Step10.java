package spicejet;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Step10 {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-notifications");
        ChromeDriver chromedriver = new ChromeDriver(options);
        chromedriver.manage().window().maximize();
        chromedriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        chromedriver.navigate().to("https://www.spicejet.com/");
        chromedriver.findElement(By.xpath("//div[text()='check-in']")).click();
        chromedriver.findElement(By.xpath("//input[@placeholder='e.g. W3X3H8']")).sendKeys("23AB768CHK78");
        chromedriver.findElement(By.xpath("//input[@placeholder='john.doe@spicejet.com']")).sendKeys("test@user.com");
        chromedriver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73 r-13qz1uu']")).click();
        chromedriver.findElement(By.xpath("//div[text()='flight status']")).click();
        chromedriver.findElement(By.xpath("//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar']")).click();
        chromedriver.findElement(By.xpath("//div[text()='Tomorrow']")).click();
        chromedriver.findElement(By.xpath("//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu']")).sendKeys("Chennai");
        chromedriver.findElement(By.xpath("//input[@value='Select Destination']")).click();
        chromedriver.findElement(By.xpath("//div[@class='css-76zvg2 r-1xedbs3 r-ubezar']")).isSelected();
        chromedriver.findElement(By.xpath("//input[@value='SG - ']")).sendKeys("45789");
        chromedriver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-13qz1uu']")).click();


    }
}
