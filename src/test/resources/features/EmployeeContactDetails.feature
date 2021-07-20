Feature: Change employee contact details

  @changedetails
  Scenario: As an admin I should be able to change employee's contact details
    When Admin user is logged in
    Then User click on PIM Button
    Then In employee name field enter name "Eugene"
    And Click on search button
    Then From the list of employee click on employee name "Eugene"
    Then In personal employee details click on contact details
    Then Clicks on edit button and enters Contact details
      | Address Street 1 | Address Street 2 | City          | State/Province | Zip/Postal Code | Country       | Home Telephone | Mobile       | Work Telephone | Work Email      | Other Email    |
      | 5684 Forest Ave  | 5858 Maven Ave   | New York City | New York       | 56896           | United States | 456-586-8999   | 458-639-7852 | 458-203-2145   | maven@gmail.com | repo@gmail.com |