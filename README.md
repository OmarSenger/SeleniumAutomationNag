# SeleniumAutomationNag
I used Selenium Webdriver Version 4.4.0 with java . 
I automate as required " Book Counter " process .

# Test Case Required " Workflow "
1. Open Nagwa website in Arabic.
2. Choose English language to open the home page.
3. Click on Search icon .
4. Use Excel Reader to read data from excel sheet and search with " addition " as a lesson .
5. A list with all lessons in Nagwa that match this name will appear.
6. Click on 2nd lesson in the search results to open its page.
7. Go to worksheet section then click preview button.
8. Worksheet page will open then count number of questions displayed on it and
print the count.

I used Page object model to organize my script by writing every pages' locators , constractors and actions in separate page then calling them all in my test class 
" TestCase " to run my script with testrunner function .

I used Excel Reader to read data from excel sheet as a Data Driven Development to make our inputs dynamic not hard coded in the script , i just put 2 rows and columns in the excel sheet as an example . 

# BDD " Behaviour Driven Development "
I used the bdd framework as an agile process that using a tool called " CUCUMBER " with Gherkin Language .
Cucumber is a tool that used for writing acceptance test cases .

# Maven 
I used maven to manage the dependencies i used for writing my script

# Junit & TestNG
I used junit & TestNG annotations to organize and run my test cases .



