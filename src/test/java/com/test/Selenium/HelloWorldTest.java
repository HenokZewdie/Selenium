package com.test.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HelloWorldTest {

    @Test
    public void openChrome() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/henokwordoffa/IdeaProjects/Selenium/src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://stackoverflow.com/");
        //driver.findElement(By.xpath(".//[@id=\"search\"]/div")).sendKeys("java");
        WebElement element=driver.findElement(By.name("q"));
        Thread.sleep(5000L);
        element.sendKeys("Microservice");
        Thread.sleep(5000L);
        //element.sendKeys(Keys.RETURN);
        element.submit();
        Thread.sleep(10000L);
        //driver.get("http://dummy.restapiexample.com/api/v1/employees");
        driver.get("https://reqbin.com/echo/get/json");
        String test = driver.getPageSource();
        if(driver.getPageSource().contains("trueo"))
        {
            System.out.println("PUBLISHED");
        }
        else
        {
            System.out.println("NOT PUBLISHED");
        }
    }
}