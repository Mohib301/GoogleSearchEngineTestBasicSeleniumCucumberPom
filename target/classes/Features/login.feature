Feature: Google search engine FEATURE

@GoogleTest_001
  Scenario: Google input data Test Sceraio
    Given User is already on Google page
    When User input 'New York' data in google empty box
    Then User click on search key
    And User is search home page
