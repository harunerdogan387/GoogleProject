package com.google.stepDefinitions;

import com.google.pages.MainPage;
import com.google.pages.StorePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US003_Steps {
    MainPage mainPage=new MainPage();
    StorePage storePage=new StorePage();

    @And("User access to Store page")
    public void userAccessToStorePage() {
        Assert.assertTrue(mainPage.storeButton.isDisplayed());
        //System.out.println("Store button is visible");
    }

    @And("User should be click the Store link")
    public void userShouldBeClickTheStoreLink() {
        mainPage.storeButton.click();
    }

    @Then("User should be verify the Store page")
    public void userShouldBeVerifyTheStorePage() {
        Assert.assertTrue(storePage.googleStoreLogo.isDisplayed());
        System.out.println("Store page is visible");
    }
}
