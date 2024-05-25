Feature: ReviewAndRating

  @ReviewsAndRatings
  Scenario: Customer leaves a review and rating for a product
    Given the customer is on the product details page
    When the customer clicks on the "Write a Review" button
    And provides a review with comments and a rating (e.g., 4 stars)
    And submits the review
    Then the review and rating should be saved for the product
    And the product's average rating should be updated

  @ReviewsAndRatings
  Scenario: Customer leaves a review and rating for an installation service
    Given the customer has requested an installation service
    When the installation is completed
    And the customer clicks on the "Write a Review" button for the installation service
    And provides a review with comments and a rating (e.g., 5 stars)
    And submits the review
    Then the review and rating should be saved for the installation service
    And the installation service's average rating should be updated

  @ReviewsAndRatings
  Scenario: Customer views average ratings and reviews on a product page
    Given the customer is on the product details page
    Then the customer should see the average rating for the product
    And a summary of reviews, including comments and individual ratings

  @ReviewsAndRatings
  Scenario: Customer views average ratings and reviews on an installation service page
    Given the customer is on the installation service details page
    Then the customer should see the average rating for the installation service
    And a summary of reviews, including comments and individual ratings
