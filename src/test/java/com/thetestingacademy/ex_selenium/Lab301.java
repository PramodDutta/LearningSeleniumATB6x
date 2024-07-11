package com.thetestingacademy.ex_selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Lab301 {


    public static void main(String[] args) {

//        ChromeDriver driver = new ChromeDriver();
//        // Selenium 3.0
//        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        // JSON wire protocol
//        driver.get("https://sdet.live");


        // Selenium 4.0
        // Selenium manager - W3C protocol
        // opera Removed - :)
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://sdet.live");


    }

}
