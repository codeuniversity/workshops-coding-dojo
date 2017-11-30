# Coding Dojo 2017-11-30
For the first Dojo we solved the FizzBuzz Kata in Java. We did this in a test-driven manner and used Baby Steps to cover several aspects if how to think about code this way and how it will improve over time. Everyone had to code a bit and the final result is available on this repository branch.

## Setup your environment for rerun
For this Dojo an IDE project setup was given beforehand, so we could start asap. However, one may want to rerun the stuff we did in this Dojo, so you need to setup some things on your machine.

### Maven
The project uses the Maven dependency management system, so you have to install it to be available from your command line. You will find a `pom.xml` in the sources which contains all the dependencies required to run the tests. Once you've finished installation of Maven you have to process this file to load and link all the required libraries. After then you should be able to run `mvn test` in the repo's directory and the test should be executed.

### IntelliJ
Because we worked with IntelliJ (Ultimate) IDE there is also an `.iml` file for the project. When you want to use the IntelliJ for it, too, you simple have to open the repo's directory in the IDE and all should be set up. Maybe there are some plugins missing you need to get integrated Maven support, then you should check out how to install them and then you can run the tests from within the IDE.
