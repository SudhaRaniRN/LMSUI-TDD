package com.pages;


import org.openqa.selenium.*;
import com.qa.factory.DriverFactory;
import com.qa.util.ConfigReader;
import com.qa.util.LoggerLoad;
import org.junit.Assert;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

public class Assignment6 {
    WebDriver driver;
    List<String> originaldata;
    List<String> expecteddata;

    public Assignment6() {
        this.driver = DriverFactory.getDriver();
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//table[@id='data-table']/tbody/th[text()= 'Assignment Name']")
    WebElement rowHeader;

    @FindBy(xpath = "//table[@id='data-table']/tbody/th/tr/td[text()= 'Assignment Name']")
    WebElement colheader;

    public void clickToSort() {

        List<WebElement> cells = driver.findElements(By.xpath("//table[@id='data-table']/tbody/th/tr/td[text()= 'Assignment Name']"));
        List<String> celldata = new ArrayList<>();
        for (WebElement cell : cells) {
            celldata.add(cell.getText());
        }
        originaldata = new ArrayList<>(celldata);
        originaldata.sort(Collections.reverseOrder());

        rowHeader.click();
    }

        public void sortDesc () {
            List<WebElement> sortedcells = driver.findElements(By.xpath("//table[@id='data-table']/tbody/th/tr/td[text()= 'Assignment Name']"));
            List<String> sortedcelldata = new ArrayList<>();
            for (WebElement cell : sortedcells) {
                sortedcelldata.add(cell.getText());
            }
            expecteddata = new ArrayList<>(sortedcelldata);
            Assert.assertEquals("The column assignment name is sorted in descending order", expecteddata, originaldata);

        }
        public void doubleClickSort(){
            Actions action = new Actions(driver) ;
            action.doubleClick(rowHeader).perform();

        }

        public void validateAsc(){
            List<WebElement> afterData = driver.findElements(By.xpath("//table[@id='data-table']/tbody/th/tr/td[text()= 'Assignment Name']"));
            List<String> afterDatacell = new ArrayList<>();
            for (WebElement cell : afterData) {
                afterDatacell.add(cell.getText());
            }
            List<String>newsorteddata = new ArrayList<>(afterDatacell);
            Collections.sort(expecteddata);

            Assert.assertEquals("The column assignment name is sorted in descending order", expecteddata, newsorteddata);

    }

    }

