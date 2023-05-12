Feature: UserMenu.feature
	
	 @TC10
	 Scenario: Select user menu for <username> drop down
    Given User is on "LoginPage"
    When User enter into Textbox "Username" "selenium@gm.com"
    Then User enter into Textbox "Password" "salesforce05"
    And click on Button "Login"
    Then User is on "AccountsPage"
    Then User clicks tab "Accounts"
    And click on Button "New"
    Then User enter into Textbox "Account Name" "April7"
    And Selects "Technology partner" 
    And Selects "High"
    And click on Button "Save"
    
    @TC11
	 	Scenario: Create New View
    Given User is on "LoginPage"
    When User enter into Textbox "Username" "selenium@gm.com"
    Then User enter into Textbox "Password" "salesforce05"
    And click on Button "Login"
    Then User is on "AccountsPage"
    Then User clicks tab "Accounts"
    Then User clicks link "Create New View"
    And User waits 5000
    #Then User enter into Textbox "View Name" "April7Testing"
    Then User enters into Textbox "View Name"
    Then User enter into Textbox "View Unique Name" "UniqueApril7"
    #Then User enter into Textbox "View Unique Name"
    And click on Button "View Save"
    Then Validate name listed "Selected View"
    
    @TC12
	 	Scenario: Create New View
    Given User is on "LoginPage"
    When User enter into Textbox "Username" "selenium@gm.com"
    Then User enter into Textbox "Password" "salesforce05"
    And click on Button "Login"
    Then User is on "AccountsPage"
    Then User clicks tab "Accounts"
    And User waits 5000
    Then User clicks link "View"
    And click on Button "Edit"
    Then User enter into Textbox "View Name" "newView"
    Then User enter into Textbox "View Unique Name" "newUniqueName"
    And click on Button "Account Name"
    And click on Button "C"
    Then User enter into Textbox "Value" "a"
    And click on Button "Save"
    Then Validate name listed "Selected View" and "newView"
    
    @TC13
	 	Scenario: Merge accounts
    Given User is on "LoginPage"
    When User enter into Textbox "Username" "selenium@gm.com"
    Then User enter into Textbox "Password" "salesforce05"
    And click on Button "Login"
    Then User is on "AccountsPage"
    Then User clicks tab "Accounts"
    And User waits 5000
    Then User clicks link "Merge Accounts"
    Then User enter into Textbox "Accounts Search" "123"
    And click on Button "Find Accounts"
    And User waits 5000
    And click on Button "Next"
    And click on Button "Merge"
    Then User is prompted with alert
    And User waits 5000
    
    @TC14
	 	Scenario: Create account report
    Given User is on "LoginPage"
    When User enter into Textbox "Username" "selenium@gm.com"
    Then User enter into Textbox "Password" "salesforce05"
    And click on Button "Login"
    Then User is on "AccountsPage"
    Then User clicks tab "Accounts"
    And User waits 5000
    Then User clicks link "Accounts with last activity>30 days"
    And click on Button "Dropdown"
    Then Selects "Create date"
    And click on Button "Calendar - From"
    And User waits 5000
    And click on Button "Today"
    And User waits 5000
    And click on Button "Calendar - To"
    And User waits 5000
    And click on Button "Today To"
    And User waits 5000
    And click on Button "Save"
    And User waits 5000
    Then User enter into Textbox "Report name" "testing8"
    And User waits 5000
    Then User enter into Textbox "Report unique name" ""
    Then User enter into Textbox "Report unique name" "uniqueTesting8"
    And User waits 5000 
    And click on Button "Save and Run"
        
    