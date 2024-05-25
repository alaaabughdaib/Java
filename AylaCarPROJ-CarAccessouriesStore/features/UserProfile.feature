Feature: UserProfile

  
  Scenario: Customer edits their profile
    Given the customer is logged in
    When the customer navigates to the profile editing page
    And updates their contact information
      | New Name     | New Email             | New Phone Number |
      | Updated User | updated.user@email.com| 1234567890       |
    And submits the profile editing form
    Then the customer's profile should be updated successfully


  Scenario: Customer views order history
    Given the customer is logged in
    When the customer navigates to the order history page
    Then the customer should see a list of past orders
    And be able to view details of each order, including products, quantities, and order status

 
  Scenario: Customer views installation requests
    Given the customer is logged in
    When the customer navigates to the installation requests page
    Then the customer should see a list of past installation requests
    And be able to view details of each installation request, including installer information and status
