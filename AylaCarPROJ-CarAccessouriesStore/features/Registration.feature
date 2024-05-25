Feature: Registration


  Scenario: Customer successfully registers with valid information
    Given the customer is on the registration page
    When the customer provides valid registration details
      | Name         | Email                    | Phone Number  | Address            | Password   |
      | John Doe     | john.doe@example.com     | 1234567890    | 123 Main Street    | securepass |
    And submits the registration form
    Then the customer should be successfully registered

  Scenario: Customer cannot register with incomplete information
    Given the customer is on the registration page
    When the customer provides incomplete registration details
      | Name         | Email                    | Phone Number  | Address            | Password   |
      |              | john.doe@example.com     |               |                    | securepass |
    And submits the registration form
    Then the registration should fail, and an error message should be displayed

  Scenario: Customer cannot register with an existing email address
    Given the customer is on the registration page
    And there is an existing customer with the email "existing.customer@example.com"
    When the customer provides registration details with the same email
      | Name         | Email                       | Phone Number  | Address            | Password   |
      | New User     | existing.customer@example.com| 9876543210    | 456 Oak Street     | newpass    |
    And submits the registration form
    Then the registration should fail, and an error message should indicate the email is already in use




 
