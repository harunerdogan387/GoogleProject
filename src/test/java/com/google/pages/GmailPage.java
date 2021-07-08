package com.google.pages;

import com.google.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailPage {
    public GmailPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='to continue to Gmail']")
    public WebElement gmailTextMessage;

    @FindBy(xpath = "//a[@href='/gmail/about/']")
    public WebElement gmailLogo;
}
