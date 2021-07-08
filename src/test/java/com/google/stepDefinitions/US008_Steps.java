package com.google.stepDefinitions;

import com.google.pages.AdvertisingPage;
import com.google.pages.MainPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class US008_Steps {
    MainPage mainPage=new MainPage();
    AdvertisingPage advertisingPage=new AdvertisingPage();

    @And("User should be see the Advertising link")
    public void userShouldBeSeeTheAdvertisingLink() {
        mainPage.advertisingLink.isDisplayed();
    }

    @And("User should be click the Advertising link")
    public void userShouldBeClickTheAdvertisingLink() {
        mainPage.advertisingLink.click();
    }

    @Then("User should be verify the Advertising page")
    public void userShouldBeVerifyTheAdvertisingPage() {
        Assert.assertTrue(advertisingPage.adsLogo.isDisplayed());
        System.out.println(advertisingPage.adsLogo.getText());
    }


}
