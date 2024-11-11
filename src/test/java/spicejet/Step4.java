package spicejet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Step4 {
    public static void main(String[] args) {
        ChromeDriver chromedriver = new ChromeDriver();
        chromedriver.get("https://www.spicejet.com/");
        chromedriver.manage().window().maximize();
        chromedriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement foot = chromedriver.findElement(By.id("footer"));
        List<WebElement> links = chromedriver.findElements(By.tagName("a"));
        int count = links.size();
        System.out.println("The Number of Links in Footer is " +count);

    }
}
