package com.cybertek.test.day1_navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class VerifyTitle {
    public static void main(String[] args) throws InterruptedException {
        /*
        FIRST YOU CHECK MANUALLY IF THE WEB PAGE UP AND RUNNING
        1.goto cybertek practice website
        2.verify title expected title: Practice
        "http://practice.cybertekschool.com/"
         */
        //CONNECT BROWSER AND DRIVER
        WebDriverManager.chromedriver().setup(); //1st step (SETUP BROWSER)
        WebDriver driver = new ChromeDriver();   //2nd step (CREATE OBJECT OF DRIVER
        driver.get("http://practice.cybertekschool.com/");
        driver.manage().window().maximize();
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();
        if (expectedTitle.equals(actualTitle)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.println("I expected " + expectedTitle);
            System.out.println("The actual title is " + actualTitle);
        }
        Thread.sleep(2000);
        driver.close();
    }
}