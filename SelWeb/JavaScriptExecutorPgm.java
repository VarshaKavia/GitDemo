package com.demo.SelWeb;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorPgm {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        JavascriptExecutor js=(JavascriptExecutor)driver;
        WebElement name=driver.findElement(By.id("name"));
        // js.executeScript("document.getElementById('name').value='John Doe';");
        // WebElement submit=driver.findElement(By.xpath("//button[@class=\"submit-btn\"]"));
        // js.executeScript("arguments[0].click();", submit);
        // js.executeScript("history.go(0)");
        // System.out.println("Page refreshed");
        // String domainName=js.executeScript("return document.domain;").toString();
        // System.out.println(domainName);
        // String title=js.executeScript("return document.title;").toString();
        // System.out.println(title);
        // String url=js.executeScript("return document.URL;").toString();
        // System.out.println(url);
        js.executeScript("arguments[0].style.border='3px solid blue';", name);
        js.executeScript("document.body.style.zoom ='100%'");
        System.out.println(js.executeScript("return window.innerHeight;").toString()
        );
        System.out.println(js.executeScript("return window.innerWidth;").toString()
        );
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
        js.executeScript("alert('My Alert.');");
        driver.switchTo().alert().accept();
        //js.executeScript("window.location='https://www.facebook.com/'");

        String originalColor = name.getCssValue("backgroundColor");
        String flashColor = "rgb(255,0,0)"; // bright red

        for (int i = 0; i < 10; i++) {
            changeColor(flashColor, name, js);
            sleep(200);
            changeColor(originalColor, name, js);
            sleep(200);
        }
    }

    private static void changeColor(String color, WebElement name, JavascriptExecutor js) {
        js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", name);
    }

    private static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            // Ignore
        }
    }




}
