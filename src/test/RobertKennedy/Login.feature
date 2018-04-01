Feature: Login to robert kennedy college

  Scenario: I can login to robert kennedy page

    Given I am on robert kennedy landing page
    And I enter "olatunde.oladeni" and "1Latunde"
    And I click login button
    Then I should see "Salford Business School"




  Scenario Outline: I can login to robert kennedy page

   Given I am on robert kennedy landing page
   And I enter "<login name>" and "<Password>"
   And I click login button
   Then I should see "<error message>"

  Examples:
    | login name     | Password | error message                |
    |olatunde.oladeni|1Latund   |incorrect username or password|
    |olatunde.oladen |1Latunde  |incorrect username or password|







