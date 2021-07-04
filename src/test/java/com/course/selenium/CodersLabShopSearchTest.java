package com.course.selenium;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CodersLabShopSearchTest {
    private WebDriver driver;

    @Before
    public void beforeEach() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://prod-kurs.coderslab.pl/index.php");
    }

    @After
    public void afterEach() {
        //        driver.quit();
    }

    @Test
    public void shouldFindAllMugs() {
        WebElement element = driver.findElement(By.name("s"));
        element.clear();
        element.sendKeys("Mug");
        element.submit();

        List<WebElement> searchResults = driver.findElements(By.cssSelector("article.product-miniature div.product-description h2.product-title a"));
        for (WebElement elem : searchResults) {
            if (!elem.getText().contains("Mug")) {
                Assert.fail("Element should NOT be in search results: " + elem.getText());
            }
        }
    }

    @Test
    public void shouldFindAllTShirts() {
        WebElement element = driver.findElement(By.name("s"));
        element.clear();
        element.sendKeys("T-Shirt");
        element.submit();

        List<WebElement> searchResults = driver.findElements(By.cssSelector("article.product-miniature div.product-description h2.product-title a"));
        for (WebElement elem : searchResults) {
            if (!elem.getText().contains("T-Shirt")) {
                Assert.fail("Element should NOT be in search results: " + elem.getText());
            }
        }
    }
}
