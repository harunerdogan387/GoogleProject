package com.google.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.google.utilities.Driver;

public class MainPage {
    public MainPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='About']")
    public WebElement aboutButton;

    @FindBy(xpath = "//*[text()='Store']")
    public WebElement storeButton;

    @FindBy(xpath = "//*[text()='Gmail']")
    public WebElement gmailButton;

    @FindBy(xpath = "//*[text()='Images']")
    public WebElement imagesButton;

    @FindBy(xpath = "//*[@aria-label='Google apps']")
    public WebElement googleApps;

    @FindBy(xpath = "//*[text()='Sign in']")
    public WebElement signinButton;

    @FindBy(xpath = "//*[@class='lnXdpd']")
    public WebElement googleImage;

    @FindBy(xpath = "//*[@class='gLFyf gsfi']")
    public WebElement inputTextBox;

    @FindBy(xpath = "//*[@class='CcAdNb']")
    public WebElement focusableIcon;

    @FindBy(xpath = "//*[@class='XDyW0e']")
    public WebElement microphoneIcon;

    @FindBy(xpath = "(//*[@aria-label='Google Search'][2]")
    public WebElement googleSearchButton;

    @FindBy(xpath="//input[@id='gbqfbb']")
    public WebElement dropDownItem00;

    @FindBy(xpath = "//*[text()='Carbon neutral since 2007']")
    public WebElement carbonNeutralSign;

    @FindBy(xpath = "//*[text()='Advertising']")
    public WebElement advertisingLink;

    @FindBy(xpath = "//*[text()='Business']")
    public WebElement businessLink;

    @FindBy(xpath = "//a[@class='pHiOh'][3]")
    public WebElement howSearchWorksLink;

    @FindBy(xpath = "//*[text()='Privacy']")
    public WebElement privacyLink;

    @FindBy(xpath = "//*[text()='Terms']")
    public WebElement termsLink;

    @FindBy(xpath = "//*[text()='Settings']")
    public WebElement settingsButton;



}