package com.cybertek.test.day3_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

    /*
    go google
    verify title
    verify url
    veify actual and expectedResults.
     */
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        if (expectedTitle.equals(actualTitle)) {
            System.out.println("pass");
        } else {

            System.out.println("fail");
            System.out.println("i expect to see "+ expectedTitle);
            System.out.println("I wanted to see"+ actualTitle);

            driver.close();
        }
    }
}