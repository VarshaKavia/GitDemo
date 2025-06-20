package com.demo.SelWeb;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTablePractice {
public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        List <WebElement> rows=driver.findElements(By.xpath("//table[@name=\"BookTable\"]/tbody/tr"));
        System.out.println("Number of rows "+rows.size());
        List <WebElement> col=driver.findElements(By.xpath("//table/tbody/tr[1]/th"));
        System.out.println("Number of columns "+col.size());

        for(WebElement header:col){
            System.out.println(header.getText()+ "\t");
        }
        System.out.println();

        // Loop through all rows and columns
        for (int i = 2; i <= rows.size(); i++) {
            for (int j = 1; j <= col.size(); j++) {
                String cellText = driver.findElement(By.xpath("//table/tbody/tr[" + i + "]/td[" + j + "]")).getText();
                System.out.print(cellText + "\t");
            }
            System.out.println(); // new line after each row
        }

        driver.quit();

        
}
}