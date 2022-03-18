Feature: we are creating feature file to add Orange HRM Scenarios


  ## First Scenario
  @loginWithoutParams
  Scenario: Login to HRM
    Given The user wants to go orangeHRM application
    When The user wants  enter username ans password
    Then The user wants to click login
    And The user should  able to navigate dashboard



## Second Scenario
  @loginWithParams
  Scenario: login with credentials
    Given The user wants to go orangeHRM application
    When the user wants to enter username as "Admin" and the password as "admin123"
    Then The user wants to click login
    And The user should  able to navigate dashboard

@calisamk
  Scenario:
    Given The user wants to go orangeHRM application
    When the user wants to enter username as "Admin" and the password as "admin123"
    Then The user wants to click login
    And The user should  able to navigate dashboard
    Then The user wants to go to the PIM page
    Then The user wants to see add employee page
    Then The user wants to add user name as "Tom"
    Then The user wants to add user last name as "Jerry"
    Then The user wants to save the information
    Then The user should be able to see "Personal Details"
    Then The user wants to click edit
    Then the user wants to update Driver's License Number as "123-456-789
    Then the user wants to update Driver's License Expiry Date
    Then the user wants to update Marital Status
    Then the user wants to update Nationality
    Then the user wants to update Date of Birth
    Then the user wants to update Gender
    Then The user wants to save the information
    Then The user add attachment and upload a sample file And verify the file

  @Candidate
  Scenario: Verify that we can create a candidate

    Given The user wants to go to orangeHRM application
    When The user wants to enter username and password
    Then The user wants to click login
    Then Th  user wants to navigate recruitment
    And Th user wants to add a candidate
    Then the user wants to enter first name as "Adem" and last name "Kaba"
    Then Th user wants to enter email as "aamcikali@otuzbir.com"
    Then The user wants to consent to keep data
    Then The user wants to save
    Then The user wants to verify that the user is created

