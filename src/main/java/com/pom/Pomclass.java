package com.pom;

import com.Baseclass_of_Dominos.Base_class;
import com.sun.org.apache.xml.internal.security.utils.XalanXPathAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomclass extends Base_class {


    public By searchclick = By.xpath("//input[@class='srch-cnt-srch-inpt']");


    public By searchclick1 = By.xpath("(//input[@type='text'])[1]");


    public By locateme = By.xpath("//span[normalize-space()='Locate Me']");

    public By orderbtn = By.xpath("//button[.='ORDER ONLINE NOW']");


    public By Address = By.xpath("//input[@class='srch-cnt-srch-inpt']");

    public By EnterArea = By.xpath("//input[@placeholder='Enter Area / Locality']");


    public By pincode = By.xpath("//li[contains(@data-label,'location_[object Object]')]//div[2]");

    public By locatebtn = By.xpath("//span[.='Locate Me']");

    public By Dontallowbtn = By.id("optInText");




    public By Checkout = By.xpath("//span[.='CHECKOUT']");



    public By subtotal = By.xpath("//span[@class='rupee sb-ttl']");

    public By Tax = By.xpath("(//span[@class='rupee'])[5]");


    public By grandTotal = By.xpath("//span[.='Grand Total']");

 }







