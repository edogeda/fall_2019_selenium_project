package com.cybertek.test.day4Xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        //go to forgot password page
        driver.get(" http://practice.cybertekschool.com/forget password");
        driver.manage().window().maximize();

    }
}
