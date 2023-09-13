package com.pages;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.qa.factory.DriverFactory;
import com.qa.util.JSONReader;
import com.qa.util.LoggerLoad;
import com.qa.util.ConfigReader;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment4 {

    WebDriver driver;
    ConfigReader CR = new ConfigReader();
    Properties prop = CR.init_prop();
    JSONReader jsonreader = new JSONReader();
    String filepath = prop.getProperty("TestdataPath");
    JsonObject jsondata = jsonreader.readJsonData(filepath);

    public Assignment4() {
        this.driver = DriverFactory.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[text()='Edit Assignment']")
    WebElement editNewAssignment;
    @FindBy(xpath = "//*[@id= 'popup-heading']")
    WebElement popupheading;

    @FindBy(xpath = "//table[@id='data-table']/tbody/tr/'edit-button'")
    WebElement rowEdit;
    @FindBy(xpath = "//html/body")
    WebElement body;
    @FindBy(xpath = "//table[@id='data-table']/tbody/tr(0)")
    WebElement row;



    public void editAssignment() {
        editNewAssignment.click();
    }

    public void editPopup() {
        String Mainwindow = driver.getWindowHandle();
        Set<String> set = driver.getWindowHandles();
        for (String win : set) {
            if (!Mainwindow.contentEquals(win)) {
                driver.switchTo().window(win);
                String popupheadingText = popupheading.getText();
                String expectedheading = "Assignment Details";
                Assert.assertEquals(expectedheading, popupheadingText);
                LoggerLoad.info("Popup window is displayed");

            }
        }
    }

    public void RowEdit() {
        rowEdit.click();

    }

    public void popupWithRowData() {
        String rowdata = row.getText();
        String Mainwindow = driver.getWindowHandle();
        Set<String> set = driver.getWindowHandles();
        for (String win : set) {
            if (!Mainwindow.contentEquals(win)) {
                driver.switchTo().window(win);
                Assert.assertEquals(body.getText(), rowdata);
            }

        }

    }

    public void validataUpdatedData(){
        JsonArray validDataArray = jsondata.getAsJsonArray("Valid Data");
        JsonObject AssigntName = validDataArray.get(0).getAsJsonObject();
        String Data = AssigntName.getAsString();
        String tableData = row.getText();
        Assert.assertEquals(tableData,Data);

    }
}
