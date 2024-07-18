package com.thetestingacademy.ex_selenium_18072024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Lab316 {
    public void testVerifyFREETrial() {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");
        System.out.println(driver.getTitle());


        // Xpath - Query language to find the element in the HTML document.
        // Relative - 99%
        // Absolute - Not body  ignore - 1%

        // Core Logic  ->  //tagName[@attribute=value]
        // Xpath - Functions -> text(), contains, start-with, end-with(), sub-string, normlize-space - trim the text
        // Xpath Axes -> Ancestors, following-sibling, parent, child, descendants, preceding-siblings


        // CSS Selector -> All  these

        // Logic -  tagName[attribute=value] ->  //tagName[@attribute=value]

        // CSS selectors are used to select elements in an HTML or XML document
        // in order to apply styles or other manipulations to those elements.

        //  Normal Selector  -> Css Selector
        // By.id -> #id
        // className -> .class
        //  custom Attribute - <input type="text" data-qa="abc"/> -> [data-qa="abc"]
        // convert xpath -> css Selector also.

        // Css Selectors ->
        // contains Xpath contains() -> *
        // starts-with() - xpath -> ^
        // end-with() xpath -> $









    }
}
