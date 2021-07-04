package com.course.selenium;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitGoogleSearchTest {
    private WebDriver driver;

    @Before
    public void beforeEach() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
    }

    @After
    public void afterEach() {
        //        driver.quit();
    }

    @Test
    public void shouldFindInGoogleCom() {
        WebElement element = driver.findElement(By.name("q"));
        element.clear();
        element.sendKeys("Coderslab");
        element.submit();
    }
}
