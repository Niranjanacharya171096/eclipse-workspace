Feature: Guru99 Bank project
  Scenario Outline: Verify Login of Guru99 Bank
    Given I am on login page
    And I enter UserID "<userID>"
    And I enter Password "<password>"
    When I click on Login button
	Then I should be on "<page>" Welcome Page

    Examples: 
      | userID     | password | page |
      | mngr529171 | ehErAhU  | Managerhomepage |