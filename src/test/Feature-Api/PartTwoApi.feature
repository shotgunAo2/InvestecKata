Feature: PartTwoApi

  @apiTest
  Scenario: verify
    Given I execute "https://swapi.dev/api/people/" api
    Then I can see the "R2-D2" skin colour is "white, blue"