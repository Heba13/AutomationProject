
Feature: Login

  Scenario Outline: User Can Login Seamless
    Given App opened in English and we need to run it in "<lang>"
    When  click on get started button in intro screen
    And  click on continue seamless login button in login screen
    Then App opened

    Examples:
    | lang |
    | en   |

  Scenario Outline: User Can login with password
    Given App opened in English and we need to run it in "<lang>"
    When  click on get started button in intro screen
    And  click on continue seamless login button in login screen
    Then Password field Should be displayed

    Examples:
      | lang |
      | en   |
