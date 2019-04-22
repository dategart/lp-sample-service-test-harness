# Sample of how to integrate cucumber/gherkins tests in Spring Boot tests.

CucumberRunnerIT is the test class which configures Cucumber, allowing it to find the feature files and the corresponding step definition class files, namely HumsValidationStepDefinitions and HumsSomeGroupOfRequirementsStepDefinitions.

The tests don't do anything at present but ultimately they would run tests against the entry points into the application, REST endpoints, input & output queues etc.

Note that all integration tests live under the com.autodesk.lp.sample.it package. Although cucumber tests are best called "acceptance tests", as the Maven plugin failsafe uses the term integration throughout, that's what is used here.

The feature files live at: src\test\resources\features\*. They are only examples ... some may not even make sense. But they should demonstrate the basic idea: simple statements of the applications requirements which connect to actually testing code (i.e. CucumberRunnerIT, HumsValidationStepDefinitions and HumsSomeGroupOfRequirementsStepDefinitions)

The class LpITHarnessPostgresqlContainer provides a single TestContainer Postgres database for all tests. A similar TestContainer RabbitMQ can be provided, something which I'll do later.

TODO: create a TestContainer RabbitMQ, publish/consume simple messages and run asserts against them.

## Some commands

To run only unit tests

```
mvnw test
```

To run only unit test and integration tests

```
mvnw verify
```

Skips all tests - unit & integration 

```
mvnw clean install -DskipTests
```

Skip all the integration tests (only run unit tests):

```
mvnw clean install -DskipITs
```

Run a single integration test:

```
mvnw -Dit.test=NameOfTest4IT verify
```

This will run IT tests but skip unit tests

```
mvnw verify -Dskip.surefire.tests
```