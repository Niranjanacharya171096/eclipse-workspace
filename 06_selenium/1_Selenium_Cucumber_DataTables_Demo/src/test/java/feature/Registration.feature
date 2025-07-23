Feature: User Registration

  Scenario: Multiple users Registration
    Given the following users registration:
      | username | password  | role   |
      | alice    | pass123   | admin  |
      | bob      | qwerty456 | user   |
      | clara    | pass789   | guest  |

    When user set login attempt to 5
    And user enable email notifications: "true"
    And user enable 2FA: false
    Then the system should show the message "Settings applied"
    And the role of "bob" should be "user"
    And the user "dave" should not exist
