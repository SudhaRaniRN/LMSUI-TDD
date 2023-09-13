package com.pages;

import com.qa.factory.DriverFactory;
import com.qa.util.ConfigReader;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Properties;

public class Assignment8 {

    WebDriver driver;


    public Assignment8() {
        this.driver = DriverFactory.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[text()='student']")
    WebElement studentButton;
    @FindBy(xpath = "//button[text()='program']")
    WebElement programButton;
    @FindBy(xpath = "//button[text()='batch']")
    WebElement batchButton;
    @FindBy(xpath = "//button[text()='user']")
    WebElement userButton;
    @FindBy(xpath = "//button[text()='class']")
    WebElement classButton;
    @FindBy(xpath = "//button[text()='Attendance']")
    WebElement AttendanceButton;
    @FindBy(xpath = "//button[text()='login']")
    WebElement loginButton;

    public void assertPageTitle(String expectedtitle){
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedtitle, actualTitle);
    }

    public void validateNavigaton(String option){
        switch (option){
            case "student": studentButton.click();
                assertPageTitle( "Student details page");
                break;

            case "program": programButton.click();
                assertPageTitle(  "program details page");
                break;

            case "batch": batchButton.click();
                assertPageTitle( "batch details page");
                break;

            case "user": userButton.click();
                assertPageTitle( "user details page");
                break;

            case "class": classButton.click();
                assertPageTitle( "class details page");
                break;

            case "Attendance": AttendanceButton.click();
                assertPageTitle( "program details page");
                break;

            case "login": loginButton.click();
                assertPageTitle( "program details page");
                break;
        }

    }


}
