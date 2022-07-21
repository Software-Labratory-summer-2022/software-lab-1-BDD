@tag
Feature: Calculator

  Scenario: calculate operation of two numbers
    Given Two input values, 6 and 2, one operator *
    When I operate on the two values
    Then I expect the result 12

  Scenario Outline: calculate operation of two numbers
    Given Two input values, <first> and <second>, one operator <operator>
    When I operate on the two values
    Then I expect the result <result>
    Examples:
      | first | second | operator | result |
      | 6     | 2      | *        | 12     |
      | 6     | 2      | /        | 3      |
      | 6     | 2      | ^        | 36     |
      | 3     | 2      | /        | 1      |
