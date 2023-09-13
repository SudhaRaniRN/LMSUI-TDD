package com.stepdefinitions;

import com.pages.Assignment8;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Assignment8Steps extends Assignment8 {

    @When("Admin clicks {string} button in the navigation bar")
    public void admin_clicks_button_in_the_navigation_bar(String option) {
        validateNavigaton(option);
    }

    @Then("Admin should able to land on {string} particular page")
    public void admin_should_able_to_land_on_particular_page(String string) {
        assertPageTitle(string);
    }
    }
