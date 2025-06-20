package com.demo.SelWeb;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {
public static void main(String[] args) {
    WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.pict.edu/extracurricular/");
        //driver.get("https://deadlinkcity.com/");
        driver.manage().window().maximize();
        List<WebElement> linkElements=driver.findElements(By.tagName("a"));
        System.out.println("Total number of Links on the Webpage : "+linkElements.size());
        int resCode=200;
        int brokenLinkCount=0;
        for(WebElement link:linkElements){
            String url=link.getDomAttribute("href");
            try {
                URL urlLink=new URL(url);
                HttpURLConnection huc=(HttpURLConnection) urlLink.openConnection();
                huc.setRequestMethod("HEAD");
                huc.connect();
                resCode=huc.getResponseCode();
                if(resCode>=400){
                    System.out.println(url+ " Broken link");
                    brokenLinkCount++;
                }
            } catch (Exception e) {
                // TODO: handle exception
            }

        }
        System.out.println("Total broken links are: "+brokenLinkCount);

}
}
