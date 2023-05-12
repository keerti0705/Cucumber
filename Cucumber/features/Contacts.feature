Feature: Leads.feature

	@TC25
	Scenario: Create new contact
    Given User is on "LoginPage"
    When User enter into Textbox "Username" "selenium@gm.com"
    Then User enter into Textbox "Password" "salesforce05"
    And click on Button "Login"
    Then User is on "ContactsPage"
    Then User clicks tab "Contacts"
    And click on Button "New"
    Then User enters into Textbox "Last Name"
    Then User enter into Textbox "Account Name" "test"
    And click on Button "Save"
    Then Validate name listed "New View"
    
    @TC26
		Scenario: Create new view in the contact page
    Given User is on "LoginPage"
    When User enter into Textbox "Username" "selenium@gm.com"
    Then User enter into Textbox "Password" "salesforce05"
    And click on Button "Login"
    Then User is on "ContactsPage"
    Then User clicks tab "Contacts"
    Then User clicks link "Create New View"
    Then User enters into Textbox "View Name"
    Then User enters into TextBox "View Unique Name"
    And click on Button "Save"
    Then Validate new view "New View"
    
    @TC27
		Scenario: Create new view in the contact page
    Given User is on "LoginPage"
    When User enter into Textbox "Username" "selenium@gm.com"
    Then User enter into Textbox "Password" "salesforce05"
    And click on Button "Login"
    Then User is on "ContactsPage"
    Then User clicks tab "Contacts"
    Then Selects "Recently Created"
    Then Validate name listed "Recent Contacts" and "Recent Contacts" 
    
    @TC28
		Scenario: Create new view in the contact page
    Given User is on "LoginPage"
    When User enter into Textbox "Username" "selenium@gm.com"
    Then User enter into Textbox "Password" "salesforce05"
    And click on Button "Login"
    Then User is on "ContactsPage"
    Then User clicks tab "Contacts"
    Then Selects "View DD"
    And User waits 5000
    And click on Button "Go"
    
    @TC29
		Scenario: View in the contact page
    Given User is on "LoginPage"
    When User enter into Textbox "Username" "selenium@gm.com"
    Then User enter into Textbox "Password" "salesforce05"
    And click on Button "Login"
    Then User is on "ContactsPage"
    Then User clicks tab "Contacts"
    Then User clicks link "Contact Name"
    Then Validate name listed "Contact Name Page" and "bhatt05" 
    
    @TC30
		Scenario: Check the error message
    Given User is on "LoginPage"
    When User enter into Textbox "Username" "selenium@gm.com"
    Then User enter into Textbox "Password" "salesforce05"
    And click on Button "Login"
    Then User is on "ContactsPage"
    Then User clicks tab "Contacts"
    Then User clicks link "Create New View"
    Then User enters into TextBox "View Unique Name"
    And click on Button "Save Btn"
    Then Validate name listed "Error Msg" and "Error: You must enter a value"
    
    @TC31
		Scenario: Check the cancel button
    Given User is on "LoginPage"
    When User enter into Textbox "Username" "selenium@gm.com"
    Then User enter into Textbox "Password" "salesforce05"
    And click on Button "Login"
    Then User is on "ContactsPage"
    Then User clicks tab "Contacts"
    Then User clicks link "Create New View"
    Then User enter into Textbox "View Name" "ABCD"
    Then User enter into Textbox "View Unique Name" "EFGH"
    And click on Button "Cancel"
    Then Validate name listed "Contacts Home Page" and "Home"
    
    @TC32
		Scenario: Check the Save & New button
    Given User is on "LoginPage"
    When User enter into Textbox "Username" "selenium@gm.com"
    Then User enter into Textbox "Password" "salesforce05"
    And click on Button "Login"
    Then User is on "ContactsPage"
    Then User clicks tab "Contacts"
    And click on Button "New"
    Then User enter into Textbox "Last Name" "Indian"
    Then User enter into Textbox "Account Name" "Global Media"
    And User waits 5000
    And click on Button "Save and New"
    Then Validate error message "Error Message" "Error: Invalid Data.Review all error messages below to correct your data."