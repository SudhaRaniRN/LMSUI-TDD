package com.stepdefinitions;

import com.pages.Assignment1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Assignment1Steps extends Assignment1 {

    @Given("Admin is on dashboard page after Login")
    public void admin_is_on_dashboard_page_after_login() {
        dashboard();
    }
    @When("Admin clicks {string} button on the navigation bar")
    public void admin_clicks_button_on_the_navigation_bar(String string) {
        clickAssignmentButton();
    }
    @Then("Admin should see URL with {string}")
    public void admin_should_see_url_with(String string) {
        ManageURL();
    }
    @Then("Get the response time for navigation from dashboard page to manage assignment page")
    public void get_the_response_time_for_navigation_from_dashboard_page_to_manage_assignment_page() {
        validateResponseTime();
    }
    @Then("Admin should see header with {string}")
    public void admin_should_see_header_with(String string) {
        verifyHeader();
    }

    @When("Admin clicks {string} button on the navigation bar and get all text from the portal page")
    public void admin_clicks_button_on_the_navigation_bar_and_get_all_text_from_the_portal_page(String string) {

    }
    @Then("Admin should see correct spelling for the all the fields")
    public void admin_should_see_correct_spelling_for_the_all_the_fields() {

    }
    @Then("Admin should see disabled delete icon below the {string}")
    public void admin_should_see_disabled_delete_icon_below_the(String string) {
        verifyDeleteicon();

    }
    @Then("Admin should see search bar on the manage assignment page")
    public void admin_should_see_search_bar_on_the_manage_assignment_page() {
        verifySearchBar();
    }
    @Then("Admin should see +Add New assignment button on the manage assignment page")
    public void admin_should_see_add_new_assignment_button_on_the_manage_assignment_page() {
        verifyAddNew();
    }

    @Then("Admin should see data table on the manage assignment page With following column headers")
    public void admin_should_see_data_table_on_the_manage_assignment_page_with_following_column_headers() {
        verifypageheaders();
    }

    @Then("Edit Icon in each row of data table only  when entries are available")
    public void edit_icon_in_each_row_of_data_table_only_when_entries_are_available() {
        verifyEditIcon();
    }

    @Then("Edit Icon will not be present in data table")
    public void edit_icon_will_not_be_present_in_data_table() {
        validateEditIcon();
    }
    @Then("Delete Icon in each row of data table only  when entries are available")
    public void delete_icon_in_each_row_of_data_table_only_when_entries_are_available() {
        verifyDeleteIcon();
    }

    @Then("Delete Icon will not be present in data table")
    public void delete_icon_will_not_be_present_in_data_table() {
        validateDeleteIcon();
    }

    @Then("Admin should see sort icon near the column headers except for Edit and Delete")
    public void admin_should_see_sort_icon_near_the_column_headers_except_for_edit_and_delete() {
        validateSortIcon();
    }
    @Then("Admin should see check box in the all rows  of data table when entries available")
    public void admin_should_see_check_box_in_the_all_rows_of_data_table_when_entries_available() {
        validatecheckbox();
    }

    @Then("Above the footer Admin should see the text as \"\"Showing x to y of z entries\"\" below the table.")
    public void above_the_footer_admin_should_see_the_text_as_showing_x_to_y_of_z_entries_below_the_table() {

    }
    @Then("Admin should see the pagination controls under the data table")
    public void admin_should_see_the_pagination_controls_under_the_data_table() {
        pagination();
    }
    @Then("Admin should see the text with total number assignments in the data table.")
    public void admin_should_see_the_text_with_total_number_assignments_in_the_data_table() {
        footermessage();
    }
    @Given("Admin is on manage assignment page")
    public void admin_is_on_manage_assignment_page() {
        managePage();
    }

    @When("Admin enters assignment name into search box")
    public void admin_enters_assignment_name_into_search_box() {
        SearchAssignName();

    }

    @Then("Displays entries with that assignment name")
    public void displays_entries_with_that_assignment_name() {

        ValidateAssignmentname();
    }

    @When("Admin enters assignment  name is not existing the table into search box")
    public void admin_enters_assignment_name_is_not_existing_the_table_into_search_box() {
        InvalidAssignmentName();

    }

    @Then("Displays empty details in the data table")
    public void displays_empty_details_in_the_data_table() {
        nosearchResults();

    }

    @When("Admin enters assignment description into search box")
    public void admin_enters_assignment_description_into_search_box() {

        searchAssignDesc();
    }

    @Then("Displays entries with that assignment description")
    public void displays_entries_with_that_assignment_description() {
        ValidateAssignDesc();

    }

    @When("Admin enters assignment description which is not existing the table into search box")
    public void admin_enters_assignment_description_which_is_not_existing_the_table_into_search_box() {
        InvalidAssignDesc();

    }

    @When("Admin enters assignment due date into search box")
    public void admin_enters_assignment_due_date_into_search_box() {
        searchassignDate();

    }

    @Then("Displays entries with that assignment due date")
    public void displays_entries_with_that_assignment_due_date() {
        validateassignDate();

    }

    @When("Admin enters assignment due date which is not existing the table into search box")
    public void admin_enters_assignment_due_date_which_is_not_existing_the_table_into_search_box() {
        InvalidAssignDate();

    }

    @When("Admin enters grade value  into search box")
    public void admin_enters_grade_value_into_search_box() {

        searchGrade();
    }

    @Then("Displays entries with that assignment  grade")
    public void displays_entries_with_that_assignment_grade() {
        validateGrade();

    }

    @When("Admin enters grade value which is not existing the table into search box")
    public void admin_enters_grade_value_which_is_not_existing_the_table_into_search_box() {
        invalidGrade();

    }

}
