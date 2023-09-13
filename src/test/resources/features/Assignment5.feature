Feature: Delete Assignment validation

@TC001
  Scenario: Verify Delete Assignment alert
    Given Admin is on manage assignment page
    When Admin clicks delete button in data table row level
    Then Admin should see dialog box

  @TC002
  Scenario: Verify  accept enabled in alert
    Given Admin is on manage assignment page
    When  Admin clicks delete button in data table row level
    Then Alert should have "yes" button to accept

  @TC003
  Scenario: Verify reject enabled in alert
    Given Admin is on manage assignment page
    When Admin clicks delete button in data table row level
    Then Alert should have "No" button to reject

  @TC004
  Scenario: Validate accept in alert
    Given Admin is in delete alert
    When Admin clicks yes button
    Then Redirected to assignment page and selected assignment details are deleted from the data table

  @TC005
  Scenario: Validate reject in alert
    Given Admin is in delete alert
    When Admin clicks no button
    Then Redirected to assignment page and selected assignment details are not deleted from the data table

  @TC006
  Scenario:Verify delete multiple class  button is enabled
    Given Admin is on manage assignment page
    When Admin clicks single  row level check box in the data table
    Then Admin should see delete icon below the header is enabled

  @TC007
  Scenario: Verify accept alert in delete multiple class function by selecting single checkbox
    Given Admin is in delete alert
    When Admin clicks yes button
    Then Redirected to assignment page and selected assignment details are deleted from the data table

  @TC008
  Scenario: Verify reject alert in delete multiple class function by selecting single checkbox
    Given Admin is in delete alert
    When Admin clicks no button
    Then Redirected to assignment page and selected assignment details are not deleted from the data table

  @TC009
  Scenario: Verify accept alert in delete multiple class function by selecting multiple checkbox
    Given Admin is in delete alert
    When Admin clicks yes button
    Then Redirected to assignment page and selected assignment details are deleted from the data table

  @TC010
  Scenario: Verify reject alert in delete multiple class function by selecting multiple checkbox
    Given Admin is in delete alert
    When Admin clicks no button
    Then Redirected to assignment page and selected assignment details are not deleted from the data table
