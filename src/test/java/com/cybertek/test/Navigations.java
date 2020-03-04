package com.cybertek.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {
    public static void main(String[] args) throws InterruptedException {
        /*
          Navigation:
       driver.navigate().to("URL")
       driver.navigate().back()
       driver.navigate().forward()
       driver.navigate().refresh()
        */
        // go to practice

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        // I want to see the full window


        String practiceWebURL="http://practice.cybertekschool.com";
        //go to practice
        driver.get(practiceWebURL);
        driver.manage().window().fullscreen();
        driver.manage().window().maximize();
        Thread.sleep(3000);
        //go to google
        String gglURL="http://wwww.google.com";

        driver.navigate().to(gglURL);
        Thread.sleep(3000);
        //back to practice
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

        //close drive
        //close the current web browser only
        driver.close();

        driver.quit();










    }
}
