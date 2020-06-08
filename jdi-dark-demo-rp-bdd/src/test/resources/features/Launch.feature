@smoke @launch
Feature: Launch controller checks

  Background: Authentication
    Given get sut access token

  Scenario Outline: Start launch in mode <mode>
    Given init 'LaunchControllerApi' service
    When start launch 'Dark_Test' in mode <mode>
    Then <mode> launch status is IN_PROGRESS
    Examples:
      | mode    |
      | DEFAULT |
      | DEBUG   |

  Scenario: Check launch names
    When get all launch names using filter:
      | filter.cnt.name=Dark_Test |
    Then all launch names contain 'Dark_Test'

  Scenario: Check debug launch modes
    When get all debug launches
    Then all debug launches has mode DEBUG

  Scenario: Finish launch
    When finish launch by launch UUId
    Then default launch status is PASSED

  Scenario: Force finish
    When force finish debug launch by Id
    Then check completion message for debug launch:
        """
        Launch with ID = '%s' successfully stopped.
        """
    And debug launch status is STOPPED

  Scenario: Delete launch
    When delete launch by Id
    Then check completion message for default launch:
        """
        Launch with ID = '%s' successfully deleted.
        """
    And default launch status is DELETED

  Scenario: Delete launches
    When delete launches by Ids
    Then debug launch status is DELETED

