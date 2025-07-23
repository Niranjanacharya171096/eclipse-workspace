Feature: User Settings Management

  Scenario: Configure multiple users with settings
    Given the following users exist:
      | username | password  | active | role   |
      | alice    | pass123   | true   | admin  |
      | bob      | qwerty456 | false  | user   |
      | clara    | pass789   | true   | guest  |

    When I set the login attempt limit to 5
    And I enable email notifications: "true"
    And I enable 2FA: false
    Then the system should show the message "Settings applied"
    And the role of "bob" should be "user"
    And the user "dave" should not exist    