Feature: feature to test purchase functionality

  Scenario: purchase products from online
    Given Broser is open
    And user is on SwagLabs website
    When user enters login credentials
    And user added products in AddToCart
    Then user is checkouting
