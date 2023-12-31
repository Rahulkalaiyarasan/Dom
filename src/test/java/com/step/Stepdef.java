package com.step;

import com.pom.Bevrage_pom_class;
import com.pom.Pomclass;
import com.Baseclass_of_Dominos.Base_class;
import com.Runner.Runner_class;
import com.pom.Veg_pizza_pom;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
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
    public void iEnterMyAddressAndSelectTheFirstSuggestion() {
            driver.findElement(pom.Address).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        click(pom.getDontallowbtn());


        driver.findElement(pom.Dontallowbtn).click();

        driver.findElement(pom.EnterArea).sendKeys("600049");
        driver.findElement(pom.pincode).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //sendkeys(pom.getAddress(), "Chrompet");
//        Towait(driver, 3);
//        click(pom.getDontallowbtn());
//        click(pom.getLocatebtn());
    }

    @And("I click the {string} menu")
    public void iClickTheMenu(String arg0) {
//        click(pom.getVegPizza());
        driver.findElement(vp.VegPizza).click();


        driver.findElement(vp.AddtocartMargarita).click();
        driver.findElement(vp.Nothanks).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        scroll(driver, pom.Paneer);
        driver.findElement(vp.AddtocartPaneer).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(bp.Quantity1).click();
        driver.findElement(bp.Quantity2).click();
    }

    @And("I click the {string} menu in the current page")
    public void iClickTheMenuInTheCurrentPage(String arg0)  {
        driver.findElement(bp.Beverages).click();
        driver.findElement(bp.pepsi).click();
//        scroll(driver,pom.Scrollpanner);
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

//    driver.close();

    //    Assert.assertEquals();





//        toCloseBrowser(driver);

    }




}

