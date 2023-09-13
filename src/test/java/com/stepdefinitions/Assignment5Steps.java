package com.stepdefinitions;

import com.pages.Assignment5;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Assignment5Steps extends Assignment5  {


    @When("Admin clicks delete button in data table row level")
    public void admin_clicks_delete_button_in_data_table_row_level() {
        rowDeletebutton();
    }

    @Then("Admin should see dialog box")
    public void admin_should_see_dialog_box() {
        validateDialogBox();
    }

    @Then("Alert should have {string} button to accept")
    public void alert_should_have_button_to_accept(String string) {
        validateYes();
    }

    @Then("Alert should have {string} button to reject")
    public void alert_should_have_button_to_reject(String string) {
        validateNo();
    }

    @Given("Admin is in delete alert")
    public void admin_is_in_delete_alert() {
        validateDeleteAlert();
    }

    @When("Admin clicks yes button")
    public void admin_clicks_yes_button() {
        acceptAlert();
    }

    @Then("Redirected to assignment page and selected assignment details are deleted from the data table")
    public void redirected_to_assignment_page_and_selected_assignment_details_are_deleted_from_the_data_table() {
        ValidateDeletion();
    }

    @When("Admin clicks no button")
    public void admin_clicks_no_button() {
        rejectAlert();
    }

    @Then("Redirected to assignment page and selected assignment details are not deleted from the data table")
    public void redirected_to_assignment_page_and_selected_assignment_details_are_not_deleted_from_the_data_table() {
        ValidatenonDeletion();
    }

    @When("Admin clicks single  row level check box in the data table")
    public void admin_clicks_single_row_level_check_box_in_the_data_table() {
        clickCheckbox();
    }

    @Then("Admin should see delete icon below the header is enabled")
    public void admin_should_see_delete_icon_below_the_header_is_enabled() {
        validatedeleteIcon();
    }

}
