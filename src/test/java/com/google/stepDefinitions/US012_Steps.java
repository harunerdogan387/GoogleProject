package com.google.stepDefinitions;

import com.google.pages.MainPage;
import com.google.pages.PrivacyAndTermsPage;
import io.cucumber.java.en.And;

public class US012_Steps {
    MainPage mainPage=new MainPage();
    PrivacyAndTermsPage privacyAndTermsPage=new PrivacyAndTermsPage();
    @And("User should be see the Terms link")
    public void userShouldBeSeeTheTermsLink() {
        mainPage.termsLink.isDisplayed();
    }

    @And("User should be click the Terms link")
    public void userShouldBeClickTheTermsLink() {
        mainPage.termsLink.click();
    }
}
