Feature: Testing Login Funtionality

  Scenario: User should be able to LogIn with valid email and password
    Given User open the Brower
    And User navigates to "https://turo.com/"
    And User Hover over the dropdown
    And User clicks on LogIn button
    And User enters valid Email address
    And User enters valid Password
    Then User clicks on the LogIn button again
    And User Should see Log out button
