package com.cybertek.test.day3_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumOH2 {
    public static void main(String[] args) throws InterruptedException {
        /*
        1-go to https://aytomationpractice.com
        2-search for 'tshirt'in searchbox+clicenter or clic search button
        3-validate you got 'no results' on UI
        4-search for t-shirt
        5-validate there is 1 result found

         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get(("http://automationpractice.com"));

        WebElement search_box = driver.findElement(By.id("searc_query_top"));
        // WebElement-class


        search_box.sendKeys("tshirt" + Keys.ENTER);

        WebElement error = driver.findElement(By.className("aler alert_waring"));
        String errorText = error.getText();

        System.out.println("Error message" + errorText);

        search_box.sendKeys("tshirt" + Keys.ENTER);
       try {
           Thread.sleep(5000);
       }catch (InterruptedException e){
           e.printStackTrace();
       }

        WebElement count=driver.findElement(By.className("product_count"));
        System.out.println("item found:"+ count.getText());

        driver.quit();
    }

}
