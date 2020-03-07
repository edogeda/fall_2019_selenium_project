package com.cybertek.test.day4Xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextMethodOfPath {

    public static void main(String[] args) {
        /*
        go to http:practice.cybertekschool.com/context menu
        verify contex menu is on the page
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get(" http:practice.cybertekschool.com/context menu");
        WebElement text=driver.findElement(By.xpath("//h3[text()='context Menu'")
    }
}
