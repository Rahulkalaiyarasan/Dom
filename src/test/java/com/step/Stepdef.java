package com.step;

import com.pom.Bevrage_pom_class;
import com.pom.Pomclass;
import com.Baseclass_of_Dominos.Base_class;
import com.Runner.Runner_class;
import com.pom.Veg_pizza_pom;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.opentelemetry.sdk.metrics.internal.concurrent.DoubleAdder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.time.Duration;


public class Stepdef extends Base_class {

    public static WebDriver driver= Runner_class.driver ;



    Pomclass pom= new Pomclass();
    Veg_pizza_pom vp = new Veg_pizza_pom();

    Bevrage_pom_class bp = new Bevrage_pom_class();


    @Given("I am on the Domino's website")
    public void i_am_on_the_domino_s_website() {
        driver.get( "https://www.dominos.co.in/");
       driver.manage().window().maximize();
    }
    @When("I click {string}")
    public void iClick(String arg0) {


        driver.findElement(pom.orderbtn).click();
    }


    @And("I enter my address and select the first suggestion")
    public void iEnterMyAddressAndSelectTheFirstSuggestion() throws InterruptedException {
            driver.findElement(pom.Address).click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.findElement(pom.Dontallowbtn).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(pom.EnterArea).sendKeys("600049");

        Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.findElement(pom.pincode).click();

    }

    @And("I click the {string} menu")
    public void iClickTheMenu(String arg0) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//      driver.findElement(pom.suggestion).click();
        driver.findElement(vp.VegPizza).click();
        driver.findElement(vp.AddtocartMargarita).click();
        driver.findElement(vp.Nothanks).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(vp.AddtocartPaneer).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(bp.Quantity1).click();
        driver.findElement(bp.Quantity2).click();
    }

    @And("I click the {string} menu in the current page")
    public void iClickTheMenuInTheCurrentPage(String arg0)  {
        driver.findElement(bp.Beverages).click();
        driver.findElement(bp.pepsi).click();

        scroll(driver,driver.findElement(vp.Scrollpanner));

        for (int i= 0; i< 11; i++){
            driver.findElement(bp.pepsiadd).click();

        }

    }

    @And("I Removed the products from the cart")
    public void iRemovedTheProductsFromTheCart() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(vp.RemoveMarg).click();
        for (int i = 0; i < 6; i++) {
            driver.findElement(vp.RemovePepsi).click();
        }


        String subtotal = driver.findElement(pom.subtotal).getText();
        System.out.println(subtotal);



    }






    @And("I click {string} button")
    public void iClickButton(String arg0) {
    driver.findElement(pom.Checkout).click();


        String SUBTOTAL = driver.findElement(pom.subtotal).getText();
        System.out.println(SUBTOTAL);
        double SubTotal = Double.parseDouble(SUBTOTAL);
        String tax = driver.findElement(pom.Tax).getText();
        double TaxValue = Double.parseDouble(tax);
        System.out.println(TaxValue);


          double totalvalue  = Double.parseDouble(String.valueOf(SubTotal+ TaxValue));
        System.out.println("Total Value:"+totalvalue);

        String gtotal = driver.findElement(pom.grandTotal).getText();
        double GRANDTOTAL = Double.parseDouble(gtotal);

Assert.assertEquals(totalvalue,GRANDTOTAL);


//    driver.close();






//        toCloseBrowser(driver);

    }




}

