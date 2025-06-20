package com.demo.SelWeb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frames {
    public static void main(String[] args) {
        // Set path to ChromeDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        driver.get("https://letcode.in/frame");
        driver.manage().window().maximize();
        System.out.println("Title: " + driver.getTitle());
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
       driver.switchTo().frame("firstFr");
        driver.findElement(By.name("fname")).sendKeys("Varsha");
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//a[contains(text(),\"Contact\")]")).click();


}
}