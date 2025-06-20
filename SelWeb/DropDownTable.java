package com.demo.SelWeb;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownTable {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://eudyogaadhaar.org/");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Scroll down by 500 pixels
        js.executeScript("window.scrollBy(0, 500);");
        WebElement element=driver.findElement(By.id("office-state"));
        Select dropDown=new Select(element);
        dropDown.selectByIndex(5);
        dropDown.selectByVisibleText("26. Nagaland / Nagaland");
        dropDown.selectByValue("Dadara");
        System.out.println(dropDown.isMultiple());
        List<WebElement> options=dropDown.getOptions();
        for(WebElement op:options){
            System.out.println(op.getText());
        }
       
    }

}
