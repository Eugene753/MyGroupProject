Feature: Adding language to employee

  @addlanguage
  Scenario Outline: Adding languages to any employee
    Given Admin user is logged in
    When Clicks on PIM option
    And Clicks on employee name "Yarina" from Employee list
    And Clicks on Qualifications in Personal Details menu
    And Clicks on Add button in languages field
    And Selects any "<Language>", "<Fluency>" and "<Competency>" from lists
    And Clicks on save button
    Then Chosen language is displayed in Languages list

    Examples:
      | Language  | Fluency  | Competency    |
      | Ukrainian | Speaking | Mother Tongue |
      | German    | Writing  | Poor          |
      | Hungarian | Reading  | Basic         |
