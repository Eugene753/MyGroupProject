Feature: Adding employee's Emergency Contacts and Dependents

  Background:
    Given Admin user is logged in
    And navigate to PIM options
    And Admin user clicks on any employee from Employee list

  @AddEmergencyContact
  Scenario: Adding multiple info to the emergency contacts of employee
      When admin user clicks on Emergency contacts
      And admin user clicks on add Assigned Emergency Contacts button
      Then enters following name relationship home telephone mobile work phone

  |Name  |Relationship|Home Telephone|Mobile      |Work Telephone|
  |Darina| Friend     |111-111-1111  |222-222-2222|333-333-3333|
    Then admin user clicks on save button



@AddDependent
Scenario: Adding employee's multiple dependents as admin
  When admin user clicks on Dependents button
  Then enters Name Relationship Date of Birth

   |Name         |Relationship |Month|Year |Day|
   |Darina       |Child        |Aug  |  1995|10|

