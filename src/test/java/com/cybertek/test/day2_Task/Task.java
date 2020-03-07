package com.cybertek.test.day2_Task;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    /*
    Task:
Go to amazon  https://www.amazon.com/
 Go to Ebay   https://www.ebay.com/
Enter a search term
Click on search button
Verify title contains search term

     */
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get(" https://www.amazon.com/");

        driver.navigate().to("  https://www.ebay.com/");
        WebElement searchBox=driver.findElement(By.name("_nkw"));
        searchBox.sendKeys("shoes"+ Keys.ENTER);
        WebElement searchBttn=driver.findElement(By.id("gh_btn"));
        searchBox.click();

      //  verifytitle contains term
        //expected vs actual

        String expectedparialTitle="shoes";
         String actual =driver.getTitle();





        driver.manage().window().maximize();

        String expectedResult = "www.amazon.com";

        String actualResult = driver.getTitle();
        if (actualResult.contains(expectedResult)) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
        driver.close();
    }
}
