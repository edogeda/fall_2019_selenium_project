package com.cybertek.test.day4Xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClicVsSummit {
    /*

        Click()
        sybmit()
        task:
        1. go to forgot password web page
        http://practice.cybertekschool.com/forgot_password
       2.  enter any email
       3. click "retrieve password" bttb
        4. verify the URL is:
        http://practice.cybertekschool.com/email_sent

     */
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        //go to forgot password page
        driver.get(" http://practice.cybertekschool.com/forget password");
        driver.manage().window().maximize();
        //enter any email
        //locat the email box first

        WebElement emailBox=driver.findElement(By.name("email"));
                //enter email--->sendKeys()
        emailBox.sendKeys("abc@gmail.com");

        //click retrieve  password

    }

}
