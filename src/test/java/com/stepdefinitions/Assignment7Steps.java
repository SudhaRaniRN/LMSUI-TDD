package com.stepdefinitions;

import com.pages.Assignment7;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Assignment7Steps extends Assignment7 {

    @Then("Data table should display {int} page  when entries available")
    public void data_table_should_display_page_when_entries_available(Integer int1) {
        displayPage();

    }

    @Then("Right arrow should be enabled in page one  when entries are more than {int} available")
    public void right_arrow_should_be_enabled_in_page_one_when_entries_are_more_than_available(Integer int1) {
        rightArrowEnabled();
    }

    @Then("Left arrow should be disabled in page one  when entries are more than {int} available")
    public void left_arrow_should_be_disabled_in_page_one_when_entries_are_more_than_available(Integer int1) {
        leftArrowdisabled();
    }

    @Then("Right arrow should be enabled in page two when entries are more than {int} available")
    public void right_arrow_should_be_enabled_in_page_two_when_entries_are_more_than_available(Integer int1) {
        secondRightArrowEnabled();
    }

    @Then("Verify  left arrow is enable when sheet two is displayed in data table")
    public void verify_left_arrow_is_enable_when_sheet_two_is_displayed_in_data_table() {
        secondleftArrowEnabled();
    }
    @Then("Right arrow should be disabled in page two when entries are less than {int} available")
    public void right_arrow_should_be_disabled_in_page_two_when_entries_are_less_than_available(Integer int1) {
        rightArrowdisabled();
    }


    @Then("When entries are more than {int} in data table pagination controls enabled")
    public void when_entries_are_more_than_in_data_table_pagination_controls_enabled(Integer int1) {
        pginationenabled();
    }

    @Then("When entries are less than {int} in data table pagination controls disabled")
    public void when_entries_are_less_than_in_data_table_pagination_controls_disabled(Integer int1) {
        pginationdisabled();
    }


    @Then("When total assignment entries above {int} next page is enabled")
    public void when_total_class_entries_above_next_page_is_enabled(Integer int1) {
        nxtPageEnabled();
    }


    @Then("When total assignment entries  {int} or below next page is disabled")
    public void when_total_class_entries_or_below_next_page_is_disabled(Integer int1) {
        nxtPagedisabled();

    }

}
