package com.cybertek.test.day3_Locators;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class VerifyingErrorMassage {
    /*
  1-  go to login page http://practice.cybertekschool.com/login"
    2-enter invalid username
    3-enter invalid password
    4-verify the error massage
     */
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/login");
        driver.manage().window().maximize();
        Faker faker = new Faker();
        String username = faker.name().fullName();
        String password = faker.app().author();
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);

        driver.findElement(By.id("wooden_spoon")).click();

    }
}