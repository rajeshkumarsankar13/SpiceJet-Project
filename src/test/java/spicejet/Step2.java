package spicejet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Step2 {
    public static void main(String[] args) {
        ChromeDriver chromedriver = new ChromeDriver();
        chromedriver.get("https://www.spicejet.com/");
        chromedriver.manage().window().maximize();
        chromedriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        List<WebElement> links = chromedriver.findElements(By.tagName("a"));
        for (WebElement link : links) {
            String url = link.getAttribute("href");
            verifyLink(url);
        }

    }

    private static void verifyLink(String url) {
        try {
            HttpURLConnection connection= (HttpURLConnection) new URL(url).openConnection();
            connection.setConnectTimeout(5000);
            connection.connect();
            int status = connection.getResponseCode();
            String message = connection.getResponseMessage();

            if (status >=400) {
                System.out.println(url + " -broken " +" "+status+" "+message);
            } else {
                System.out.println(url + " -working " +" "+status+" "+message);
            }
        } catch (IOException e) {
            System.out.println("not working");
        }
    }
}


