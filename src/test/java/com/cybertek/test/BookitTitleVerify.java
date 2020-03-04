package com.cybertek.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookitTitleVerify {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("http://cybertek-reservation-qa.herokuapp.com/sign-in");
           //expected vs actual

        String expectedTitle="Bookit";
        String actualTitle=driver.getTitle();
        if(expectedTitle.equals(actualTitle)){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
            System.out.println("I expected " + expectedTitle);
            System.out.println("The actual URL is " + actualTitle);

        }

        }
}
