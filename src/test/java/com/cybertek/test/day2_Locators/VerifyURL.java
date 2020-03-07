package com.cybertek.test.day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURL {

    public static void main(String[] args) {
        /*
        go to Etsy web
        verify URL
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.esty.com/");
        driver.manage().window().maximize();
        //verify title--->
        //for verify URL-->

        String expectedURL="https://www.etsy.com";
        String actualURL=driver.getCurrentUrl();

        if(expectedURL.equals(actualURL)){
            System.out.println("pass");
        }else {
            System.out.println("FAIL");
            System.out.println("I expected " + expectedURL);
            System.out.println("The actual URL is: " + actualURL );
        }
        driver.close();

    }
}
