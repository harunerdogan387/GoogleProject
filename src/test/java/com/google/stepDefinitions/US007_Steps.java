package com.google.stepDefinitions;

import com.google.pages.MainPage;
import com.google.pages.SignInPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class US007_Steps {
    MainPage mainPage=new MainPage();
    SignInPage signInPage=new SignInPage();

    @And("User should be see the Sign in button")
    public void userShouldBeSeeTheSignInButton() {
mainPage.signinButton.isDisplayed();
    }

    @And("User should be click the Sign in Button")
    public void userShouldBeClickTheSignInButton() {
        mainPage.signinButton.click();
    }

    @Then("User should be verify the Sign in page")
    public void userShouldBeVerifyTheSignInPage() {
        signInPage.messageText.isDisplayed();
        System.out.println(signInPage.messageText.getText());
    }
}
