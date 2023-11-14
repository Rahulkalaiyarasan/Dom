package com.Runner;

import com.Baseclass_of_Dominos.Base_class;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/Dominos.feature",
        glue ="com/step",
        monochrome = true,
        dryRun = false
)


public class Runner_class extends Base_class {



    @BeforeClass
    public static void start() {
        driver=new ChromeDriver();



    }






}
