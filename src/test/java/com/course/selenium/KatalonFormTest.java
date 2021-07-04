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
import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class KatalonFormTest {
    private WebDriver driver;

    @Before
    public void beforeEach() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
    }

    @After
    public void afterEach() {
        //        driver.quit();
    }

    @Test
    public void shouldFillAndSubmitForm() {
        WebElement firstName = driver.findElement(By.cssSelector("input#first-name"));
        WebElement lastName = driver.findElement(By.cssSelector("input#last-name"));
        List<WebElement> options = driver.findElements(By.cssSelector("input[name=gender]"));
        WebElement dob = driver.findElement(By.cssSelector("input#dob"));
        WebElement role = driver.findElement(By.cssSelector("select#role"));
        List<WebElement> devWays = driver.findElements(By.cssSelector("div.development-ways input[type=checkbox]"));
        WebElement submit = driver.findElement(By.cssSelector("button#submit"));

        firstName.clear();
        firstName.sendKeys("Ala");

        lastName.clear();
        lastName.sendKeys("Makota");

        options.get(0).click();
        dob.sendKeys("07/28/2021");
        role.sendKeys("Technical Architect");
        devWays.get(1).click();
        devWays.get(3).click();
        devWays.get(5).click();

        submit.click();
    }
}
