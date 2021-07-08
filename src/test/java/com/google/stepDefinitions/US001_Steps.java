package com.google.stepDefinitions;

import com.google.pages.MainPage;
import com.google.utilities.ConfigurationReader;
import com.google.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class US001_Steps {
    MainPage mainPage=new MainPage();
    @Given("User access to google main page")
    public void userAccessToGoogleMainPageWith(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.wait(2);
    }

    @And("User must verify on the google main page")
    public void userMustVerifyOnTheGoogleMainPage() {
        Assert.assertTrue(mainPage.googleImage.isDisplayed());
        System.out.println("Google main page is visible.");
    }
}
