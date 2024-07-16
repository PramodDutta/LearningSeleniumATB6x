package com.thetestingacademy.ex_selenium_11072024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Lab302 {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
       // WebDriver driver2 = new WebDriver();
        driver.get("https://sdet.live");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

    }
}
