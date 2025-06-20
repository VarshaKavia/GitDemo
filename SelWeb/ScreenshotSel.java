package com.demo.SelWeb;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotSel {
public static void main(String[] args) throws InterruptedException, IOException {
         WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       // FileUtils.copyFile(src, new File("/Users/ma-58/New/sample_testing/src/test/java/com/demo/SelWeb/google.png"));
        FileUtils.copyFile(src, new File("/Users/ma-58/Documents/PFolder/google.png"));
}
}