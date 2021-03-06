@smoke @activity
Feature: Activity controller checks

  Background: Authentication
    Given get sut access token

  Scenario: Get Activities Using GET
    Given init 'ActivityControllerApi' service
    When perform 'getActivitiesUsingGET' request with named path parameters 'jdi-tests'
    Then response status type is OK

