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

public class Assignment3 {

    WebDriver driver;
    ConfigReader CR = new ConfigReader();
    Properties prop = CR.init_prop();

    public Assignment3() {
        this.driver = DriverFactory.getDriver();
        PageFactory.initElements(driver, this);
    }

    JSONReader jsonreader = new JSONReader();
    String filepath = prop.getProperty("TestdataPath");
    JsonObject jsondata = jsonreader.readJsonData(filepath);
    @FindBy(xpath = "//button[text()='Assignment']")
    WebElement newAssignmentButton;
    @FindBy(xpath = "//*[@id= 'popup-heading']")
    WebElement popupheading;
    @FindBy(xpath = "//select[text()='Pragram name']")
    WebElement PragramName;
    @FindBy(xpath = "//select[text()='Batch number']")
    WebElement Batchnumber;
    @FindBy(xpath = "//*[text()='Assignment name']")
    WebElement AssignName;

    @FindBy(xpath = "//*[text()='grade by']")
    WebElement gradeBy;

    @FindBy(xpath = "//button[text()='Assignment due date']")
    WebElement AssignDD;
    @FindBy(xpath = "//td[@data-day='*']")
    WebElement specificdate;
    @FindBy(xpath = "//*[text()='save']")
    WebElement savebutton;
    @FindBy(xpath = "//*[text()='cancel']")
    WebElement cancelbutton;
    @FindBy(xpath = "//*[text()='close']")
    WebElement closebutton;
    @FindBy(xpath = "//*[text()='Assignment Description']")
    WebElement AssignmentDescription;
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
    @FindBy(xpath = "//*[@id='calender Icon']")
    WebElement calenderIcon;
    @FindBy(xpath = "//button[@class='right-arrow']")
    WebElement RArrow;
    @FindBy(xpath = "//button[@class='left-arrow']")
    WebElement LArrow;
    @FindBy(xpath = "//div[@class='next-month-calendar']")
    WebElement nextMnth;
    @FindBy(xpath = "//div[@class='previous-month-calendar']")
    WebElement prevMnth;
    @FindBy(xpath = "//td[@data-day='current-date']")
    WebElement currentdate;

    @FindBy(xpath = "//td[@data-day='current-date']")
    WebElement Futuredate;

    @FindBy(xpath = "////tr[contains(@class, 'new-assignment')]")
    WebElement newAssignmentbttn;


    List<WebElement> rowsBefore;
    List<WebElement> rowsAfter;

    public void newAssignPage() {
        newAssignmentButton.click();
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

    public void allValidmandData() {

        rowsBefore = driver.findElements(By.xpath("//table[@id='data-table']/tbody/tr"));

        JsonArray validDataArray = jsondata.getAsJsonArray("Valid Data");
        JsonObject AssigntName = validDataArray.get(0).getAsJsonObject();
        AssignName.sendKeys(AssigntName.get("Assignment Name").getAsString());
        gradeBy.sendKeys(AssigntName.get("Grade By").getAsString());

        Select dropdown = new Select(PragramName);
        dropdown.selectByIndex(1);

        Select dropdown2 = new Select(Batchnumber);
        dropdown.selectByIndex(1);
        AssignDD.click();
        specificdate.click();
        savebutton.click();
    }

    public void validateAssgnDetails() {
        rowsAfter = driver.findElements(By.xpath("//table[@id='data-table']/tbody/tr"));

        Assert.assertTrue("New Assignment data is displayed ", rowsAfter.size() > rowsBefore.size());
    }

    public void invalidatemandAssgnDetails() {

        JsonArray invalidDataArray = jsondata.getAsJsonArray("invalid Data");
        JsonObject Assigntdetails = invalidDataArray.get(0).getAsJsonObject();
        AssignName.sendKeys(Assigntdetails.get("Assignment Name").getAsString());
        gradeBy.sendKeys(Assigntdetails.get("Grade By").getAsString());

        Select dropdown = new Select(PragramName);
        dropdown.selectByIndex(1);

        Select dropdown2 = new Select(Batchnumber);
        dropdown2.selectByIndex(1);
        AssignDD.click();
        specificdate.click();
        savebutton.click();

    }

    public void errorMessage() {
        Alert alert = driver.switchTo().alert();
        String errorMsg = alert.getText();
        Assert.assertTrue("Error message is displayed", errorMsg.contains("error message"));
    }

    public void AllValidData() {

        JsonArray validDataArray = jsondata.getAsJsonArray("Valid Data");
        JsonObject Assigntdetails = validDataArray.get(0).getAsJsonObject();
        AssignName.sendKeys(Assigntdetails.get("Assignment Name").getAsString());
        AssignmentDescription.sendKeys(Assigntdetails.get("Assignment Description").getAsString());
        gradeBy.sendKeys(Assigntdetails.get("Grade By").getAsString());
        AssignmentFile1.sendKeys(Assigntdetails.get("Assignment File 1").getAsString());
        AssignmentFile2.sendKeys(Assigntdetails.get("Assignment File 2").getAsString());
        AssignmentFile3.sendKeys(Assigntdetails.get("Assignment File 3").getAsString());
        AssignmentFile4.sendKeys(Assigntdetails.get("Assignment File 4").getAsString());
        AssignmentFile5.sendKeys(Assigntdetails.get("Assignment File 5").getAsString());

        Select dropdown = new Select(PragramName);
        dropdown.selectByIndex(1);

        Select dropdown2 = new Select(Batchnumber);
        dropdown2.selectByIndex(1);
        AssignDD.click();
        specificdate.click();
        savebutton.click();

    }

    public void optionalfieldinvalidData() {

        JsonArray invalidDataArray = jsondata.getAsJsonArray("invalid Data");
        JsonObject Assigntdetails = invalidDataArray.get(0).getAsJsonObject();

        AssignmentDescription.sendKeys(Assigntdetails.get("Assignment Description").getAsString());
        AssignmentFile1.sendKeys(Assigntdetails.get("Assignment File 1").getAsString());
        AssignmentFile2.sendKeys(Assigntdetails.get("Assignment File 2").getAsString());
        AssignmentFile3.sendKeys(Assigntdetails.get("Assignment File 3").getAsString());
        AssignmentFile4.sendKeys(Assigntdetails.get("Assignment File 4").getAsString());
        AssignmentFile5.sendKeys(Assigntdetails.get("Assignment File 5").getAsString());
        savebutton.click();
    }

    public void PNMissing() {

        JsonArray validDataArray = jsondata.getAsJsonArray("Valid Data");
        JsonObject Assigntdetails = validDataArray.get(0).getAsJsonObject();
        AssignName.sendKeys(Assigntdetails.get("Assignment Name").getAsString());
        AssignmentDescription.sendKeys(Assigntdetails.get("Assignment Description").getAsString());
        gradeBy.sendKeys(Assigntdetails.get("Grade By").getAsString());
        AssignmentFile1.sendKeys(Assigntdetails.get("Assignment File 1").getAsString());
        AssignmentFile2.sendKeys(Assigntdetails.get("Assignment File 2").getAsString());
        AssignmentFile3.sendKeys(Assigntdetails.get("Assignment File 3").getAsString());
        AssignmentFile4.sendKeys(Assigntdetails.get("Assignment File 4").getAsString());
        AssignmentFile5.sendKeys(Assigntdetails.get("Assignment File 5").getAsString());

        Select dropdown2 = new Select(Batchnumber);
        dropdown2.selectByIndex(1);
        AssignDD.click();
        specificdate.click();
        savebutton.click();

    }

    public void Error() {
        Alert alert = driver.switchTo().alert();
        String error = alert.getText();
        LoggerLoad.error(error);
    }

    public void BNMissing() {

        JsonArray validDataArray = jsondata.getAsJsonArray("Valid Data");
        JsonObject Assigntdetails = validDataArray.get(0).getAsJsonObject();
        AssignName.sendKeys(Assigntdetails.get("Assignment Name").getAsString());
        AssignmentDescription.sendKeys(Assigntdetails.get("Assignment Description").getAsString());
        gradeBy.sendKeys(Assigntdetails.get("Grade By").getAsString());
        AssignmentFile1.sendKeys(Assigntdetails.get("Assignment File 1").getAsString());
        AssignmentFile2.sendKeys(Assigntdetails.get("Assignment File 2").getAsString());
        AssignmentFile3.sendKeys(Assigntdetails.get("Assignment File 3").getAsString());
        AssignmentFile4.sendKeys(Assigntdetails.get("Assignment File 4").getAsString());
        AssignmentFile5.sendKeys(Assigntdetails.get("Assignment File 5").getAsString());

        Select dropdown2 = new Select(PragramName);
        dropdown2.selectByIndex(1);
        AssignDD.click();
        specificdate.click();
        savebutton.click();
    }

    public void assgnNameMiss() {

        JsonArray validDataArray = jsondata.getAsJsonArray("Valid Data");
        JsonObject Assigntdetails = validDataArray.get(0).getAsJsonObject();

        gradeBy.sendKeys(Assigntdetails.get("Grade By").getAsString());

        Select dropdown = new Select(PragramName);
        dropdown.selectByIndex(1);

        Select dropdown2 = new Select(Batchnumber);
        dropdown2.selectByIndex(1);
        AssignDD.click();
        specificdate.click();
        savebutton.click();
    }

    public void ADDMiss() {

        JsonArray validDataArray = jsondata.getAsJsonArray("Valid Data");
        JsonObject Assigntdetails = validDataArray.get(0).getAsJsonObject();
        AssignName.sendKeys(Assigntdetails.get("Assignment Name").getAsString());
        gradeBy.sendKeys(Assigntdetails.get("Grade By").getAsString());

        Select dropdown = new Select(PragramName);
        dropdown.selectByIndex(1);

        Select dropdown2 = new Select(Batchnumber);
        dropdown2.selectByIndex(1);

        savebutton.click();
    }

    public void GBMiss() {
        JsonArray validDataArray = jsondata.getAsJsonArray("Valid Data");
        JsonObject Assigntdetails = validDataArray.get(0).getAsJsonObject();
        AssignName.sendKeys(Assigntdetails.get("Assignment Name").getAsString());

        Select dropdown = new Select(PragramName);
        dropdown.selectByIndex(1);

        Select dropdown2 = new Select(Batchnumber);
        dropdown2.selectByIndex(1);
        AssignDD.click();
        specificdate.click();
        savebutton.click();
    }

    public void pastDD() {
        JsonArray validDataArray = jsondata.getAsJsonArray("Valid Data");
        JsonObject Assigntdetails = validDataArray.get(0).getAsJsonObject();
        AssignName.sendKeys(Assigntdetails.get("Assignment Name").getAsString());
        gradeBy.sendKeys(Assigntdetails.get("Grade By").getAsString());

        JsonArray invalidDataArray = jsondata.getAsJsonArray("invalid Data");
        JsonObject inAssigntdetails = validDataArray.get(0).getAsJsonObject();
        AssignDD.sendKeys(Assigntdetails.get("Assignment Due Date").getAsString());

        Select dropdown = new Select(PragramName);
        dropdown.selectByIndex(1);

        Select dropdown2 = new Select(Batchnumber);
        dropdown2.selectByIndex(1);


        savebutton.click();

    }

    public void datepicker() {
        calenderIcon.click();
        specificdate.click();

    }

    public void validatedate() {
        Assert.assertTrue("The date chosen is displayed", specificdate.isDisplayed());

    }

    public void dateformat() {
        String regex = "\\d{2}/\\d{2}/\\d{4}";
        String actualDate = specificdate.getText();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(actualDate);
        boolean isDateFormatValid = matcher.matches();

        Assert.assertTrue("Date format displayed is mm/dd/yyyy ", isDateFormatValid);
    }

    public void DatepickerRarrow() {
        calenderIcon.click();
        RArrow.click();
    }

    public void nextMonth() {

        Assert.assertTrue("Next month is displayed",nextMnth.isDisplayed() );

    }

    public void DatepickerLArrow() {
        calenderIcon.click();
        LArrow.click();
    }

    public void prevMonth() {

        Assert.assertTrue("Next month is displayed",prevMnth.isDisplayed() );

    }

    public void dataPickerButton(){
        calenderIcon.click();
    }

    public void currentdateHL(){
       Assert.assertTrue("The current date is highlighted", currentdate.isEnabled());

    }
    public void futuredate() {
        calenderIcon.click();
        RArrow.click();
        nextMnth.click();
        specificdate.isSelected();
    }
    public void FuturedateHL(){
        Assert.assertTrue("The current date is highlighted", specificdate.isEnabled());

    }

    public void cancel(){
        cancelbutton.click();
    }

    public void ManagePage(){
        String actual = driver.getTitle();
        String expected = "Manage Assignment Page";
        Assert.assertEquals(expected, actual);
    }
    public void cancelwithData(){
        JsonArray validDataArray = jsondata.getAsJsonArray("Valid Data");
        JsonObject Assigntdetails = validDataArray.get(0).getAsJsonObject();
        AssignName.sendKeys(Assigntdetails.get("Assignment Name").getAsString());
        AssignmentDescription.sendKeys(Assigntdetails.get("Assignment Description").getAsString());
        gradeBy.sendKeys(Assigntdetails.get("Grade By").getAsString());
        AssignmentFile1.sendKeys(Assigntdetails.get("Assignment File 1").getAsString());
        AssignmentFile2.sendKeys(Assigntdetails.get("Assignment File 2").getAsString());
        AssignmentFile3.sendKeys(Assigntdetails.get("Assignment File 3").getAsString());
        AssignmentFile4.sendKeys(Assigntdetails.get("Assignment File 4").getAsString());
        AssignmentFile5.sendKeys(Assigntdetails.get("Assignment File 5").getAsString());

        Select dropdown = new Select(PragramName);
        dropdown.selectByIndex(1);

        Select dropdown2 = new Select(Batchnumber);
        dropdown2.selectByIndex(1);
        AssignDD.click();
        specificdate.click();
        cancelbutton.click();
    }

    public void nonewAssign(){
        String actual = driver.getTitle();
        String expected = "Manage Assignment Page";
        Assert.assertEquals(expected, actual);
        Assert.assertFalse("The new Assignment is not created", newAssignmentbttn.isDisplayed());
    }
}







