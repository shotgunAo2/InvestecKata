#As a user,
#  I want to understand more about the interest rates
#  So that I can maximise my investments

  Feature: Understanding Cash Investment Interest Rates
    Scenario: Signup for focused insights
      Given I am navigate to the Investec SA home page
       When I click on the search option
        And I enter "cash investment rates" in the search field
        And I click on the search button
      Then I see the search results page
      When I click on "Understanding cash investment interest rates"
      Then I see the "Understanding cash investment interest rates" page
      When I click on the Sign up button
       And I enter name "Rowen"
       And I enter Surname "Naidoo"
       And I enter Email " test@investec.co.za"
       And I check the checkbox to receive insights for "Myself"
       And I click the Submit button
      Then I see the Thank you message displayed