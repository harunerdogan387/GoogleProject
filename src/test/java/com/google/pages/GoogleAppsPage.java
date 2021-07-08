package com.google.pages;

import com.google.utilities.Driver;
import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GoogleAppsPage {
    public GoogleAppsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = " //*[@jsname='k77Iif']")
    public WebElement appsPath;

    @FindBy(xpath = "//*[@id='yDmH0d']/c-wiz/div/div/c-wiz/div/div/ul[1]")
    public List<WebElement> apps;

//    @FindBy(xpath = "/html/body/div/c-wiz/div/div/c-wiz/div/div/ul[1]/li[1]/a/div/span")
//    public WebElement accountAppButton;

//    @FindBy(xpath = "//*[@id='yDmH0d']/c-wiz/div/div/c-wiz/div/div/ul[1]/li[1]/a/div[5]/span")
//    public WebElement accountAppButton;

    @FindBy(xpath = "//li[@class='j1ei8c']/a/div/span")
    public WebElement accountAppButton;
    //li[@class='j1ei8c']/a/div/span
}
