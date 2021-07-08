package com.google.stepDefinitions;

import com.google.pages.AboutPage;
import com.google.pages.MainPage;
import com.google.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US002_Steps {
    MainPage mainPage=new MainPage();
    AboutPage aboutPage=new AboutPage();

    @And("User access to About page")
    public void userAccessToAboutPage() {
        Assert.assertTrue(mainPage.aboutButton.isDisplayed());
        //System.out.println("About button is visible");
    }

    @And("User should be click the About link")
    public void userShouldBeClickTheAboutLink() {
        mainPage.aboutButton.click();
    }

    @Then("User should be verify the About page")
    public void userShouldBeVerifyTheAboutPage() {
        Assert.assertTrue(aboutPage.aboutButton.isDisplayed());
        System.out.println("About page is visible");

    }
}
