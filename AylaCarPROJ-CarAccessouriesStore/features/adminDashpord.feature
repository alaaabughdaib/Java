Feature: Admin dashboard

  Scenario:  Manage product categories
    When admin want to add some product to catalog
    Then the product will be added
    When admin want to edit some product
    Then product will be edited
    When admin want to remove a product
    Then product will be removed






    Scenario:  View and manage customer accounts.
      When admin want to see customer account
      Then the customer account will be viewed

      Scenario: add product listing
        When admin want to add product listing
        Then the product listing will be added