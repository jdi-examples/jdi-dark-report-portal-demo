@smoke @user
Feature: User controller checks

  Background: Authentication
    Given get sut access token

  Scenario Outline: Change Password Negative
    Given init 'UserControllerApi' service
    When change password from '<oldPassword>' to '<newPassword>'
    Then response status code is <statusCode>
    And response body has values:
      | message | <message> |

    Examples:
      | oldPassword | newPassword  | statusCode | errorCode | message                                                                      |
      | wrong       | new          | 400        | 4001      | Incorrect Request. [Field 'newPassword' should have size from '4' to '256'.] |
      | wrong       | new password | 400        | 40010     | Forbidden operation. Old password not match with stored.                     |
