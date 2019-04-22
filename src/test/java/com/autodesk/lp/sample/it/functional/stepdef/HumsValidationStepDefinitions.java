package com.autodesk.lp.sample.it.functional.stepdef;

import com.autodesk.lp.sample.it.AbstractSpringBootBaseIT;
import com.autodesk.lp.sample.it.functional.CucumberRunnerIT;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * The base class of all IT tests.
 *
 * In the case of cucumber tests it is mainly responsible for loading the application context
 *
 * Useful resources can be added here so they can be used by sub-classes
 *
 * @author David.Tegart
 */
public class HumsValidationStepDefinitions extends AbstractSpringBootBaseIT {

    private static final Logger log = LoggerFactory.getLogger(HumsValidationStepDefinitions.class);

    @BeforeClass()
    public static void setUpClass() throws Exception {}

    @AfterClass()
    public static void tearDownClass() throws Exception {}

    @Before()
    public static void before() throws Exception {}

    @After()
    public static void after() throws Exception {}

    @cucumber.api.java.Before()
    public static void cucumberBefore() throws Exception {}

    @cucumber.api.java.After()
    public static void cucumberAfter() throws Exception {}

    @When("^the message contains no vendor data$")
    public void the_message_contains_no_vendor_data() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^the server responses with a negative acknowledgement$")
    public void the_server_responses_with_a_negative_acknowledgement() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^the message contains vendor which has no match$")
    public void the_message_contains_vendor_which_has_no_match() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }
}