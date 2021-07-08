package com.google.pages;

import com.google.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarbonNeutralPage {
public CarbonNeutralPage(){
    PageFactory.initElements(Driver.getDriver(), this);
}
@FindBy(xpath = "//*[@class='-no-break']")
    public WebElement carbonText;
}
