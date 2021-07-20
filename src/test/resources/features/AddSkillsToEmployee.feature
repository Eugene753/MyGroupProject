Feature: Adding skills to employee

  Scenario Outline: Adding skills to a chosen employee from a skill list
    Given Admin user is logged in
    When Admin user click on PIM option
    And Admin user clicks on any employee from Employee list
    And Admin user clicks on Qualifications in Personal Details menu
    And Admin user clicks on add button in skills field
    And Admin user select any skill from given
    And Admin user enters "<YearsOfExperience>" and  "<Comments>"
    And Admin user click on skill save button
    Then chosen skill appears as an added skill for employee

    Examples:
      | YearsOfExperience | Comments                                           |
      | 10                | Employee has a long years experience of this skill |
