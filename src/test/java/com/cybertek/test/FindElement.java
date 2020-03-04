package com.cybertek.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
    public static void main(String[] args) throws InterruptedException {
        /*
        1-locator 1 ID
        task
        go to cybertek okta login page
        write email to the text
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("htttps://www.cybertekschool.okta.com");


        /*
        1.find the text box first --->finfElement() from webDriver
         */
        Thread.sleep(3000);
        WebElement emailBox=driver.findElement(By.id("okta-signin-username"));
        emailBox.sendKeys("edogeda@yahoo.com");
        //write your password totext box

    }
}
