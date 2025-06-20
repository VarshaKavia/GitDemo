package com.demo.SelWeb;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageNaviagtions {
 public static void main(String[] args) throws InterruptedException {
         WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.navigate().to("https://emp-kuber.tudip.com/home/dashboard");
        driver.navigate().back();// spicejet
        Thread.sleep(2000);
        driver.navigate().forward();//Kuber
        Thread.sleep(5000);
        driver.navigate().back();// spicejet
        System.out.println(driver.getTitle());
        driver.navigate().refresh();// Refresh the page



        
}
}