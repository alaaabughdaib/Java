Feature: CustomerRole
  Scenario: Customer browses products
    Given the customer is on the product catalog page
    When the customer views the list of available products
    Then the customer should see a variety of products categorized into sections like "Interior," "Exterior," and "Electronics"

  Scenario: Customer searches for a specific product
    Given the customer is on the product catalog page
    When the customer searches for a specific product by name or keyword
    Then the customer should see relevant search results matching the product name or keyword

  Scenario: Customer filters products by category
    Given the customer is on the product catalog page
    When the customer filters products by selecting a specific category (e.g., "Interior")
    Then the customer should see only products belonging to the selected category

  Scenario: Customer adds a product to the shopping cart
    Given the customer is on the product details page
    When the customer clicks the "Add to Cart" button for a specific product
    Then the product should be added to the customer's shopping cart

  Scenario: Customer makes a purchase
    Given the customer has added products to the shopping cart
    When the customer proceeds to checkout
    And completes the purchase by providing necessary details
    Then the customer should receive an order confirmation
    And the purchased products should be removed from the shopping cart

  Scenario: Customer views order history
    Given the customer is logged in
    When the customer navigates to the order history page
    Then the customer should see a list of past orders
    And be able to view details of each order, including products, quantities, and order status
