package com.google.stepDefinitions;

import com.google.utilities.ConfigurationReader;
import com.google.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before // her scenario'dan once calisir,junitteki before,TestNG'deki beforeMethod gibi
    public void setup(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }


//    @After
//    public void tearDown(Scenario scenario){
//        final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
//        if (scenario.isFailed()) {
//            scenario.attach(screenshot, "image/png","screenshots");
//        }
//        Driver.closeDriver();
//    }
}
