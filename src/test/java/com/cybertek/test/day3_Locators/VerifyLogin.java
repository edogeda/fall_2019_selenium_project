package com.cybertek.test.day3_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogin {
    /*
  go to login page
  enter username
  enter password
  clic login button
  verify the welcome"well come to the secure area,when you are done clic logout botton"

     */


    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/login");
        driver.manage().window().maximize();
        driver.findElement(By.name("username")).sendKeys("tomsmith");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword");
        driver.findElement(By.id("wooden_spoon")).click();
        //locating the welcome massage with tagname
        WebElement welcomeMassage = driver.findElement(By.tagName("h4"));
        //  Verify the welcome massage
        //expected vs actual
        String expectedMassage = "Welcome to the Secure Area. When you are done click logout below.";
        // String vs WebElement
        //getText() --> convert webElement to String
        //
        String actualWelcomeMassage = welcomeMassage.getText();
        if (expectedMassage.equalsIgnoreCase(actualWelcomeMassage)){
            System.out.println("PASSS");
        }else {
            System.out.println("Fail");
        }

        driver.close();

    }



}
