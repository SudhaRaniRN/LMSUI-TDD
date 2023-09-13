package com.pages;

import com.qa.factory.DriverFactory;
import com.qa.util.LoggerLoad;
import com.qa.util.ConfigReader;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.apache.lucene.search.*;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.logging.Logger;


public class Assignment2 {
    WebDriver driver;
    ConfigReader CR = new ConfigReader();
    Properties prop = CR.init_prop();


    public Assignment2() {
        this.driver = DriverFactory.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[text()='Assignment']")
    WebElement newAssignmentButton;
    @FindBy(xpath = "//*[@id= 'popup-heading']") WebElement popupheading;

    @FindBy(xpath = "//*[text()='Program name']")
    WebElement Programname;
    @FindBy(xpath = "//*[text()='batch number']")
    WebElement batchnumber;
    @FindBy(xpath = "//*[text()='Assignment Name']")
    WebElement AssignmentName;
    @FindBy(xpath = "//*[text()='Assignment Description']")
    WebElement AssignmentDescription;
    @FindBy(xpath = "//*[text()='grade by']")
    WebElement gradeby;
    @FindBy(xpath = "//*[text()='Assignment due date']")
    WebElement Assignmentduedate;
    @FindBy(xpath = "//*[text()='Assignment File1']")
    WebElement AssignmentFile1;
    @FindBy(xpath = "//*[text()='Assignment File2']")
    WebElement AssignmentFile2;
    @FindBy(xpath = "//*[text()='Assignment File3']")
    WebElement AssignmentFile3;
    @FindBy(xpath = "//*[text()='Assignment File4']")
    WebElement AssignmentFile4;
    @FindBy(xpath = "//*[text()='Assignment File5']")
    WebElement AssignmentFile5;
    @FindBy(xpath = "//*[@id='ProgramNamedropdownId']") WebElement programNameDD;
    @FindBy(xpath = "//*[@id='BatchNumdropdownId']") WebElement BatchNumDD;
    @FindBy(xpath = "//*[@id='calender Icon']")WebElement calenderIcon;
    @FindBy(xpath = "//*[text()='save']")WebElement savebutton;
    @FindBy(xpath = "//*[text()='cancel']")WebElement cancelbutton;
    @FindBy(xpath = "//*[text()='close']")WebElement closebutton;
    public void AssignPage(){

        String mytitle = driver.getTitle();
        String title = "Manage Assignment Page";
        Assert.assertEquals(title, mytitle);
    }
public void newAssignPage(){
    newAssignmentButton.click();

}
public void popup(){
        String Mainwindow = driver.getWindowHandle();
        Set<String> set = driver.getWindowHandles();
        for(String win: set){
        if(!Mainwindow.contentEquals(win)) {
        driver.switchTo().window(win);
        String popupheadingText = popupheading.getText();
        String expectedheading = "Assignment Details";
        Assert.assertEquals(expectedheading, popupheadingText);
            LoggerLoad.info("Popup window is displayed");
        }
        }
}
public void inputFields(){

    WebElement[] elementsToAssert = {
            Programname, batchnumber, AssignmentName, AssignmentDescription, gradeby,
            Assignmentduedate, AssignmentFile1, AssignmentFile2, AssignmentFile3,
            AssignmentFile4, AssignmentFile5
    };

    for(WebElement element:elementsToAssert ){
        String elementName = element.getAttribute("name");
        Assert.assertTrue("The"+elementName+ "is displayed", element.isDisplayed());
    }
}
 public void numberoffileds(){

     int numberOfTextboxes = driver.findElements(By.tagName("input")).size();
     int expected = 8;
     Assert.assertEquals(expected, numberOfTextboxes);
     LoggerLoad.info("Number of textbox is as expected");
 }
  public void ProgramNameDD(){
      programNameDD.click();
      List<WebElement> DDoptions = driver.findElements(By.tagName("options"));
      Assert.assertFalse("The options are displayed in the DropDown",DDoptions.isEmpty());
  }

    public void BatchnumDD(){
        BatchNumDD.click();
        List<WebElement> DDoptions = driver.findElements(By.tagName("options"));
        Assert.assertFalse("The options are displayed in the DropDown", DDoptions.isEmpty());
    }

    public void calenderIcon(){
        Assert.assertTrue("Calender icon is displayed", calenderIcon.isDisplayed());
    }

    public void savebutton(){
        Assert.assertTrue("save button  is displayed", savebutton.isDisplayed());
    }
    public void cancelbutton(){
        Assert.assertTrue("cancel button is displayed", cancelbutton.isDisplayed());
    }
    public void closebutton(){
        Assert.assertTrue("close button is displayed", closebutton.isDisplayed());
    }

}

