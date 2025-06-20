package com.demo.SelWeb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframePgm {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        //driver.get("https://www.rediff.com/");
        driver.get("https://www.dezlearn.com/nested-iframes-example/");
    //     driver.switchTo().frame("moneyiframe");
    //     String NSEValue=driver.findElement(By.id("nseindex")).getText();
    //     System.out.println(NSEValue);
    //     //driver.switchTo().alert().accept();
    //    //WebElement iframe= driver.findElement(By.xpath("//iframe[contains(@src, 'external-domain.com')]"));
    //    driver.switchTo().frame("google_ads_iframe_/21677187305/Rediff_Home_728x90_ATF_IN_0");

    //    driver.findElement(By.className("ns-jbn7z-e-3.image")).click();
    driver.switchTo().frame("parent_iframe");
    driver.switchTo().frame("iframe1");
    driver.findElement(By.id("u_5_6")).click();






}
}