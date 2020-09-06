Feature: PartTwoApi

  @apiTest
  Scenario: Verify R2D2 skin colour
    Given I execute "https://swapi.dev/api/people/" api
    Then I can see the "R2-D2" skin colour is "white, blue"