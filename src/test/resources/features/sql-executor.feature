Feature:

  Scenario: A query expecting a result of "1" evaluates properly
    Given I have a test that expects a value of "1"
    When I execute my test case
    Then I see that the result of the query is "1"