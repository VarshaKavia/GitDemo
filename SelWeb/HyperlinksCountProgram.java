package com.demo.SelWeb;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperlinksCountProgram {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.calculator.net/");
        driver.manage().window().maximize();
        List<WebElement> linkElements=driver.findElements(By.tagName("a"));
        System.out.println("Total number of Links on the Webpage : "+linkElements.size());
        for(WebElement el:linkElements){
            System.out.println(el.getText());
        }
        WebElement link=driver.findElement(By.linkText("Fraction Calculator"));
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.COMMAND).click(link).keyUp(Keys.COMMAND).build().perform();
        

    }

}
