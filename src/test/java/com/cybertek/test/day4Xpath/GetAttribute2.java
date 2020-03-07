package com.cybertek.test.day4Xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute2 {


    public static void main(String[] args) {
        /*


        go to http://practice.cybertekschool.com/forget password";
           locate

         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/forget password");
         //locate Example 1
        WebElement example1=driver.findElement(By.linkText("Example1:Element on page"));
    }
}
