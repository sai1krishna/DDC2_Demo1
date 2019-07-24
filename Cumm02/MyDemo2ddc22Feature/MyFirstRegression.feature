Feature: My validation on american Express

@Regression
Scenario: I want to login
Given I have an account
And I will provide data
Then My login success

@Regression @smoke
Scenario: I want to view my membership
Given I have logged in
Then I clicked on reward points
And I will check for my rewards

@Sanity
Scenario: I want to refer my friend
Given I am offered with referral bonus
When I shared the link with my friend
Then I will get some Zeta Points
Then I will enjoy my friday party
