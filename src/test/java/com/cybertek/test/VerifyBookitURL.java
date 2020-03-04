package com.cybertek.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyBookitURL {
    public static void main(String[] args) {
        WebDriverManager.chromedriver();
        WebDriver driver = new ChromeDriver();

        driver.get("httt:/cybertek-reservation-qa.herokuapp.com/sign-in");
        driver.manage().window().maximize();
        String expectedPartialURL = "cybertek-reservation";
        String actualURL = driver.getCurrentUrl();

        //https://cybertek-reservation-qa.herokuapp.com/sin-in
        if (actualURL.contains(expectedPartialURL)) ;
        System.out.println("pass");








    }

}
