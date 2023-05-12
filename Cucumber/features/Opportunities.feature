@Opportunities

Feature: Opportunities.feature
	
	 @TC15
	 Scenario: Opportunities <dropdown>
    Given User is on "LoginPage"
    When User enter into Textbox "Username" "selenium@gm.com"
    Then User enter into Textbox "Password" "salesforce05"
    And click on Button "Login"
    Then User is on "OpportunitiesPage"
    Then User clicks tab "Opportunities"
    And Validate "Dropdown" of "OpportunitiesPage"
    
    @TC17
	 	Scenario: Opportunity Pipeline Report
    Given User is on "LoginPage"
    When User enter into Textbox "Username" "selenium@gm.com"
    Then User enter into Textbox "Password" "salesforce05"
    And click on Button "Login"
    Then User is on "OpportunitiesPage"
    Then User clicks tab "Opportunities"
    And User waits 5000
    Then User clicks link "Opportunity Pipeline Link"
    And User waits 5000
    Then Validate name listed "Opportunity Pipeline" and "Opportunity Pipeline"
    
    @TC18
	 	Scenario: Stuck Opportunities Report
    Given User is on "LoginPage"
    When User enter into Textbox "Username" "selenium@gm.com"
    Then User enter into Textbox "Password" "salesforce05"
    And click on Button "Login"
    Then User is on "OpportunitiesPage"
    Then User clicks tab "Opportunities"
    And User waits 5000
    Then User clicks link "Stuck Opportunities Link"
    And User waits 5000
    Then Validate name listed "Stuck Opportunities" and "Stuck Opportunities"
    
    @TC19
	 	Scenario: Quarterly Summary Report
    Given User is on "LoginPage"
    When User enter into Textbox "Username" "selenium@gm.com"
    Then User enter into Textbox "Password" "salesforce05"
    And click on Button "Login"
    Then User is on "OpportunitiesPage"
    Then User clicks tab "Opportunities"
    And User waits 5000
    Then Selects "Interval"
    And User waits 5000
    Then Selects "Include"
    And User waits 5000
    And click on Button "Run Report"
    Then Validate name listed "Opportunity Report" and "Opportunity Report"
        
    