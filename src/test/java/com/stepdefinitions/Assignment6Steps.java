package com.stepdefinitions;

import com.pages.Assignment6;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Assignment6Steps extends Assignment6 {

    @When("Admin click on assignment name column header to sort")
    public void admin_click_on_assignment_name_column_header_to_sort() {
        clickToSort();
    }

    @Then("Admin should see data table sorted in descending order")
    public void admin_should_see_data_table_sorted_in_descending_order() {
        sortDesc();
    }

    @When("Admin double click on assignment name column header to sort")
    public void admin_double_click_on_assignment_name_column_header_to_sort() {
        doubleClickSort();
    }

    @Then("Admin should see data table sorted in ascending  order")
    public void admin_should_see_data_table_sorted_in_ascending_order() {
        validateAsc();
    }
}
