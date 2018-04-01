Feature: To check Mot status

  Scenario: User should be able to check Mot status

    Given I am on hmrc home page
    And I navigate to mot page
    And I click on mot link
    And I enter car details
    When I click submit button
    Then I should see the car details displayed

