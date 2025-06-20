package com.demo.SelWeb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse {
    public static void main(String[] args) {
         WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();
        //Creating actions class object
        Actions act=new Actions(driver);
        //act.moveToElement(driver.findElement(By.xpath("//div[contains(text(),\"Add-ons\")]"))).build().perform();
        act.moveByOffset(300, 400).build().perform();
        // driver.findElement(By.xpath("//a[@data-testid='test-id-SpiceMax']")).click();
        // act.contextClick(driver.findElement(By.xpath("//div[contains(text(),\"Add-ons\")]"))).build().perform();
    

}
}