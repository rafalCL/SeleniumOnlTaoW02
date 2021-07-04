package com.course.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GoogleSearchTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
//        WebDriver driver = new FirefoxDriver();
//        System.setProperty("webdriver.ie.driver", "src/test/resources/drivers/IEDriverServer.exe");
//        WebDriver driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        driver.get("http://www.bing.com");
        WebElement element = driver.findElement(By.name("q"));
        element.clear();
        element.sendKeys("Coderslab");
        element.submit();
//        driver.quit();
    }
}