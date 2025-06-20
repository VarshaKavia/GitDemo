package com.demo.SelWeb;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {
   public static void main(String[] args) throws InterruptedException, IOException {
         WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type=\"submit\"]")));
        //For full page screenshot
        //Convert webdriver object to TakeScreenshot interface
        TakesScreenshot screenshot=((TakesScreenshot) driver);
        //Call getScreenshot method to create image file
        File src=screenshot.getScreenshotAs(OutputType.FILE);
        File dest=new File("/Users/ma-58/New/sample_testing/src/test/java/com/demo/SelWeb/OrangeHRM.PNG");
        //Copy image file to destination
        FileUtils.copyFile(src,dest);
        //For particular section screenshot

        //Convert webdriver object to TakeScreenshot interface
        //TakesScreenshot screenshot=((TakesScreenshot) driver);
        //WebElement login=driver.findElement(By.xpath("//div[@class=\"oxd-sheet oxd-sheet--rounded oxd-sheet--gutters oxd-sheet--gray-lighten-2 orangehrm-demo-credentials\"]"));
        WebElement login=driver.findElement(By.xpath("//button[@type=\"submit\"]"));

        //Call getScreenshot method to create image file
        File src1=login.getScreenshotAs(OutputType.FILE);
        File dest1=new File("/Users/ma-58/New/sample_testing/src/test/java/com/demo/SelWeb/Login.PNG");
        //Copy image file to destination
        FileUtils.copyFile(src1,dest1);


}
}