package com.demo.SelWeb;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTabWindow {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        System.out.println(driver.getTitle());
        //driver.switchTo().newWindow(WindowType.WINDOW);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.youtube.com/");
        System.out.println(driver.getTitle());
        //get window handles of open windows 
        Set<String> windowHandles=driver.getWindowHandles();
        List<String> handles=new ArrayList<String>();
        handles.addAll(windowHandles);
        driver.close();
        driver.switchTo().window(handles.get(0));
        System.out.println(driver.getTitle());

        


}
}