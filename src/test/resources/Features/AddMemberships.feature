Feature: Add different memberships

  @addmembership
  Scenario Outline: As an admin user should be able to add different memberships under qualifications
    When Admin user is logged in
    Then Admin navigates to Qualifications
    And Selects membership under qualifications menu
    Then User clicks on add button
    Then User enters different membership "<Memberships>" in the name field
    Then Clicks on safe button
    And Verifies that memberships were added "<Memberships>"

    Examples:

      | Memberships   |
      | Theater club  |
      | Sports club   |
      | Dance club    |
      | Disco club    |
      | Painting club |