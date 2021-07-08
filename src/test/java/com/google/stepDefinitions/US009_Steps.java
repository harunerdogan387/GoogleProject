package com.google.stepDefinitions;

import com.google.pages.BusinessPage;
import com.google.pages.MainPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US009_Steps {
    MainPage mainPage=new MainPage();
    BusinessPage businessPage=new BusinessPage();

    @And("User should be see the Business link")
    public void userShouldBeSeeTheBusinessLink() {
        mainPage.businessLink.isDisplayed();
    }

    @And("User should be click the Business link")
    public void userShouldBeClickTheBusinessLink() {
        mainPage.businessLink.click();
    }

    @Then("User should be verify the Business page")
    public void userShouldBeVerifyTheBusinessPage() {
        Assert.assertTrue(businessPage.smallBusinessMessage.isDisplayed());
        System.out.println(businessPage.smallBusinessMessage.getText());
    }
}
