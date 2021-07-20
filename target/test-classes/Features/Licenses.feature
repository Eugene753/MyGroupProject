Feature: Licenses

  @licenses
  Scenario Outline: As an admin user should be able to add different licenses in qualifications
    Given Admin user is logged in
    When user clicks on Admin button
    And user navigates to Qualifications
    And user selects licenses
    And user clicks on add button
    And user enters "<Name>"
    And user clicks on save button
    Then Verify licenses "<Name>" added successfully

    Examples:
      | Name          |
      | Public domain |
      | Permissive    |
      | LGPL          |
      | Copyleft      |
      | Proprietary   |








