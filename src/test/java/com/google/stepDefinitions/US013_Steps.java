package com.google.stepDefinitions;

import com.google.pages.CarbonNeutralPage;
import com.google.pages.MainPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US013_Steps {
    MainPage mainPage=new MainPage();
    CarbonNeutralPage carbonNeutralPage=new CarbonNeutralPage();

    @And("User should be see the Carbon Neutral link")
    public void userShouldBeSeeTheCarbonNeutralLink() {
        mainPage.carbonNeutralSign.isDisplayed();
    }

    @And("User should be click the Carbon Neutral link")
    public void userShouldBeClickTheCarbonNeutralLink() {
        mainPage.carbonNeutralSign.click();
    }

    @Then("User should be verify the Carbon Neutral page")
    public void userShouldBeVerifyTheCarbonNeutralPage() {
        Assert.assertTrue(carbonNeutralPage.carbonText.isDisplayed());
        System.out.println(carbonNeutralPage.carbonText.getText());
    }
}
