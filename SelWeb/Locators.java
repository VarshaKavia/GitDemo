package com.demo.SelWeb;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Locators {
    public static void main(String[] args) throws AWTException {
         WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.name("login-button")).click();
        Robot robot = new Robot();
robot.delay(2000); // wait for popup to appear
robot.keyPress(KeyEvent.VK_ENTER);
robot.keyRelease(KeyEvent.VK_ENTER);
        String titleActual=driver.getTitle();
        if(titleActual.equals("Swag Labs")){
            System.out.println("Test passed "+titleActual);
        }
        else{
            System.out.println("Test failed ");
        }
        driver.findElement(By.id("react-burger-menu-btn")).click();
        driver.findElement(By.id("about_sidebar_link")).click();
        driver.findElement(By.xpath("//button[contains(text(),\"Request a demo\")]")).click();
        System.out.println(driver.getTitle());
        driver.navigate().forward();
        //System.out.println(driver.getTitle());




}
}