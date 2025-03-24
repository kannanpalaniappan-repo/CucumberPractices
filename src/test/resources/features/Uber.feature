@All
Feature: Uber Booking Feature




@smoke @prod
Scenario: Booking Cab Sedan
Given User wants to select a car type "sedan" from uber app
When User selects car "sedan" and pick up point "Bangalore" and drop location "Pune"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD
Then user clicks the homePage

@regression @smoke
Scenario: Booking Cab Suv
Given User wants to select a car type "suv" from uber app
When User selects car "suv" and pick up point "Bangalore" and drop location "Pune"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD

@prod @smoke
Scenario: Booking Cab Mini
Given User wants to select a car type "mini" from uber app
When User selects car "mini" and pick up point "Bangalore" and drop location "Pune"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD