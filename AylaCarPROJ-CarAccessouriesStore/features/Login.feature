Feature: Login

  Scenario: Successful login with valid credentials
    Given the user is on the login page
    When the user enters valid credentials
      | Username              | Password   |
      | john.doe@example.com  | securepass |
    And submits the login form
    Then the user should be successfully logged in

  Scenario: Login failure with incorrect password
    Given the user is on the login page
    When the user enters an incorrect password
      | Username              | Password     |
      | john.doe@example.com  | wrongpass    |
    And submits the login form
    Then the login should fail, and an error message should be displayed

  Scenario: Login failure with non-existing username
    Given the user is on the login page
    When the user enters a non-existing username
      | Username               | Password   |
      | nonexisting@example.com | somepass   |
    And submits the login form
    Then the login should fail, and an error message should indicate the username is not registered

  Scenario: Login failure with empty username field
    Given the user is on the login page
    When the user leaves the username field empty
      | Username  | Password   |
      |           | somepass   |
    And submits the login form
    Then the login should fail, and an error message should be displayed indicating the username field is required

  Scenario: Login failure with empty password field
    Given the user is on the login page
    When the user leaves the password field empty
      | Username              | Password   |
      | john.doe@example.com  |            |
    And submits the login form
    Then the login should fail, and an error message should be displayed indicating the password field is required
