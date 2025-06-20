package com.demo.SelWeb;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickerPgm {
public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        //driver.get("https://www.calculator.net/");
        driver.get("https://jqueryui.com/datepicker/");
        driver.switchTo().frame(0);
        driver.findElement(By.id("datepicker")).click();
        String expDate="8";
        String expMonth="December";
        String expYear="2024";
        while (true) {

        String year=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
        String month=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
        if(year.equals(expYear) && month.equals(expMonth)){
                List<WebElement> date=driver.findElements(By.xpath("//table/tbody/tr/td"));
                for(WebElement e:date){
                        String dateText=e.getText();
                        if(dateText.equals(expDate)){
                                e.click();
                                break;
                        }
                }
               break; 
        }
        else{
                driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();
        }

}
}
}