Feature: Test Rabobank.nl contact us section 

Scenario: Contact us section is visible from particulieren page 
	Given I am on the Rabobank homepage 
	When I navigate to particulieren page 
	Then I should be able to validate Contact us Section 
	And "Bel met ons" option should be there in Contacts
	
Scenario: Contact us section is visible from private banking page 
	Given I am on the Rabobank homepage 
	When I navigate to Private banking page 
	Then I should be able to validate Contact us Section 
	And "Naar uw bank" option should be there in Contacts 
	
Scenario: Contact us section is visible from bedrijven page 
	Given I am on the Rabobank homepage 
	When I navigate to bedrijven page 
	Then I should be able to validate Contact us Section 
	And "Naar uw bank" option should be there in Contacts