package com.cybertek.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

    public static void main(String[] args) throws InterruptedException {


        /*
        1 go to google website
        2 save the title in string veriable
        3 go to etsy
        4. save the Etst Title in a String
5. Navigate back to previouse page
6. Verify the title is same as step 2
7. Navigate forward to previoud page
8.Verify the title is same as step 4

         */
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");

        //full screen
        driver.manage().window().maximize();
        String gglexpectedTitle = "Google";
        Thread.sleep(3000);
        driver.navigate().to("https://www.etsy.com/");
        String etsyExpectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        Thread.sleep(3000);
        driver.navigate().back();  //google
        String actualGoogleTile = driver.getTitle();
        if(gglexpectedTitle.equals(actualGoogleTile)){
            System.out.println("pass");
        }else {
            System.out.println("FAIL");
            System.out.println("I expected title " + gglexpectedTitle);
            System.out.println("The actual URL is: " + actualGoogleTile );
        }
        driver.navigate().forward();  //etsy
        String etsyActualTitile = driver.getTitle();
        if(etsyExpectedTitle.equals(etsyActualTitile)){
            System.out.println("pass");
        }else {
            System.out.println("FAIL");
            System.out.println("I expected Title" + etsyExpectedTitle);
            System.out.println("The actual URL is: " + etsyActualTitile );
        }

        driver.close();
        driver.quit();






    }

}
