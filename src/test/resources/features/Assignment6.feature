Feature: Verify sort function in manage assignment page


  @TC001
  Scenario: Verify sort function in data table for descending order
    Given Admin is on manage assignment page
    When Admin click on assignment name column header to sort
    Then Admin should see data table sorted in descending order

  @TC002
  Scenario: Verify sort function in data table for ascending order
    Given Admin is on manage assignment page
    When Admin double click on assignment name column header to sort
    Then Admin should see data table sorted in ascending  order

