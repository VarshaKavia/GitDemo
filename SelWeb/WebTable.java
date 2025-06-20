package com.demo.SelWeb;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("file:///Users/ma-58/New/sample_testing/src/test/java/com/demo/SelWeb/test.html");
        driver.manage().window().maximize();

        WebElement text = driver.findElement(By.xpath("//table/tbody/tr[3]/td[1]"));
        System.out.println("Specific Cell: " + text.getText());
        

        List<WebElement> tRow = driver.findElements(By.xpath("//table/tbody/tr"));
        System.out.println("Rows: " + tRow.size());

        List<WebElement> tCol = driver.findElements(By.xpath("//table/tbody/tr[1]/th"));
        System.out.println("Columns: " + tCol.size());

        System.out.println("Column Headers:");
        for (WebElement header : tCol) {
            System.out.print(header.getText() + "\t");
        }
        System.out.println();


        // Loop through all rows and columns
        for (int i = 2; i <= tRow.size(); i++) {
            for (int j = 1; j <= tCol.size(); j++) {
                String cellText = driver.findElement(By.xpath("//table/tbody/tr[" + i + "]/td[" + j + "]")).getText();
                System.out.print(cellText + "\t");
            }
            System.out.println(); // new line after each row
        }

        driver.quit();
    }
}
