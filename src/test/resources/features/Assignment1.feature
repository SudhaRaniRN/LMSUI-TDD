Feature: Manage assignment page Verification

@TC001
  Scenario: Verify landing in manage assignment page
    Given Admin is on dashboard page after Login
    When Admin clicks "assignment" button on the navigation bar
    Then Admin should see URL with "Manage assignment"

  @TC002
  Scenario: Capture the response time to navigate to manage assignment page
    Given Admin is on dashboard page after Login
    When Admin clicks "assignment" button on the navigation bar
    Then Get the response time for navigation from dashboard page to manage assignment page

  @TC003
  Scenario: Verify manage assignment page Header
    Given Admin is on dashboard page after Login
    When Admin clicks "assignment" button on the navigation bar
    Then Admin should see header with "Manage assignment"

  @TC004
  Scenario: Validate text in manage assignment page
    Given Admin is on dashboard page after Login
    When Admin clicks "assignment" button on the navigation bar and get all text from the portal page
    Then Admin should see correct spelling for the all the fields
    #need to finish

  @TC005
  Scenario: Verify delete icon below the header
    Given Admin is on dashboard page after Login
    When Admin clicks "assignment" button on the navigation bar
    Then Admin should see disabled delete icon below the "Manage assignment"

  @TC006
  Scenario: Verify search bar on the manage assignment page
    Given Admin is on dashboard page after Login
    When Admin clicks "assignment" button on the navigation bar
    Then Admin should see search bar on the manage assignment page

  @TC007
  Scenario:Verify add new assignment button  on manage assignment page
    Given Admin is on dashboard page after Login
    When Admin clicks "assignment" button on the navigation bar
    Then Admin should see +Add New assignment button on the manage assignment page

  @TC008
  Scenario: Verify data table on the manage assignment page
    Given Admin is on dashboard page after Login
    When Admin clicks "assignment" button on the navigation bar
    Then Admin should see data table on the manage assignment page With following column headers

  @TC009
  Scenario:  Verify Edit icon in the data table
    Given Admin is on dashboard page after Login
    When Admin clicks "assignment" button on the navigation bar
    Then Edit Icon in each row of data table only  when entries are available

  @TC010
  Scenario: Verify Edit icon when no data in the table
    Given Admin is on dashboard page after Login
    When Admin clicks "assignment" button on the navigation bar
    Then Edit Icon will not be present in data table

  @TC011
  Scenario: Verify delete icon in the data table
    Given Admin is on dashboard page after Login
    When Admin clicks "assignment" button on the navigation bar
    Then Delete Icon in each row of data table only  when entries are available

  @TC012
  Scenario: Verify delete icon when no data in the table
    Given Admin is on dashboard page after Login
    When Admin clicks "assignment" button on the navigation bar
    Then Delete Icon will not be present in data table

  @TC013
  Scenario: Verify sort icon in the data table
    Given Admin is on dashboard page after Login
    When Admin clicks "assignment" button on the navigation bar
    Then Admin should see sort icon near the column headers except for Edit and Delete

  @TC014
  Scenario: Verify check box in the data table
    Given Admin is on dashboard page after Login
    When Admin clicks "assignment" button on the navigation bar
    Then Admin should see check box in the all rows  of data table when entries available

  @TC015
  Scenario: Validate the number entries displaying
    Given Admin is on dashboard page after Login
    When Admin clicks "assignment" button on the navigation bar
    Then Above the footer Admin should see the text as ""Showing x to y of z entries"" below the table.
#need to do
#(x- starting record number on that page
# y-ending record number on that page
# z-Total number of records Note: with or without entries")

  @TC016
  Scenario: Verify Pagination control below the data table
    Given Admin is on dashboard page after Login
    When Admin clicks "assignment" button on the navigation bar
    Then Admin should see the pagination controls under the data table

  @TC017
  Scenario: Validate footer  text
    Given Admin is on dashboard page after Login
    When Admin clicks "assignment" button on the navigation bar
    Then Admin should see the text with total number assignments in the data table.
#  #( " In total there are number of assignments")

  @TC018
  Scenario: Validate search box function
     Given Admin is on manage assignment page
    When Admin enters assignment name into search box
    Then Displays entries with that assignment name

  @TC019
  Scenario: Validate search box function
    Given Admin is on manage assignment page
    When Admin enters assignment  name is not existing the table into search box
    Then Displays empty details in the data table

  @TC020
  Scenario: Validate search box function
    Given Admin is on manage assignment page
    When Admin enters assignment description into search box
    Then Displays entries with that assignment description

  @TC021
  Scenario: Validate search box function
    Given Admin is on manage assignment page
    When Admin enters assignment description which is not existing the table into search box
    Then Displays empty details in the data table

  @TC022
  Scenario: Validate search box function
    Given Admin is on manage assignment page
    When Admin enters assignment due date into search box
    Then Displays entries with that assignment due date

  @TC023
  Scenario: Validate search box function
    Given Admin is on manage assignment page
    When Admin enters assignment due date which is not existing the table into search box
    Then Displays empty details in the data table

  @TC024
  Scenario: Validate search box function
    Given Admin is on manage assignment page
    When Admin enters grade value  into search box
    Then Displays entries with that assignment  grade

  @TC025
  Scenario: Validate search box function
    Given Admin is on manage assignment page
    When Admin enters grade value which is not existing the table into search box
    Then Displays empty details in the data table




