# Rabobank Transactions Intake Test

This project is meant to get some impression of code-style and understanding of both java and cucumber for applicants
wanting to join Rabo's group of technical testers.

Are you an applicant? Nice! Have fun on this and don't hesitate to show off your skills :-).

The source-code you are looking at is a small setup of 2 cucumber scenarios that try to test the Rabobank website. We have
only added a small feature that does some testing, and expect you to alter the code and introduce more features by
walking through the exercises listed in this readme.

## Getting Started
You need to have installed:

* [Maven](https://maven.apache.org/) - Dependency Management
* [IntelliJ](https://www.jetbrains.com/idea/download/) - IDE
* [Java 8](http://www.oracle.com/technetwork/pt/java/javase/downloads/jdk8-downloads-2133151.html) - JDK
* [Chrome](https://www.google.com/intl/nl_ALL/chrome/) - Browser

```
Open the POM.xml as a project in IntelliJ
Within the src/test -> resources folder you will find the cucumber feature SearchFunctionality.feature
Right click the feature and select Run
Or right click the individual scenario's and select Run
```

## Exercises



### Exercise 1

```
The team has picked up a userstory to implement a 'Contact Us' section on the Rabobank.nl website.
In the user story we have the requirement that for each customer type (Particulieren, Private Banking, Bedrijven) we have a different Contact Us section
The code has been deployed but the automated regression tests are not yet done

Add a new feature file to the project. In this feature, write the scenario('s) that will cover this requirement and 
then automate this. Don't hesitate to show off your java (8?) skills!
```

### Exercise 2

```
A new deployment of the front-end code has broken the tests

Fix the 2 cucumber scenario's you find in SearchFunctionality.feature
Keep the code clean
Remember the Boy Scout Rule ("Always leave the campground cleaner than you found it.")
```


## Questions
Apart from the exercises, we have some questions. Please either type your answer in this readme, or include them in the
email you send us back.

### Question 1

```
There's a link called 'Klant worden' in the 6th column of the footer. What is the CSS selector that you would use to
click on this link?
```

Answer:



### Question 2

```
Can you think of a way to be less dependent on CSS id's and classes, and still have a good testable HTML structure?
Please elaborate in your answer.
```

Answer:




## Done?
When done, zip the entire project and send in via email to the contact you have at the Rabobank.

Good luck!