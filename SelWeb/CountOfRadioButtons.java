package com.demo.SelWeb;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountOfRadioButtons {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx");
        driver.manage().window().maximize();
        List<WebElement> radio=driver.findElements(By.xpath("//input[@type=\"radio\"]"));
        System.out.println("Total number of radio buttons are : "+radio.size());
        

}
}