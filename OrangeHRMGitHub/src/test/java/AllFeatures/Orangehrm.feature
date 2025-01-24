Feature: OrangeHRM Application

  Scenario: validate loginpage functionlity by entering username
    Given user enter "Adminee" username
    And user click on login button
    Then user capture warning error message on password text box

  #AfterHooks --Refresh page
  Scenario: validate loginpage functionlity by entering password
    Given user enter "adminee11" password
    And user click on login button
    Then user capture warning error message on username text box

  #AfterHooks --Refresh page
  Scenario: validate loginpage functionlity by entering invalid credentials
    Given user enter "Adminee" username
    And user enter "adminee11" password
    And user click on login button
    Then user capture invalid warning error message

  #AfterHooks --Refresh page
  Scenario: validate loginpage functionlity by entering valid credentials
    Given user enter "Admin" username
    And user enter "admin123" password
    And user click on login button
