# JUnit

## What is JUnit ?
## JUnit overview
## How to write unit test ?
## JUnit best practice
## BeforeEach and BeforaAll examplee 


# JUnit Overview:
JUnit provides a set of annotations, assertions, and test runners that facilitate the creation and execution of unit tests. Some key components of JUnit include:

* ***Annotations:***
 JUnit uses annotations to mark methods as test cases or to perform setup and teardown operations. The most commonly used annotations include *@Test, @BeforeEach, @AfterEach, @BeforeAll, and @AfterAll.*

* ***Assertions:*** JUnit provides a set of assertion methods to validate expected results. These assertions help you make assertions about the behavior and output of your code. Some commonly used assertion methods include *assertEquals(), assertTrue(), assertFalse(), assertNull(), assertNotNull(), etc.***

* ***Test Runners:*** JUnit test runners are responsible for executing the tests and generating test reports. JUnit provides several test runners, including the default runner ***JUnitCore*** and other runners like *Parameterized, Suite, and Categories.*

# How to Write Unit Tests?

To write unit tests using JUnit, follow these steps:
* Add JUnit *Dependency:* Include the JUnit dependency in your project's build file. For example, if you're using Maven, add the JUnit dependency to your ***pom.xml file***.

* Create Test Class: Create a new Java class and annotate it with ***@RunWith(JUnit4.class)*** to specify the test runner. This is optional for JUnit 4, as it uses the default runner by default. In JUnit 5, you can use the ***@ExtendWith annotation instead*.

* Write Test Methods: Create test methods and annotate them with ***@Test***. These methods should contain the actual test logic. Use assertion methods like *assertEquals()* to verify expected outcomes.

* Use Setup and Teardown Methods: Use ***@BeforeEach and @AfterEach*** annotations to define methods that run before and after each test method. These methods are useful for setting up preconditions and cleaning up resources.

* Run the Tests: Run the test class using your IDE's test runner or build tools. JUnit will execute the test methods and provide test reports indicating whether the tests passed or failed.

# JUnit Best Practices:
Here are some best practices to consider when using JUnit:

* Test Isolation: Ensure that each test method is independent and does not rely on the state of other tests or external dependencies. This allows for reliable and repeatable test results.

* Descriptive Test Names: Use descriptive names for your test methods to clearly convey their purpose. A good test name should indicate what is being tested and the expected outcome.

* Small Test Cases: Write ***small***, focused test cases that cover specific behavior or functionality. This makes it easier to identify and fix issues when tests fail.

* Use Setup and Teardown: Utilize ***@BeforeEach and @AfterEach methods*** to set up initial conditions and clean up resources before and after each test. This ensures a consistent test environment.

* Use Assertions Effectively: Make use of the various assertion methods provided by JUnit to validate expected outcomes. Choose the appropriate assertion method based on the type of condition you are testing.

# @BeforeEach and @BeforeAll Examples:

The ***@BeforeEach and @BeforeAll annotations*** in JUnit are used to perform setup operations before running test methods. Here's an example of how they can be used:

```java
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MyTestClass {

    @BeforeAll
    public static void setUpBeforeAllTests() {
        // Perform setup operations that need to be done once before all tests
        System.out.println("Before All Tests");
    }

    @BeforeEach
    public void setUpBeforeEachTest() {
        // Perform setup operations that need to be done before each test
        System.out.println("Before Each Test");
    }

    @Test
    public void testMethod1() {
        // Test method 1
        System.out.println("Test Method 1");
    }

    @Test
    public void testMethod2() {
        // Test method 2
        System.out.println("Test Method 2");
    }

}
```
In the above example, the ***setUpBeforeAllTests() method*** is annotated with ***@BeforeAll***, indicating that it should run once before all test methods in the class. ### The 

* setUpBeforeEachTest() method is annotated with
*  @BeforeEach, indicating that it should run before each test method.

When you run this test class, you will see the following output:

```java 
Before All Tests
Before Each Test
Test Method 1
Before Each Test
Test Method 2
```

The "Before All Tests" message is printed only once before any test methods are executed. The "Before Each Test" message is printed before each test method is executed.

# Note that *@BeforeAll methods must be static*, as they are executed before the instance of the test class is created. @BeforeEach methods *can be non-static* and can access# # instance variables of the test class.
