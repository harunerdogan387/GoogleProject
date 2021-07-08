package com.google.stepDefinitions;

import com.google.pages.GmailPage;
import com.google.pages.MainPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US004_Steps {
    MainPage mainPage=new MainPage();
    GmailPage gmailPage=new GmailPage();

    @And("User should bee see the Gmail link")
    public void userShouldBeeSeeTheGmailLink() {
        Assert.assertTrue(mainPage.gmailButton.isDisplayed());
        //System.out.println("Gmail button is visible");
    }

    @And("User should be click the Gmail link")
    public void userShouldBeClickTheGmailLink() {
        mainPage.gmailButton.click();
    }

    @Then("User should be verify the Gmail page")
    public void userShouldBeVerifyTheGmailPage() {
        Assert.assertTrue(gmailPage.gmailLogo.isDisplayed());
        System.out.println(gmailPage.gmailLogo.getText()+" logo is displayed." );
    }
}
