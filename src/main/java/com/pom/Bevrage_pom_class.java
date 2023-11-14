package com.pom;

import org.openqa.selenium.By;

public class Bevrage_pom_class {

    public By Beverages = By.xpath("//span[.='BEVERAGES']");

    public By Quantity1 = By.xpath("(//div[@data-label='increase'])[5]");


    public By Quantity2 = By.xpath("(//div[@data-label='increase'])[6]");


    public By pepsi = By.xpath("//div[contains(@data-label,'Pepsi 295 ml')]//span[.='ADD TO CART']");



    public By pepsiadd = By.xpath("(//div[@data-label='increase'])[8]");







}
