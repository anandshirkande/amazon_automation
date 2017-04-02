# Anand_Workspace_BuildIT_Tutorial
Tutorial for weather forcast app


Important Notes:
- I was not able to enter city name for weather forecast app. Whenever I was launching/runnng application it was launching report 
  for Glasgow city.
- I have assumed it as start point


Prerequisite :
- You should have node and npm installed
- It is expected that you have downloaded weather forcast application code and executed below two commands
   $ npm install
   $ npm run develop
   
Technology Stack :
  -Selenium Webdriver
  -Java
  -Cucumber
  -TestNG
  -Maven
  -Extent Report for Cucumber
 
  
Features:
There are two feature files at path src/test/resources/features/
   - Verify_Default_Valus.feature
   - Verify Weather_Forecast_Report.feature  
I have used scenario outline and provided different tags to scenarios.

Runner Class:
Feature file and corresponding step definition class's locations are mentioned in runner class.
Reporting plagin is provided in cucumber options.
We can provide different tags in runner class in cucumber options. Scenarios tagged with those tags will be executed.

Page Objects:
There are three different classes in this package.

Hourly_Forecast.java:
This class contains locators for all elements displyed in row for hourly weather report like time, direction, railfall, maximum & minimum
temperature for that hour etc.
Constructor for this class received webdriver and day number and child number/hourly report number. Based on day number and child number all 
unique data set properties are fetched from property file. Accordingly all instance varibales are initialised and web elements created.

Daily_Forcast.java:
This class contains locators for all elements displayed in row for daily weather report like day, date, maximum & temperature during 
day etc.
This class also contains eight objects for Hourly_Forecast.java class. Each object corresponds to each hourly report(We have 24 hours in day,
There will be separate child row for each three hour's report. So we will have eight child reports for each day).
Constructor for this class received webdriver and day number.Based on day number all unique data set properties are fetched from 
property file. Accordingly all instance varibales are initialised and web elements created.

Home_Page.java:
This class contains five objects of class Daily_Forcast.java.
This application is supposed to display weather forecast for five days i.e. why we have five objects of Daily_Forecast.java class.

So basically we have Home_Page.java class which contains five objects for Daily_Forecast.java class.
Each objects of Daily_Forecast.java class will hold eight objects of Hourly_Forecast.java class.

Step Definitions(glue):
All step definition methods are written in classes included in glue folder.
Step definitions are divided into multiple classes to have better clarity.
Each Step definition class extends ParentScenario class. ParentScenario class has before_setup and after_setup methods. ParentScenario class also 
create object for Home_Page.java class. This object is used to call different methods in step definitions.

Utils:
Utils.java class have all basic functions like click, verify element displayed, wait etc.



How to run :

I have not implemented continous integration at this stage.
You can download this repository. You can run tests from runner class by right clicking on runner class and selecting run option
or from command line using command 'mvn test'.

Report:-
You can see report in  'target/Automation_reports/Automation_Report.html'. Please open this html file in browser.


Branch Implementing_Page_Factory Notes:
If you want to see page factory pattern implementation then check for branch 'Implementing_Page_Factory'. I have implemented 
page factory pattern in class Home_Page.java. 
In other two classes I am fetching property file values in locators at runtime. So I can not use page factory in Daily_Forecast.java and Hourly_Forecast.java classes.





   
   
