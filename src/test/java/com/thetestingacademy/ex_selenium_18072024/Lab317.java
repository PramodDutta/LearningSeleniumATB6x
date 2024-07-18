package com.thetestingacademy.ex_selenium_18072024;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Lab317 {

    EdgeDriver driver;

    @BeforeTest
    public void openBrowser() {
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver(options);
    }


    @Test(groups = "QA")
    @Description("Test Case Description")
    public void testVerifyFREETrial() throws InterruptedException {

        // Navigate to the - https://www.ebay.com/b/Desktops-All-In-One-Computers/171957/bn_1643067
        driver.get("https://www.ebay.com/b/Desktops-All-In-One-Computers/171957/bn_1643067");
        System.out.println(driver.getTitle());
        // Search Element
        driver.manage().window().maximize();
        // #gh-ac
        // input[id="gh-ac"] -> xpath -> //input[@id="gh-ac"]
        WebElement searchBox = driver.findElement(By.cssSelector("input[id='gh-ac']"));
        searchBox.sendKeys("macmini"); // Find the "macmini"

        //click search
        // .gh-spr
        // input[value="Search"]

// .gh-spr
//        WebElement searchBoxButton = driver.findElement(By.cssSelector(".gh-spr"));
        WebElement searchBoxButton = driver.findElement(By.cssSelector("input[value='Search']"));
        searchBoxButton.click();



        Thread.sleep(3000); // We will  replace this in the future.

        // Print all the titles
        // .s-item__title
        List<WebElement> searchTitles  = driver.findElements(By.cssSelector(".s-item__title"));
        List<WebElement> searchTitlesPrices = driver.findElements(By.cssSelector(".s-item__price"));
//        for (WebElement title : searchTitles){
//            System.out.println(title.getText());
//        }
//
//        for (WebElement prices: searchTitlesPrices){
//            System.out.println(prices.getText());
//        }

        // // Ensure both lists are of the same size to avoid IndexOutOfBoundsException
        int size = Math.min(searchTitles.size(),searchTitlesPrices.size());
        for (int i = 0; i < size; i++) {
            System.out.println("Title: " + searchTitles.get(i).getText() + " || " + "Price: " + searchTitlesPrices.get(i).getText());
            System.out.println();
        }

        // img[title*="Flip"] - contains
        // img[title^="Flip"] - starts-wiht
        // img[title$="Flip"] - end-with
        // div.first > span:nth-child(2n+1)
        // div.first > span


        // Select -> simple, custom Select(div, ui-li) - different appraoch)


        // Why Do We Need Waits In Selenium?
        // do this
        // Thread.sleep(3) - JVM to stop the execution - Worst type wait. - Halt JVM
        // do that


        // Implicit Wait - Bad
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Gives No Such Element Exception.







    }
    @AfterTest
    public void closeBrowser() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
