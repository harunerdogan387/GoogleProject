package com.google.pages;

import com.google.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrivacyAndTermsPage {
    public PrivacyAndTermsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='MyGDhe  YnafU']")
    public WebElement privacyTermsLogo;

//    @FindBy(xpath = "//*[@class='gb_Zc']")
//    public WebElement privacyTermsLogo;


}
