Feature: Navigation function validation from manage assignment page to other pages


  Scenario Outline: Verify admin is able to navigate from manage assignment to other pages
    Given Admin is on manage assignment page
    When Admin clicks " <option>" button in the navigation bar
    Then Admin should able to land on " <option>" particular page
    Examples:
      | option |
      | student |
      | program |
      | batch |
      | user |
      | class |
      | Attendance |
      | login |





