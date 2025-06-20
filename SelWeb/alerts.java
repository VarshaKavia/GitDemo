package com.demo.SelWeb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alerts {
    public static void main(String[] args) throws InterruptedException {
         WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.get("http://uitestingplayground.com/alerts");
        driver.manage().window().maximize();
        /*driver.findElement(By.name("proceed")).click();
        Alert alert=driver.switchTo().alert();
        String text=alert.getText();
        if(text.equals("Please enter a valid user name")){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
        alert.accept();
        

    }*/
    //Simple alert 
    // /*driver.findElement(By.id("alertButton")).click();
    //Alert alert=driver.switchTo().alert();
    // driver.switchTo().alert().accept();
    // System.out.println("Simple alert button clicked");
    //Confirmation alert
    //driver.findElement(By.id("confirmButton")).click();
    //driver.switchTo().alert().accept();
    //driver.switchTo().alert().dismiss();;
    //System.out.println("Confirmation alert button clicked");
    //Prompt alert
    driver.findElement(By.id("promptButton")).click();
    Alert alert=driver.switchTo().alert();
    alert.sendKeys("Ram");
    alert.accept();
    System.out.println("Prompt alert button clicked");
    Thread.sleep(5000);
    Alert alert2=driver.switchTo().alert();
   String text= alert2.getText();
   System.out.println(text);
   alert2.accept();
   



}
}