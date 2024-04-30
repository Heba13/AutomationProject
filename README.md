# Mobile Automation Project

# Overview
This project aims to automate the testing of mobile applications using Java, Selenium WebDriver, Cucumber and Appium. using Behavior-Driven Development (BDD) methodology By leveraging these technologies, we can create automated test scripts to verify the functionality and behavior of mobile applications across different platforms and devices.

# Prerequisites
Before running the automated tests, ensure that the following prerequisites are met:

Install Java Development Kit (JDK). You can download JDK from Oracle's website.
Set up Java environment variables (JAVA_HOME and PATH) on your system.
Install Maven. You can download Maven from Apache Maven's website.
Install an Integrated Development Environment (IDE) such as IntelliJ IDEA or Eclipse for Java development.
Download and install Appium Server. You can download Appium from Appium's website.
Install Android SDK and configure Android Virtual Device (AVD) or connect a physical Android device for testing.
Install necessary dependencies in your project's pom.xml file, including Selenium WebDriver, Cucumber, and Appium Java client.
Getting Started
To get started with running the automated tests, follow these steps:

Clone this repository to your local machine:
bash
Copy code
git clone https://github.com/Heba13/Mobile-App-AutomationProject
Set capabilities for the target 
# Project structure

-src/test/java/Sample/tests :  contains tests and it's implementation 
-src/test/java/Sample/utilities : contains report classes 
-src/test/java/Sample/tests/BaseTest.java  : contains Configure test environment settings such as device capabilities, URLs, and other configurations .
-pom.xml: Maven project configuration file specifying dependencies and build settings.
# Steps
- Start the Appium Server.
- Run the automated tests from TestNG file 
- Monitor the test execution in the console. Upon completion, a detailed test report will be generated in "reports"