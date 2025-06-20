package com.demo.SelWeb;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTip {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        WebElement searchIcon=driver.findElement(By.xpath("//button[@class=\"ytSearchboxComponentSearchButton\"]"));
        String tooltip=searchIcon.getDomAttribute("title");
        System.out.println(tooltip);
        if(tooltip.equals("Searc")){
            System.out.println("Test pass");
        }
        else{
            System.out.println("Test fail");
        }

}
}