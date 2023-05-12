Feature: Leads.feature

	@TC20
	Scenario: Check <Leads> tab link
    Given User is on "LoginPage"
    When User enter into Textbox "Username" "selenium@gm.com"
    Then User enter into Textbox "Password" "salesforce05"
    And click on Button "Login"
    Then User is on "LeadsPage"
    Then User clicks tab "Leads"
    
    @TC21
	 	Scenario: View <dropdown> validation
    Given User is on "LoginPage"
    When User enter into Textbox "Username" "selenium@gm.com"
    Then User enter into Textbox "Password" "salesforce05"
    And click on Button "Login"
    Then User is on "LeadsPage"
    Then User clicks tab "Leads"
        
    @TC22
	 	Scenario: Functionality of <Go> button
    Given User is on "LoginPage"
    When User enter into Textbox "Username" "selenium@gm.com"
    Then User enter into Textbox "Password" "salesforce05"
    And click on Button "Login"
    Then User is on "LeadsPage"
    Then User clicks tab "Leads"
    Then Selects "MyUnreadLeads"
    Then Switch to "Usermenu"
    Then User is on "UserMenuPage"
    And Selects "Logout"
    And User waits 5000
    Given User is on "LoginPage"
    When User enter into Textbox "Username" "selenium@gm.com"
    Then User enter into Textbox "Password" "salesforce05"
    And click on Button "Login"
    And User waits 5000
    Then User is on "LeadsPage"
    Then User clicks tab for second time "Leads"
    Then Validate name listed "My Unread Leads" and "My Unread Leads"
    
    @TC23
	 	Scenario: List item <Today's Leads> work
    Given User is on "LoginPage"
    When User enter into Textbox "Username" "selenium@gm.com"
    Then User enter into Textbox "Password" "salesforce05"
    And click on Button "Login"
    Then User is on "LeadsPage"
    Then User clicks tab "Leads"
    Then Selects "MyUnreadLeads"
    Then Validate name listed "My Unread Leads" and "My Unread Leads"
    
    @TC24
	 	Scenario: Check <New> button on Leads page
    Given User is on "LoginPage"
    When User enter into Textbox "Username" "selenium@gm.com"
    Then User enter into Textbox "Password" "salesforce05"
    And click on Button "Login"
    Then User is on "LeadsPage"
    Then User clicks tab "Leads"
    And click on Button "New"
    When User enter into Textbox "LastName" "PQRS"
    When User enter into Textbox "CmpyName" "PQRS"
    And click on Button "Save"
    Then Validate name listed "New Leads" and "PQRS"
   