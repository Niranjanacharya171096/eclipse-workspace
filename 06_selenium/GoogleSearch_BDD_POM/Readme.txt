About the Framework 

This is a selenium cucumber BDD POM framework built using the build tool Maven and reporting tool as TESTNG.
POM is page object model is a design pattern where in the class files are arranged in pages format. For eg - Login Page, Home Page, Payment page etc.
BDD is the behavioural data driven framework in which  cucumber is used for development of the feature, step definition and Runner files.

Arrangement of folders

1.src/main/java - 

a) com.qa.pages - This package is for storing the pages details in POM format. each page contains the locators, constructors and methods for each pages.
b) com.qa.factory- This package is for storing the driver file which is the main file which will invoke the browsers and initialize the web driver.
c) com.qa.utilities - This package is for storing the Config reader file , constants files.

2. src/test/java 

a) Parallel - This is to store the step definitions and Application hook files. Application hook will decide the order in which the execution takes place.
   Step definitions is the place where the selenium code is written to run the corresponding feature files.

b? Runner - This is the runner file to be used to non in non parallel mode.

3. src/test/resources

a) Config - Config.properties - Place to store the browser details
b) Parallel - THis is to store the feature files in parallel mode .
c) cucumber.propertied - this is used to set the cucumber related properties.

4. JRE - Java Runtime Environment details are stored here.

5.Maven dependencies - all the jar files downlaaded from the maven repository are stored here.

6. test- output - testNG reports are stores here

7.pom.xml - Place to store all the dependencies for the project using maven as the build tool.

     


            
