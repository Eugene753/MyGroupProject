Feature: Add membership to employee

  @employeemembership
  Scenario Outline: As an admin user should be able to add memberships to any employee by specifying
    When Admin user is logged in
    Then User click on PIM Button
    Then In employee name field enter name "Eugene"
    And Click on search button
    Then From the list of employee click on employee name "Eugene"
    Then In personal employee details click on memberships
    And In assigned memberships frame click on add button
    Then Enters "<Membership>" "<Sub Paid By>" "<Sub Amount>" "<Currency>" Sub Commence Date "<Month>" "<Year>" "<Date>" Sub Renewal Date "<Month>" "<Year>" "<Date>"
    And Click on save button
    Then Verifies that entered membership is displayed in membership list "<Membership>"

    Examples:

      | Membership    | Sub Paid By | Sub Amount | Currency             | Month | Year | Date | Month | Year | Date |
      | Dance club    | Company     | 20         | United States Dollar | Aug   | 2021 | 10   | Aug   | 2022 | 10   |
      | Sports club   | Individual  | 10         | United States Dollar | Sep   | 2021 | 7    | Sep   | 2022 | 7    |
      | Theater club  | Company     | 20         | United States Dollar | Jul   | 2021 | 8    | Jul   | 2022 | 9    |
      | Disco club    | Company     | 30         | United States Dollar | Aug   | 2021 | 5    | Aug   | 2022 | 6    |
      | Painting club | Individual  | 15         | United States Dollar | Sep   | 2021 | 3    | Sep   | 2022 | 3    |