
package com.Baseclass_of_Dominos;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class Base_class {


    public static WebDriver driver;

    public static void scroll(WebDriver driver,WebElement e) {

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", e);



    }

    public static void explicitwait(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
    }

    public static void parentHandle(WebDriver driver) {
        String windowHandle = driver.getWindowHandle();
        driver.switchTo().window(windowHandle);
    }









}
