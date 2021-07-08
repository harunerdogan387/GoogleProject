package com.google.stepDefinitions;

import com.google.pages.ImagesPage;
import com.google.pages.MainPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US005_Steps {
    MainPage mainPage=new MainPage();
    ImagesPage imagesPage=new ImagesPage();

    @And("User should bee see the Images link")
    public void userShouldBeeSeeTheImagesLink() {
        Assert.assertTrue(mainPage.imagesButton.isDisplayed());
    }

    @And("User should be click the Images link")
    public void userShouldBeClickTheImagesLink() {
        mainPage.imagesButton.click();
    }

    @Then("User should be verify the Images page")
    public void userShouldBeVerifyTheImagesPage() {
        //Assert.assertTrue(imagesPage.imagesText.isDisplayed());
        Assert.assertTrue(imagesPage.imagesText.getText().equals("Images"));
        System.out.println("Images page is visible");
    }
}
