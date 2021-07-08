package com.google.pages;

import com.google.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
    public SignInPage() {
     PageFactory.initElements(Driver.getDriver(), this);
}
@FindBy(xpath = "//*[text()='Use your Google Account']")
    public WebElement messageText;


}

