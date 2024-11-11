package spicejet;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Step9 extends BaseClass {
    @Test
    public void test1() //Check In Process
    {
        chromedriver.navigate().to("https://www.spicejet.com/");
        options.addArguments("disable-notifications");
        chromedriver.findElement(By.xpath("//div[text()='check-in']")).click();
        chromedriver.findElement(By.xpath("//input[@placeholder='e.g. W3X3H8']")).sendKeys("23AB768CHK78");
        chromedriver.findElement(By.xpath("//input[@placeholder='john.doe@spicejet.com']")).sendKeys("test@user.com");
        chromedriver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73 r-13qz1uu']")).click();
    }
    @Test
    public void test2(){   // Flight Status
        chromedriver.navigate().to("https://www.spicejet.com/");
        options.addArguments("disable-notifications");
        chromedriver.findElement(By.xpath("//div[text()='flight status']")).click();
        chromedriver.findElement(By.xpath("//div[@class='css-76zvg2 css-bfa6kz r-homxoj r-ubezar']")).click();
        chromedriver.findElement(By.xpath("//div[text()='Tomorrow']")).click();
        chromedriver.findElement(By.xpath("//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu']")).sendKeys("Chennai");
        chromedriver.findElement(By.xpath("//div[@class='css-76zvg2 r-1xedbs3 r-ubezar']")).click();
        chromedriver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']")).isSelected();
        chromedriver.findElement(By.xpath("//input[@value='SG - ']")).sendKeys("45789");
        chromedriver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-z2wwpe r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-13qz1uu']")).click();
    }
    @Test
    public void test3() //Manage Booking
    {
        chromedriver.navigate().to("https://www.spicejet.com/");
        options.addArguments("disable-notifications");
        chromedriver.findElement(By.xpath("//div[text()='manage booking']")).click();
        chromedriver.findElement(By.xpath("//input[@placeholder='e.g. W3X3H8']")).sendKeys("23AB768CHK78");
        chromedriver.findElement(By.xpath("//input[@placeholder='john.doe@spicejet.com / Doe']")).sendKeys("test@user.com");
        chromedriver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73 r-13qz1uu']")).click();
    }
}
