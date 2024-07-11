package com.thetestingacademy.ex_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab305 {

    @Test
    public void testVWOLoginTitle(){
        WebDriver driver = new EdgeDriver();
        //driver.get("app.vwo.com"); // http mandatory
        driver.get("https://app.vwo.com");
        Assert.assertEquals(driver.getTitle(), "Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");
        driver.quit();
    }
}
