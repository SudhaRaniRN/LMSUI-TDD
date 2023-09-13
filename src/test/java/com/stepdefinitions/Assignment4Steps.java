package com.stepdefinitions;

import com.pages.Assignment4;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Assignment4Steps extends Assignment4 {


    @When("Admin clicks Edit button in data table")
    public void admin_clicks_edit_button_in_data_table() {
        editAssignment();
    }

    @Then("Edit popup window appears with heading Assignment Details")
    public void edit_popup_window_appears_with_heading_assignment_details() {
        editPopup();
    }

    @When("Admin clicks Edit button from one of the row in data table")
    public void admin_clicks_edit_button_from_one_of_the_row_in_data_table() {
        RowEdit();
    }

    @Then("Edit popup window appears with same row values in the all fields")
    public void edit_popup_window_appears_with_same_row_values_in_the_all_fields() {
        popupWithRowData();
    }

    @Given("Admin is in  Edit assignment detail popup window")
    public void admin_is_in_edit_assignment_detail_popup_window() {
        editPopup();
    }

    @Then("Admin should see updated assignment details is added in the data table")
    public void admin_should_see_updated_assignment_details_is_added_in_the_data_table() {
        validataUpdatedData();
    }


}
