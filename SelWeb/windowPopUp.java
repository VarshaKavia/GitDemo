package com.demo.SelWeb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowPopUp {
public static void main(String[] args) {
         WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://html.com/input-type-file/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name=\"fileupload\"]")).sendKeys("/Users/ma-58/Downloads/Varsha_Kavia_One_Page_Resume.docx");

}
}