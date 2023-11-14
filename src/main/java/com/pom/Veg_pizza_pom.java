package com.pom;

import com.Baseclass_of_Dominos.Base_class;
import org.openqa.selenium.By;

public class Veg_pizza_pom extends Base_class {


    public By VegPizza = By.xpath("(//div[contains(@data-label,'Veg Pizza')])[1]");

    public By AddtocartMargarita = By.xpath("(//div[contains(@data-label,'Margherita')])[2]//span[.='ADD TO CART']");

    public By Nothanks = By.xpath("//span[.='NO THANKS']");


    public By AddtocartPaneer = By.xpath("(//div[contains(@data-label,'Peppy Paneer')])[2]//span[.='ADD TO CART']");

    public By Paneer = By.xpath("(//span[.='Peppy Paneer'])[1]");


    public By Scrollpanner = By.xpath("(//span[.='Peppy Paneer'])[3]");


    public By RemoveMarg = By.xpath("(//div[@data-label='decrease'])[6]");

    public By RemovePepsi = By.xpath("(//div[@data-label='decrease'])[8]");



}
