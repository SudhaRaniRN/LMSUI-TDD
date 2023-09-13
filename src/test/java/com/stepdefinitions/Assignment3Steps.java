package com.stepdefinitions;


import com.pages.Assignment3;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Assignment3Steps extends Assignment3 {

    @Given("Admin is in  assignment details popup window")
    public void admin_is_in_assignment_details_popup_window() {
        newAssignPage();
    }

    @When("Admin enters all mandatory field values with valid data and clicks save button")
    public void admin_enters_all_mandatory_field_values_with_valid_data_and_clicks_save_button() {
        allValidmandData();

    }

    @Then("Admin should see new assignment details is added in the data table")
    public void admin_should_see_new_assignment_details_is_added_in_the_data_table() {
        validateAssgnDetails();
    }

    @When("Admin enters all mandatory field values with invalid data and clicks save button")
    public void admin_enters_all_mandatory_field_values_with_invalid_data_and_clicks_save_button() {
        invalidatemandAssgnDetails();
    }

    @Then("Error message should appear in alert")
    public void error_message_should_appear_in_alert() {
        errorMessage();
    }

    @When("Admin enters values in all fields with valid data and clicks save button")
    public void admin_enters_values_in_all_fields_with_valid_data_and_clicks_save_button() {
        AllValidData();

    }

    @When("Admin enters with invalid data in optional fields and clicks save button")
    public void admin_enters_with_invalid_data_in_optional_fields_and_clicks_save_button() {
        optionalfieldinvalidData();
    }

    @When("Admin enters  data missing value in program name and clicks save button")
    public void admin_enters_data_missing_value_in_program_name_and_clicks_save_button() {
        PNMissing();
    }

    @Then("displays error message")
    public void displays_error_message() {
        Error();
    }

    @When("Admin enters data missing value in Batch number and clicks save button")
    public void admin_enters_data_missing_value_in_batch_number_and_clicks_save_button() {
        BNMissing();
    }


    @When("Admin enters data missing value in Assignment name and clicks save button")
    public void admin_enters_data_missing_value_in_assignment_name_and_clicks_save_button() {
        assgnNameMiss();
    }


    @When("Admin enters data missing value in Assignment due date and clicks save button")
    public void admin_enters_data_missing_value_in_assignment_due_date_and_clicks_save_button() {
        ADDMiss();
    }


    @When("Admin enters data missing value in grade by  and clicks save button")
    public void admin_enters_data_missing_value_in_grade_by_and_clicks_save_button() {
        GBMiss();
    }


    @When("Admin enters passed date in the due date field and clicks save button")
    public void admin_enters_passed_date_in_the_due_date_field_and_clicks_save_button() {
        pastDD();
    }

    @Then("Assignment cannot be created for the passed date")
    public void assignment_cannot_be_created_for_the_passed_date() {
        errorMessage();
    }

    @When("Admin clicks date from date picker")
    public void admin_clicks_date_from_date_picker() {
        datepicker();
    }

    @Then("selected date should be their in class date text box")
    public void selected_date_should_be_their_in_class_date_text_box() {
        validatedate();
    }

    @Then("selected date should be in {string} format")
    public void selected_date_should_be_in_mm_dd_yyyy_format() {
        dateformat();
    }

    @When("Admin clicks right arrow in the date picker near month")
    public void admin_clicks_right_arrow_in_the_date_picker_near_month() {
        DatepickerRarrow();
    }

    @Then("Next month calender should visible")
    public void next_month_calender_should_visible() {
        nextMonth();
    }

    @When("Admin clicks left arrow in the date picker near month")
    public void admin_clicks_left_arrow_in_the_date_picker_near_month() {
        DatepickerLArrow();

    }

    @Then("previous month calender should visible")
    public void previous_month_calender_should_visible() {
        prevMonth();

    }

    @When("Admin clicks date picker button")
    public void admin_clicks_date_picker_button() {
        dataPickerButton();
    }

    @Then("Admin should see current date is highled in the date picker")
    public void admin_should_see_current_date_is_highled_in_the_date_picker() {
        currentdateHL();
    }

    @When("Admin clicks date picker button and selects future date")
    public void admin_clicks_date_picker_button_and_selects_future_date() {
        futuredate();

    }

    @Then("Admin should see selected date is highled in the date picker")
    public void admin_should_see_selected_date_is_highled_in_the_date_picker() {
        FuturedateHL();

    }

    @When("Admin clicks Cancel button without entering values in the fields")
    public void admin_clicks_cancel_button_without_entering_values_in_the_fields() {
        cancel();
    }

    @Then("Admin should land on manage assignment page")
    public void admin_should_land_on_manage_assignment_page() {
        ManagePage();
    }

    @When("Admin clicks Cancel button entering values in the fields")
    public void admin_clicks_cancel_button_entering_values_in_the_fields() {
        cancelwithData();

    }

    @Then("Admin should land on manage assignment Page and validate new assignment is not created in the data table")
    public void admin_should_land_on_manage_assignment_page_and_validate_new_assignment_is_not_created_in_the_data_table() {
        nonewAssign();

    }

}
