Feature: Pagination in manage assignment

  Scenario: Verify sheet one is displayed on default in data table
    Given Admin is on dashboard page after Login
    When Admin clicks "Assignment" button on the navigation bar
    Then Data table should display 1 page  when entries available

  Scenario: Verify  right arrow is enable when sheet one is displayed in data table
    Given Admin is on dashboard page after Login
    When Admin clicks "Assignment" button on the navigation bar
    Then Right arrow should be enabled in page one  when entries are more than 5 available

  Scenario: Verify  left arrow is disable when sheet one is displayed in data table
    Given Admin is on dashboard page after Login
    When Admin clicks "Assignment" button on the navigation bar
    Then Left arrow should be disabled in page one  when entries are more than 5 available

  Scenario: Verify  right arrow is enable when sheet two is displayed in data table when entries are more than 10
    Given Admin is on dashboard page after Login
    When Admin clicks "Assignment" button on the navigation bar
    Then Right arrow should be enabled in page two when entries are more than 10 available

  Scenario: Verify  left arrow is enable when sheet two is displayed in data table
    Given Admin is on dashboard page after Login
    When Admin clicks "Assignment" button on the navigation bar
    Then Verify  left arrow is enable when sheet two is displayed in data table


  Scenario: Verify  right arrow is disable when sheet two is displayed in data table when entries are less than 10
    Given Admin is on dashboard page after Login
    When Admin clicks "Assignment" button on the navigation bar
    Then Right arrow should be disabled in page two when entries are less than 10 available

  Scenario: Verify pagination controls enabled
    Given Admin is on dashboard page after Login
    When Admin clicks "Assignment" button on the navigation bar
    Then When entries are more than 5 in data table pagination controls enabled

  Scenario: Verify pagination controls disabled
    Given Admin is on dashboard page after Login
    When Admin clicks "Assignment" button on the navigation bar
    Then When entries are less than 5 in data table pagination controls disabled

  Scenario: Verify next page is enabled
    Given Admin is on dashboard page after Login
    When Admin clicks "Assignment" button on the navigation bar
    Then When total class entries above 5 next page is enabled
#                  ( On multiples of 5 new page will be enabled)

  Scenario: verify next page is disabled
    Given Admin is on dashboard page after Login
    When Admin clicks "Assignment" button on the navigation bar
    Then When total class entries  5 or below next page is disabled















