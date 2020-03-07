package com.cybertek.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    /*
            write a return method which returns webDriver
            name : getDriver
            it takes a string as a parameter > browser type
            returns Chrome driver
                    */
    public static WebDriver getDriver(String typeBrowser) {
        //local variables should be initialized cannot be empty like this >>  WebDriver driver;
        WebDriver driver = null;
        switch (typeBrowser.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
        }
        return driver;
    }
}