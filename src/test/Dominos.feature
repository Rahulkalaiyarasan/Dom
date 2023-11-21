Feature: Ordering Pizza and Beverages on Domino's Website
  Scenario: Adding the pizza and beverages
    Given I am on the Domino's website
    When I click "Order Online Now"
    And I enter my address and select the first suggestion
    And I click the "VEG PIZZA" menu
    And I click the "Beverages" menu in the current page
    And I Removed the products from the cart
    And I click "Check out" button







































