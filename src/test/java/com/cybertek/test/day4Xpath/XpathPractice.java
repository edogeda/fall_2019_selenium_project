package com.cybertek.test.day4Xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {

    public static void main(String[] args) {
        //go to practice login page
        //locste username box with absolute xpath
        //locate username with relative xpath
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        //go to practice login page
        driver.get("http://practice.cybertekschool.com/login");
          driver.manage().window().maximize();

          WebElement userNameBox=driver.findElement(By.xpath("/html/body/div/div[2]/div/div/form/div/div/input"));
          userNameBox.sendKeys("tom");
          //tagname[@attribute='value']

      //    <input type="text"  name="username"

          //relative
          driver.findElement(By.xpath("input@type='text']"));

    }
}
