package com.google.pages;

import com.google.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutPage {
    public AboutPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='list-1']/li[1]")
    public WebElement aboutButton;

    @FindBy(xpath = "//*[@id='list-1']/li[2]")
    public WebElement productsButton;

    @FindBy(xpath = "//*[@id='list-1']/li[3]")
    public WebElement commitmentsButton;

    @FindBy(xpath = "//*[@id='list-1']/li[4]")
    public WebElement storiesButton;

    @FindBy(xpath = "//*[@id='list-1']/li[5]")
    public WebElement theKeywordButton;


}
