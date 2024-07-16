package com.thetestingacademy.ex_selenium_16072024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Lab315 {
    @Test
    public void testVerifyFREETrial() {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest");
        //edgeOptions.setPageLoadStrategy(PageLoadStrategy.NONE);

        WebDriver driver = new EdgeDriver(edgeOptions);

        driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");
        System.out.println(driver.getTitle());


//       Default Locator Strategy - ID,  Name, Class - Unique - Super Good.
        // Xpath or CSS Selector Strategy
        //  Which is good, xpath or css Selector?
        //  Css Selectors -> little fast, Nowdays since more ram - xpath  == css selector
        // Xpath -> , css Seelctor -
        // 25Test - mixture, it depends - sometimes xpath easy -

        // Xpath or Css Selector - converted to each vice -
        // Css Selector - Css Engine - little fast to find the element

        // What is XPath?
        // XPath is a query language.
        // for selecting nodes from an XML document.
        // HTML -> xml type of document - tag based - A
        // XPath was defined by the World Wide Web Consortium.
        // All the major browsers understand and supports it. W3C

        // Type of Xpath

        // Absolute Xpath - Full Xpath - Type #1
        // /html/body/div[2]/div[1]/div[2]/div/div[1]/div/div/div[3]/form[1]/ul/li[1]/div/input
        // It is too long -
        // prone to change - any change in div or html - Axpath will  work
        // no BODY USe THIS


        // Relative Xpath (with Query)
        // Core Logic - //tagName[@attribute='value']
        // Selenium -id -?
        // || //input[@id="js-login-confirm-email"]


//        WebElement btnElement_ID = driver.findElement(By.id("btn-make-appointment"));
//        WebElement btnElement_CN = driver.findElement(By.className("btn-lg"));
//        WebElement btnElement_PTEXT = driver.findElement(By.partialLinkText("Make"));
//        WebElement btnElement_LTEXT = driver.findElement(By.partialLinkText("Make Appointment"));
        WebElement btnElement_AT = driver.findElement(By.xpath("//a[@href='./profile.php#login']"));

        // Multiple a tag  - not recommen
//        WebElement btnElement_TagName = driver.findElement(By.tagName("a"));
        btnElement_AT.click();

        // Strategy to find the elements
        // id="txt-username" - Unique
        // name="username" - Unique
        // class="form-control" - Not Unique - Find multiple - useless
        // Link - Partial - Since it is not a  a chane , we can't use
        // Relative Xpath  ||
            // Functions
           //  Axes
           // Multiple Attributes - make it unique
        // Css Selectors

        // This is slow, we are going to find the first all the elements
        //List<WebElement> username_element = driver.findElements(By.xpath("//*[@placeholder='Username']"));

        // here, input -> place holder
        List<WebElement> username_element = driver.findElements(By.xpath("//input[@placeholder='Username']"));
        username_element.get(1).sendKeys("John Doe");


        // Xpath Functions
        // Where they are useful? - dynamic text or elements
        // They are usefull when in the value - some constant and some dynamic
        //  title = "pramod_2323"
        // starts-with -> pramod, contains - Partial Match

        // //img[contains(@title,"Flip")]

        // //img[starts-with(@title,"Flip")]
        // substring-after

        // normalize-space = remove the  title= " pramod "

        //a[text()="Make Appointment"] - Exact Match


        // Multiple Attributes

        // Operators - AND & OR
        //And Example
        ////tag_name[@name = 'Name value' and @id = ‘ID value’]
        // //a[text()="Make Appointment" and contains(@id,"btn-make-appointment")]


        //* -> Select all the nodes - Select * from all element in html; all elemts
        //input -> Select all input box - select inputs from all the in html - all inputs
        //input[@title="flipkart"] = select input from all the html where title = flipkart; =1
        //input[text()="flipkart"] = select input from all the html where text() = flipkart; =1



        // Xpath - Axes
        // Go the parent or child when you know about the son.
        //




        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();


    }
}
