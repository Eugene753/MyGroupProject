Feature: Employee's licenses

  @qualificationsLicense
  Scenario Outline: As an admin I should be able to add employee's licenses
    Given Admin user is logged in
    When user clicks on PIM button
    And user clicks on "<EmployeeName>" from Employee list
    And user clicks on Qualification button in Personal Details menu
    And user clicks on add button in License field
    And user selects "<LicenseName>" from given
    And user enters "<LicenseNumber>" in License number field
    And user selects issued date fields "<IssuedMonth>", "<IssuedYear>" and "<IssuedDay>"
    And user selects expiry date fields "<ExpiryMonth>", "<ExpiryYear>" and "<ExpiryDay>"
    And user clicks on save license button
    Then verify that license "<LicenseName>" added successfully

    Examples:
    |EmployeeName|LicenseName  |LicenseNumber|IssuedMonth|IssuedYear|IssuedDay|ExpiryMonth|ExpiryYear|ExpiryDay|
    |John John   |Proprietary  |GT456173     |Nov        |1950      |15       |Apr        |2112      |13       |
    |Gulshoda    |Copyleft     |YF454829     |Feb        |1999      |8        |Oct        |2099      |28       |



