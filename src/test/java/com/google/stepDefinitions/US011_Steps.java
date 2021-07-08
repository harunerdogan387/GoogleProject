package com.google.stepDefinitions;

import com.google.pages.MainPage;
import com.google.pages.PrivacyAndTermsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US011_Steps {
    MainPage mainPage=new MainPage();
    PrivacyAndTermsPage privacyAndTermsPage=new PrivacyAndTermsPage();

    @And("User should be see the Privacy link")
    public void userShouldBeSeeThePrivacyLink() {
        mainPage.privacyLink.isDisplayed();
    }

    @And("User should be click the Privacy link")
    public void userShouldBeClickThePrivacyLink() {
        mainPage.privacyLink.click();
    }

    @Then("User should be verify the Privacy & Terms page")
    public void userShouldBeVerifyThePrivacyTermsPage() {
        Assert.assertTrue(privacyAndTermsPage.privacyTermsLogo.isDisplayed());
        System.out.println(privacyAndTermsPage.privacyTermsLogo.getText());
    }
}
