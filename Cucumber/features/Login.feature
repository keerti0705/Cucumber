Feature: Login.feature

	
	
	@TC01
	 Scenario: Login into salesforce with valid username and password
    Given User is on "LoginPage"
    When User enter into Textbox "Username" "selenium@gm.com"
    Then User enter into Textbox "Password" "salesforce05"
    And click on Button "Login"
   
   @TC02 
    Scenario: Login into salesforce with valid username and invalid password
    Given User is on "LoginPage"
    When User enter into Textbox "Username" "selenium@gm.com"
    Then User enter into Textbox "Password" ""
    And click on Button "Login"
	
	@TC03
 	Scenario: Remeber me checkBox
    Given User is on "LoginPage"
    When User enter into Textbox "Username" "selenium@gm.com"
    Then User enter into Textbox "Password" "salesforce05"
    Then User clicks on checkbox "Remeber me"
    And click on Button "Login"
    Then User clicks on dropdown "Usermenu"
    And Selects "Logout" 
   
   @TC04a
   Scenario: Test forgot password
   Given User is on "LoginPage"
   Then User clicks link "Forgot Password"
   Then User enter into Textbox "Username1" "selenium@gm.com"
   And click on Button "Continue"
   
   @TC04b
   Scenario: Validate Login Error Msg
   Given User is on "LoginPage"
   Then User enter into Textbox "Username" "123"
   Then User enter into Textbox "Password" "22131"
   And click on Button "Login"
   Then Validate error message "Message"
      
     
