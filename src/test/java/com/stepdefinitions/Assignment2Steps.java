package com.stepdefinitions;

import com.pages.Assignment2;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Assignment2Steps extends Assignment2 {

    @Given("Admin is on manage assignment Page")
    public void admin_is_on_manage_assignment_page() {
        AssignPage();
    }

    @When("Admin click +Add new assignment button")
    public void admin_click_add_new_assignment_button() {
        newAssignPage();
    }

    @Then("Admin should see a popup  with  heading {string}")
    public void admin_should_see_a_popup_with_heading(String string) {
        popup();
    }

    @Then("Admin should see input fields Text")
    public void admin_should_see_input_fields_text() {
        inputFields();
    }

    @Then("{int} textbox should be  present in Assignment details popup window")
    public void textbox_should_be_present_in_assignment_details_popup_window(Integer int1) {
        numberoffileds();

    }

    @Then("Admin should see  dropdown option for Batch Number")
    public void admin_should_see_dropdown_option_for_batch_number() {
        BatchnumDD();
    }

    @Then("Admin should see  dropdown option for Program name")
    public void admin_should_see_dropdown_option_for_program_name() {
        ProgramNameDD();
    }

    @Then("Admin should see  calendar icon for assignment due date")
    public void admin_should_see_calendar_icon_for_assignment_due_date() {
        calenderIcon();
    }

    @Then("Admin should see  save button in the Assignment detail popup window")
    public void admin_should_see_save_button_in_the_assignment_detail_popup_window() {
        savebutton();
    }

    @Then("Admin should see  cancel button in the Assignment detail popup window")
    public void admin_should_see_cancel_button_in_the_assignment_detail_popup_window() {
        cancelbutton();
    }

    @Then("Admin should see  close button on the Assignment details popup window")
    public void admin_should_see_close_button_on_the_assignment_details_popup_window() {
        closebutton();
    }
}
