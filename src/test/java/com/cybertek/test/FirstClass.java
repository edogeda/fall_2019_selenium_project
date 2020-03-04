package com.cybertek.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello Selenium");
        WebDriverManager.chromedriver().setup();

        //WebDriver object-->Interface
        //I have a driver
        WebDriver driver= new ChromeDriver();
        //I want to open google home page
        driver.get("http://www.google.com");
        //navigate().back()
//1  go to google    2- go to cybertek practice websidriver.

driver.get("https://www.google.com");
Thread.sleep(3000);
driver.navigate().to("http://prictice.cybertekschool.com/");
Thread.sleep(3000);
driver.navigate().back();

//navigate().forward()
 //go to practice-->go to google-->go back to practice
 //forward to google


    }
}
