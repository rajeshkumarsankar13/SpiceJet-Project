package spicejet;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Step6 {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-notifications");
        ChromeDriver chromedriver = new ChromeDriver(options);
        chromedriver.manage().window().maximize();
        chromedriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        chromedriver.navigate().to("https://spiceclub.spicejet.com/signup");
//        Alert alert = chromedriver.switchTo().alert();
//        alert.dismiss();
        Select title = new Select(chromedriver.findElement(By.xpath("//Select[@class='form-control form-select ']")));
        title.selectByVisibleText("Mr");
        chromedriver.findElement(By.id("first_name")).sendKeys("Rajeshkumar");
        chromedriver.findElement(By.id("last_name")).sendKeys("Sankar");
        chromedriver.findElement(By.xpath("//img[@class='d-inline-block datepicker']")).click();
        Select month = new Select(chromedriver.findElement(By.xpath("//Select[@class='react-datepicker__month-select']")));
        month.selectByValue("7");
        Select year = new Select(chromedriver.findElement(By.xpath("//Select[@class='react-datepicker__year-select']")));
        year.selectByValue("1991");
        chromedriver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--013']")).click();
        chromedriver.findElement(By.xpath("//input[@class=' form-control']")).sendKeys("67834868636");
        chromedriver.findElement(By.id("email_id")).sendKeys("testuser123@test.com");
        chromedriver.findElement(By.id("new-password")).sendKeys("@Abcd1234");
        chromedriver.findElement(By.id("c-password")).sendKeys("@Abcd1234");
        chromedriver.findElement(By.id("defaultCheck1")).isSelected();
        chromedriver.findElement(By.xpath("//button[text()='Submit']")).click();
    }
}
