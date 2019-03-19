@TC
Feature: Login functionality for adactin application
contains 1 test scenario

Background: User launch the browser
Given User should launch the browser and navigate to Adactin application
@TC1
Scenario: Verify user login for valid crendetials
When User enter the userName in the loginpage
And User enter the password in the loginpage
And User click on login button in the login page
 And User click on logout button
 @TC2
 Scenario: User verify whether the check-out date field accepts a later date than checkin date.
 
 When User enter the userName in the loginpage
And User enter the password in the loginpage
And User click on login button in the login page
 And User select the location in the home page using drop down
 And User select the hotel in the home page using drop down 
 And User Select the room type in the home page using drop down
 And User select the no of rooms type in the home page using drop down
 And User enter the check in date in the homepage
 And User enter the check out date in the homepage
 And User select the adults room in the home page
 And User select the children room in the homepage
 And User click on search button
 Then User validate the error message
 And User click on logout button
 
 @TC3
 Scenario: User check if error is reported if check-out date field is in the past
 When User enter the userName in the loginpage
And User enter the password in the loginpage
And User click on login button in the login page
 And User select the location in the home page using drop down
 And User select the hotel in the home page using drop down 
 And User Select the room type in the home page using drop down
 And User select the no of rooms type in the home page using drop down
 And User enter the past check in date in the homepage
 And User enter the past check out date in the homepage
 And User select the adults room in the home page
 And User select the children room in the homepage
 And User click on search button
 Then User validate the error message
 And User click on logout button
 
 @TC4
 Scenario: User verify whether locations in Select Hotel page are displayed according to the location selected in Search Hotel
 When User enter the userName in the loginpage
And User enter the password in the loginpage
And User click on login button in the login page
And User wait for '2' seconds
 And User select the location in the home page using drop down
 And User select the Hotel Creek using drop down in the home page 
 And User Select the room type in the home page using drop down
 And User select the no of rooms type in the home page using drop down
 And User enter the today check in date in the homepage
 And User enter the tomorow check out date in the homepage
 And User select the adults room in the home page
 And User select no children room in the homepage
 And User click on search button
 Then User validate the hotel name  validation
 And User click on logout button
 
 @TC5
 Scenario: User verify whether Check-in date and Check Out date are being displayed in Select Hotel page according to the dates selected in search Hotel.
 When User enter the userName in the loginpage
And User enter the password in the loginpage
And User click on login button in the login page
And User wait for '2' seconds
 And User select the location in the home page using drop down
 And User select the Hotel Creek using drop down in the home page 
 And User Select the room type in the home page using drop down
 And User select the no of rooms type in the home page using drop down
 And User enter the crt today check in date in the homepage
 And User enter the crt tomorow check out date in the homepage
 And User select the adults room in the home page
 And User select no children room in the homepage
 And User click on search button
 Then User validate the check in date validation
 Then User Validate the check out date validation
 When User click on logout button
 
 @TC6
 Scenario Outline: User verify whether no. of rooms entry in Select Hotel page is same as the Number of rooms selected in search hotel page
 When User enter the userName in the loginpage
 And User enter the password in the loginpage
 And User click on login button in the login page
 And User wait for '2' seconds
 And User select the location in the home page using drop down
 And User select the Hotel Creek using drop down in the home page 
 And User Select the room type in the home page using drop down
 And User select the no of rooms type in the home page using drop down '<No Of Rooms>'
 And User enter the crt today check in date in the homepage
 And User enter the crt tomorow check out date in the homepage
 And User select the adults room in the home page
 And User select no children room in the homepage
 And User click on search button
 And User wait for '4' seconds
 Then User verify the no of rooms that reflected according to the no of rooms selected '<No Of Rooms>'
 When User click on logout button
 
 Examples:
 |No Of Rooms|
 |3|
 
 
 @TC7
 Scenario: To verify whether Room Type in Select Hotel page is same as Room type selected in search hotel page
 When User enter the userName in the loginpage
 And User enter the password in the loginpage
 And User click on login button in the login page
 And User wait for '2' seconds
 And User select the location in the home page using drop down
 And User select the Hotel Creek using drop down in the home page 
 And User Select the deluxe room type in the home page using drop down
 And User select the no of rooms type in the home page using drop down
 And User enter the crt today check in date in the homepage
 And User enter the crt tomorow check out date in the homepage
 And User select the adults room in the home page
 And User select no children room in the homepage
 And User click on search button
 And User wait for '4' seconds
 Then User verify the deluxe that reflected according to the room type in the hotel page 
 When User click on logout button
 
 @TC8
 Scenario Outline: User verify whether the total price (excl.GST) is calculated as “price per night * no. of nights* no of rooms”.
 When User enter the userName in the loginpage
 And User enter the password in the loginpage
 And User click on login button in the login page
 And User wait for '2' seconds
 And User select the location in the home page using drop down
 And User select the Hotel Creek using drop down in the home page 
 And User Select the room type in the home page using drop down
 And User select the no of rooms type in the home page using drop down '<No Of Rooms>'
 And User enter the crt today check in date in the homepage
 And User enter the crt tomorow check out date in the homepage
 And User select the adults room in the home page
 And User select no children room in the homepage
 And User click on search button
 And User wait for '4' seconds
 And User click the radio button in the hotel page
 And User click on continue button
 And User wait for '3' seconds 
 Then User Verify that totalprice excluding GST '<No Of Rooms>'
 When User click on logout button
 
 Examples:
 |No Of Rooms|
 |2|
 @TC9
 Scenario Outline: 
 When User enter the userName in the loginpage
 And User enter the password in the loginpage
 And User click on login button in the login page
 And User wait for '2' seconds
 And User select the location in the home page using drop down
 And User select the Hotel Creek using drop down in the home page 
 And User Select the room type in the home page using drop down
 And User select the no of rooms type in the home page using drop down '<No Of Rooms>'
 And User enter the crt today check in date in the homepage
 And User enter the crt tomorow check out date in the homepage
 And User select the adults room in the home page
 And User select no children room in the homepage
 And User click on search button
 And User wait for '4' seconds
 And User click the radio button in the hotel page
 And User click on continue button
 And User wait for '3' seconds 
 When User enter the first name
 And User enter the last name
 And User enter the billing address
 And User enter the credit card number
 And User select the credit card type using drop down
 And User select the credit card expiry month
 And User select the credit card expiry year
 And User enter the ccv number
 And User click on book now button
 And User wait for '3' seconds
And User click on book confirmation page logout button 
Examples:
|No Of Rooms|
|2|

 @TC10
 Scenario Outline: To check correct total price is being calculated as “price per night*no of days*no of rooms in Book a hotel page
 When User enter the userName in the loginpage
 And User enter the password in the loginpage
 And User click on login button in the login page
 And User wait for '2' seconds
 And User select the location in the home page using drop down
 And User select the Hotel Creek using drop down in the home page 
 And User Select the room type in the home page using drop down
 And User select the no of rooms type in the home page using drop down '<No Of Rooms>'
 And User enter the crt today check in date in the homepage
 And User enter the crt tomorow check out date in the homepage
 And User select the adults room in the home page
 And User select no children room in the homepage
 And User click on search button
 And User wait for '4' seconds
 And User click the radio button in the hotel page
 And User click on continue button
 And User wait for '3' seconds
 Then Verify that total-price is being calculated including GST '<No Of Rooms>'
 And User click on logout button
 
 Examples:
|No Of Rooms|
|2|
 @TC11 
 Scenario Outline: User check Hotel name, Location, room type, Total Day, price per night are same in Booking confirmation page as they were
selected in previous screen
 When User enter the userName in the loginpage
 And User enter the password in the loginpage
 And User click on login button in the login page
 And User wait for '2' seconds
 And User select the location in the home page using drop down '<Location>'
 And User select the Hotel using drop down in the home page '<Hotel Name>'
 And User Select the room type in the home page using drop down '<Room Type>'
 And User select the no of rooms type in the home page using drop down '<No Of Rooms>'
 And User enter the crt today check in date in the homepage
 And User enter the crt tomorow check out date in the homepage
 And User select the adults room in the home page
 And User select no children room in the homepage
 And User click on search button
 And User wait for '4' seconds
 And User click the radio button in the hotel page
 And User click on continue button
 And User wait for '3' seconds
 Then User Verify that total data are same in booking confirmation page '<No Of Days>' '<Price Per Night>' '<No Of Rooms>' '<Location>' '<Hotel Name>' '<Room Type>'
 And User click on logout button
 
 Examples:
|No Of Rooms|Location|Hotel Name   |Room Type |No Of Days|Price Per Night|
|2          |"Sydney"|"Hotel Creek"|"Standard"|1         |AUD $ 125      |

@TC12
Scenario Outline:To check correct Final billed price is Total Price + 10% Total price in Book a Hotel page
 When User enter the userName in the loginpage
 And User enter the password in the loginpage
 And User click on login button in the login page
 And User wait for '2' seconds
 And User select the location in the home page using drop down
 And User select the Hotel Creek using drop down in the home page 
 And User Select the room type in the home page using drop down
 And User select the no of rooms type in the home page using drop down '<No Of Rooms>'
 And User enter the crt today check in date in the homepage
 And User enter the crt tomorow check out date in the homepage
 And User select the adults room in the home page
 And User select no children room in the homepage
 And User click on search button
 And User wait for '4' seconds
 And User click the radio button in the hotel page
 And User click on continue button
 And User wait for '3' seconds
 Then User verify that total-price is being calculated as final price'<No Of Rooms>'
 And User click on logout button
 
 Examples:
|No Of Rooms|
|1| 
 
 @TC13
 Scenario Outline: To verify whether the data displayed is same as the selected data in Book hotel page
 When User enter the userName in the loginpage
 And User enter the password in the loginpage
 And User click on login button in the login page
 And User wait for '2' seconds
 And User select the location in the home page using drop down
 And User select the Hotel using drop down in the home page '<Hotel Name>'
 And User Select the room type in the home page using drop down '<Room Type>'
 And User select the no of rooms type in the home page using drop down '<No Of Rooms>'
 And User enter the crt today check in date in the homepage '<check in date>'
 And User enter the crt tomorow check out date in the homepage '<check out date>'
 And User select the adults room in the home page '<No of adults>'
 And User select no children room in the homepage  
 And User click on search button
 And User wait for '4' seconds
 And User click the radio button in the hotel page
 And User click on continue button
 And User wait for '3' seconds
 When User enter the first name
 And User enter the last name
 And User enter the billing address
 And User enter the credit card number
 And User select the credit card type using drop down
 And User select the credit card expiry month
 And User select the credit card expiry year
 And User enter the ccv number
 And User click on book now button
 And User wait for '3' seconds
 Then User Verify that total data are same in booking confirmation page '<No Of Rooms>' '<Hotel Name>' '<Room Type>' '<check in date>' '<check out date>' '<No of adults>' '<No of children>' 
 And User click on logout button
 
 Examples:
|No Of Rooms|check in date    |check out date|Hotel Name   |Room Type |No Of Days|No of adults|No of children|
|2          |"15/03/2019"     |"16/03/2019"  |"Hotel Creek"|"Standard"|1         | 1          | "No Children" |             |

 
 
 @TC14
 Scenario Outline: Verify Order number is generated in booking confirmation page
 When User enter the userName in the loginpage
 And User enter the password in the loginpage
 And User click on login button in the login page
 And User wait for '2' seconds
 And User select the location in the home page using drop down
 And User select the Hotel using drop down in the home page '<Hotel Name>'
 And User Select the room type in the home page using drop down '<Room Type>'
 And User select the no of rooms type in the home page using drop down '<No Of Rooms>'
 And User enter the crt today check in date in the homepage '<check in date>'
 And User enter the crt tomorow check out date in the homepage '<check out date>'
 And User select the adults room in the home page '<No of adults>'
 And User select no children room in the homepage  
 And User click on search button
 And User wait for '4' seconds
 And User click the radio button in the hotel page
 And User click on continue button
 And User wait for '3' seconds
 When User enter the first name
 And User enter the last name
 And User enter the billing address
 And User enter the credit card number
 And User select the credit card type using drop down
 And User select the credit card expiry month
 And User select the credit card expiry year
 And User enter the ccv number
 And User click on book now button
 And User wait for '3' seconds
 Then User confirm the order no is generated or not
 And User click on logout button
 
 Examples:
|No Of Rooms|check in date    |check out date|Hotel Name   |Room Type |No Of Days|No of adults|No of children|
|2          |"15/03/2019"     |"16/03/2019"  |"Hotel Creek"|"Standard"|1         | 1          | "No Children" |             |
 
 
 @TC16
 Scenario Outline: 
 
 