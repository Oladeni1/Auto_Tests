Feature: Login in to yahoo page

  Scenario: I can log in to CarTransplant page

    Given I enter valid olatundeoladeni@yahoo.com and ILatunde
    When I press login button
    Then I should see header logo
