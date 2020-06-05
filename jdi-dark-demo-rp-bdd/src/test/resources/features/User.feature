@smoke @user
Feature: User controller checks

  Background: Authentication
    Given get sut access token

  Scenario Outline: Get Activities Using GET
    Given init 'ActivityControllerApi' services
    When change password from '<oldPassword>' to '<newPassword>'
    Then response body has values:
      | errorCode | <errorCode> |
      | message   | <message>   |

    Examples:
      | oldPassword | newPassword  | errorCode | message                                                                      |
      | wrong       | new          | 4001      | Incorrect Request. [Field 'newPassword' should have size from '4' to '256'.] |
      | wrong       | new password | 40010     | Forbidden operation. Old password not match with stored.                     |
