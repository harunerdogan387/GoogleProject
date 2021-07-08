package com.google.stepDefinitions;

import com.google.pages.MainPage;
import com.google.pages.SearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US010_Steps {
    MainPage mainPage=new MainPage();
    SearchPage searchPage=new SearchPage();

    @And("User should be see the How Search work link")
    public void userShouldBeSeeTheHowSearchWorkLink() {
        mainPage.howSearchWorksLink.isDisplayed();
    }

    @And("User should be click the How Search work link")
    public void userShouldBeClickTheHowSearchWorkLink() {
        mainPage.howSearchWorksLink.click();
    }

    @Then("User should be verify the Search page")
    public void userShouldBeVerifyTheSearchPage() {
        Assert.assertTrue(searchPage.searchText.isDisplayed());
        System.out.println(searchPage.searchText.getText());
    }
}
