


Feature: Amazon Search 

@Smoke
Scenario: Search a Product MacBook Air
Given I have a search field on Amazon Page
When I search for a product with name "Apple MacBook Pro" and price 100000
Then Product with name "Apple MacBook Pro" should be displayed

@Regression
Scenario: Search a Product IPhone
Given I have a search field on Amazon Page
When I search for a product with name "IPhone 16 Pro" and price 100000
Then Product with name "IPhone 16 Pro" should be displayed