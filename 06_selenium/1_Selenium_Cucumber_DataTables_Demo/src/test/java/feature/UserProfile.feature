Feature: User Profile Management

  Scenario Outline: Update user profile and validate settings
    Given the user "<username>" exists with the following details:
      | password | <password> |
      | active   | <active>   |
      | role     | <role>     |
    When I update the login attempt limit to <limit>
    And I set email notifications to "<emailNotifications>"
    When I enable TwoFA: <twoFA>
    Then I should see the message "<message>"
    And the user "<username>" should have role "<role>"
    And the user "<username>" should be <activeStatus>

    Examples:
      | username | password | active | role  | limit | emailNotifications | twoFA | message             | activeStatus |
      | alice    | pass123  | true   | admin | 5     | true               | true  | Settings saved      | active       |
      | bob      | secret   | false  | user  | 3     | false              | false | Profile updated     | inactive     |
