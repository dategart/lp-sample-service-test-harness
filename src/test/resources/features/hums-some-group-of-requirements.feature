Feature: A sample feature file with example scenario

  Scenario Outline: The target in the xliff must be translated
    Given some condition "<some_condition>"
    When A message is submitted
    Then The translated target segment should be "<translation>"

    Examples:
      | some_condition  | translation   |
      | cond_1          | tran_1        |
      | cond_2          | tran_2        |
      | cond_3          | tran_3        |

  Scenario: The service will do something if the translation type matches a certain language
    Given the following translation types and languages:
      | translation_type  | language  |
      | source_scripts    | fra       |
      | source            | kor       |
      And some other interesting condition
    When A message is submitted
    Then The translated target segment should be blank