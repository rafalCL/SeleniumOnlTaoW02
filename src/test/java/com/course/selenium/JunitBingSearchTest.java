package com.course.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitBingSearchTest {
    private WebDriver driver;

    @Before
    public void beforeEach() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.bing.com");
    }

    @After
    public void afterEach() {
        //        driver.quit();
    }

    @Test
    public void shouldFindInBingCom() {
        WebElement element = driver.findElement(By.name("q"));
        element.clear();
        element.sendKeys("Euro 2020");
        element.submit();
    }
}
