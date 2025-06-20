package com.demo.SelWeb;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollWebPage {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        //driver.get("https://www.calculator.net/");
        driver.get("https://www.spicejet.com/");

        JavascriptExecutor js=(JavascriptExecutor)driver;
        // Thread.sleep(3000);
        // js.executeScript("window.scrollBy(0,500)");
         //WebElement link=driver.findElement(By.xpath("//div[contains(text(),\" Spin to Win \")]"));
         Thread.sleep(3000);
         //js.executeScript("arguments[0].scrollIntoView();",link);
         js.executeScript("window.scrollTo(0, document.body.scrollHeight)");



}
}