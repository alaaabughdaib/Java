Feature: Installation request

  Scenario: empty information
    When customer click on install and flag is 'true'
    Then the field 'model' should be an error
    And the field 'date' should be an error

  Scenario: successful information
    When customer click insert order and flag is 'true'
    Then he fill 'model' with 'mn'
    And  he fill 'date' with '20/11/2023'
    And presses 'install' and flag is 'true'
    Then installation request successful

