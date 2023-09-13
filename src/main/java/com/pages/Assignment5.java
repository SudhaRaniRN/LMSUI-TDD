package com.pages;

import com.qa.factory.DriverFactory;
import com.qa.util.ConfigReader;
import com.qa.util.LoggerLoad;
import org.junit.Assert;
import org.openqa.selenium.Alert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Properties;

public class Assignment5 {

    WebDriver driver;
    ConfigReader CR = new ConfigReader();
    Properties prop = CR.init_prop();
    String rowText;

    public Assignment5() {
        this.driver = DriverFactory.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[text()='Edit Assignment']")
    WebElement editNewAssignment;
    @FindBy(xpath = "//table[@id='data-table']/tbody/tr/'delete-button'")
    WebElement rowDel;
    @FindBy(xpath = "//table[@id='data-table']/tbody/tr(index)']")WebElement row;
    @FindBy(xpath = "//table[@id='data-table']/tbody")WebElement Datatable;
    @FindBy(xpath = "//button[@id='checkbox']")
    WebElement checkbox;
    @FindBy(xpath = "//button[text()='Delete']")
    WebElement DeleteIcon;

    public void rowDeletebutton() {
        rowText = row.getText();
        rowDel.click();
    }

    public void validateDialogBox(){
        Alert alert = driver.switchTo().alert();
        Assert.assertNotNull("The dialog box is dispalyed", alert);
    }

    public void validateYes(){
        Alert alert = driver.switchTo().alert();
        String alertmsg = alert.getText();
        Assert.assertTrue("the yes button is displayed", alertmsg.contains("Yes"));

    }

    public void validateNo(){
        Alert alert = driver.switchTo().alert();
        String alertmsg = alert.getText();
        Assert.assertTrue("the no button is displayed", alertmsg.contains("No"));

    }

    public void validateDeleteAlert(){
        Alert alert = driver.switchTo().alert();
        String alertmsg = alert.getText();
        Assert.assertTrue("the delete alert is displayed", alertmsg.contains("delete"));

    }
   public void acceptAlert() {

       Alert alert = driver.switchTo().alert();
       alert.accept();
   }

       public void ValidateDeletion(){

       String mytitle = driver.getTitle();
       String title = "Manage Assignment Page";
       Assert.assertEquals(title, mytitle);
       String tableText = Datatable.getText();
       Assert.assertFalse("The selected row is deleted", tableText.contains(rowText));

   }

    public void rejectAlert() {

        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    public void ValidatenonDeletion(){

        String mytitle = driver.getTitle();
        String title = "Manage Assignment Page";
        Assert.assertEquals(title, mytitle);
        String tableText = Datatable.getText();
        Assert.assertTrue("The selected row is not deleted", tableText.contains(rowText));

    }

    public void clickCheckbox(){
        checkbox.click();
    }

    public void validatedeleteIcon(){Assert.assertTrue("The delete icon is enabled", DeleteIcon.isEnabled());
    }
}
