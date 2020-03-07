package com.cybertek.test.day3_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPractice2 {
     /*
    User story: As a user, I should be able to login VyTrack app.

      test case1: login successfully
    1. go to VyTrack login page
    2. write username   data: storemanager52
    3.write password           UserUser123
   4. click login
    button
   5.Verify that the user is on the homepage
*/
     public static void main(String[] args) {

         WebDriverManager.chromedriver().setup();
         WebDriver driver=new ChromeDriver();

         driver.get("https://app.vytrack.com/user/login");
         driver.manage().window().maximize();

         driver.findElement(By.id("prependedInput")).sendKeys("storemanager52");
         driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");

         WebElement loginbutton=driver.findElement(By.id("_submit"));
         loginbutton.click();

         //verify that you are in the page

         String expectedTitle="Dashboard ";
          String actualTitle=driver.getTitle();

          if(expectedTitle.equalsIgnoreCase(actualTitle)) {
              System.out.println("pass");
          }else{
              System.out.println("fail");

              driver.close();
     }
     }
}
