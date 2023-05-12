Feature: UserMenu.feature
	
	 @TC05
	 Scenario: Select user menu for <username> drop down
    Given User is on "LoginPage"
    When User enter into Textbox "Username" "selenium@gm.com"
    Then User enter into Textbox "Password" "salesforce05"
    And click on Button "Login"
    Then Switch to "Usermenu"
    Then Validate dropdown list "UsermenuList"
    | My Profile											|
    | My Settings											|
    | Developer Console								|		
    | Switch to Lightning Experience	|
    | Logout													|
     
    
    @TC06
    Scenario: Select "My Profile" option from user menu for <username> drop down
    Given User is on "LoginPage"
    When User enter into Textbox "Username" "selenium@gm.com"
    Then User enter into Textbox "Password" "salesforce05"
    And click on Button "Login"
    Then Switch to "Usermenu"
    Then User is on "UserMenuPage"
    Then User clicks link "My profile"
    And User waits 5000
    Then click on Button "Edit profile pen"
    And User waits 5000
    Then Switch to "Edit Profile page"
    And Switch to frame "Frame"
    And click on Button "About tab"
    Then User enter into Textbox "Lastname" "testing"
    And User waits 5000 
    And click on Button "Save All"
    Then User clicks link "Post"
    And Switch to frame "Post frame"
    When User enter into Textbox "Share and update" "welcome to Application"
    Then User is out of frame
    And click on Button "Share"
    Then User clicks link "File"     
    Then click on Button "Upload a file from computer"
    Then User enter into Textbox "Choose file" "C://Users//15105//Desktop//Area.png"
    And click on Button "Share"
    
    @TC08
    Scenario: Developer Console window 
    Given User is on "LoginPage"
    When User enter into Textbox "Username" "selenium@gm.com"
    Then User enter into Textbox "Password" "salesforce05"
    And click on Button "Login"
    Then Switch to "Usermenu"
    Then User is on "UserMenuPage"
    Then User clicks link "Developer Console"
    And User waits 5000
    And User closes window 
    
    @TC09
	 Scenario: Select Logout option from <usermenu>
    Given User is on "LoginPage"
    When User enter into Textbox "Username" "selenium@gm.com"
    Then User enter into Textbox "Password" "salesforce05"
    And click on Button "Login"
    Then Switch to "Usermenu"
    Then User clicks link "Logout"
    
     
