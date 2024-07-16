package com.thetestingacademy.ex_selenium_13072024;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Lab310 {
    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();

        driver.get("https://app.vwo.com/#/login");
        System.out.println(driver.getTitle());
        driver.quit();



    }
}
