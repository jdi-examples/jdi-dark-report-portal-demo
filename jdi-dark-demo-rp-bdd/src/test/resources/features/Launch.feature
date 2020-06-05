@smoke
Feature: Launch controller checks

  Background: Authentication
    Given get sut access token

  Scenario Outline: Start launch in mode <mode>
    Given init 'LaunchControllerApi' service
    When start launch 'Dark_Test' in mode <mode>
    Then launch is successfully started
    Examples:
      | mode    |
      | DEFAULT |
      | DEBUG   |

    Scenario: Check launch names
      When get all launch named using filter:
      | filter.cnt.name=Dark_Test |
      Then all launch names contain 'Dark_Test'