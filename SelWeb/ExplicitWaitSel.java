package com.demo.SelWeb;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitSel {
public static void main(String[] args) throws InterruptedException, IOException {
         WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        WebDriverWait w= new WebDriverWait(driver,Duration.ofSeconds(20) );
        driver.findElement(By.xpath("//a[contains(text(),\"Create new account\")]")).click();
        WebElement name=driver.findElement(By.name("firstname"));
        name.sendKeys("Varsha");
        WebElement create=w.until(ExpectedConditions.elementToBeClickable(By.name("websubmit")));
        create.click();


        

}
}