package com.google.stepDefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.pages.GoogleAppsPage;
import com.google.pages.MainPage;
import com.google.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.util.*;

import static com.google.utilities.Driver.getDriver;
import static com.google.utilities.Driver.selectAnItemFromDropdown;

public class US006_Steps {
    MainPage mainPage = new MainPage();
    GoogleAppsPage googleAppsPage = new GoogleAppsPage();
    String filePath = "src/test/resources/testData/googleAppsList.txt";
    Actions actions = new Actions(Driver.getDriver());

    @And("User should bee see the Google apps link")
    public void userShouldBeeSeeTheGoogleAppsLink() {
        mainPage.googleApps.isDisplayed();

    }

    @And("User should be click the Google apps link")
    public void userShouldBeClickTheGoogleAppsLink() {
        mainPage.googleApps.click();
    }

    @Then("User should be verify the Google apps")
    public void userShouldBeVerifyTheGoogleApps() {


        System.out.println(getDriver()
                .findElement(By.xpath("//*[@role='presentation'][@frameborder='0']")).getSize());
        Assert.assertTrue(!getDriver()
                .findElement(By.xpath("//*[@role='presentation'][@frameborder='0']")).getSize().equals((0)));
        getDriver().findElement(By.xpath("//*[@role='presentation'][@frameborder='0']")).click();
        System.out.println(getDriver().findElement(By.xpath("//*[text()='Overview']")).getText());



        System.out.println("okeyyyy123");

}

}
