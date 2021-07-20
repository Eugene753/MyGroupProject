Feature: Adding skills


  Scenario: Adding multiple skills in a single execution
    Given Admin user is logged in
    When Admin user navigates to Admin page
    And Admin user navigates to Qualifications
    And Admin user selects skills
    When Admin user enters multiple skills and verify they are added successfully
      | SkillName       | Description                                                                                                                                |
      | Teamwork        | This is about person that appears as a team player                                                                                         |
      | Problem solving | Ability to take a logical and analytical approach to solving problems and resolving issues                                                 |
      | Organisation    | Ability to prioritise, work efficiently and productively, and manage your time well                                                        |
      | Confidence      | Ability to strike the balance of being confident in yourself but not arrogant, but also have confidence in your colleagues and the company |