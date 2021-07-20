Feature: Add language

  @differentlanguages
  Scenario Outline: Add different languages in qualifications
    Given Admin user is logged in
    When Admin user clicks on Admin button
    And Admin user navigates to Qualifications
    And Admin user selects Languages
    And Admin user clicks on add button
    And Admin user enter "<language>"
    Then Added "<language>" is displayed in Languages list
    Examples:
      | language  |
      | Ukrainian |
      | Russian   |
      | German    |
      | Spanish   |
      | Hungarian |



