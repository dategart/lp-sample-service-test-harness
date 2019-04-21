package com.autodesk.lp.sample.it.functional.stepdef;

import com.autodesk.lp.sample.it.AbstractSpringBootBaseIT;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Contains the tests for all the Scenarios in a given feature file.
 *
 * Instance variables (such as message request and responses) will be modified by each step method such as the "given"
 * methods.
 *
 * @author David.Tegart
 */
public class HumsSomeGroupOfRequirementsStepDefinitions extends AbstractSpringBootBaseIT {

    private static final Logger log = LoggerFactory.getLogger(HumsSomeGroupOfRequirementsStepDefinitions.class);

    @BeforeClass()
    public static void setUpClass() throws Exception { }

    @AfterClass()
    public static void tearDownClass() throws Exception { }

    @Before()
    public static void before() throws Exception {}

    @After()
    public static void after() throws Exception {}
    
    @Given("^some condition \"([^\"]*)\"$")
    public void some_condition(String arg1) throws Throwable {
        // The condtion - whatever it is - is ensured here
    }

    @When("^A message is submitted$")
    public void a_message_is_submitted() throws Throwable {
        // The message is submitted here
    }

    @Then("^The translated target segment should be \"([^\"]*)\"$")
    public void the_translated_target_segment_should_be(String arg1) throws Throwable {
        // Run the asserts here to ensure the expectation has been met
    }

    @When("^the tracking id in the message is already been pass to the service$")
    public void the_tracking_id_in_the_message_is_already_been_pass_to_the_service() throws Throwable {
        // The piece of functionality we're interested in happens here
    }

    @Given("^the following translation types and languages:$")
    public void the_following_translation_types_and_languages(DataTable dt) throws Throwable {
        // Enforce the condition here, whatever it is
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        List<String> list = dt.asList(String.class);
    }

    @Given("^some other interesting condition$")
    public void some_other_interesting_condition() throws Throwable {
        // Enforce the condition here, whatever it is
    }

    @Then("^The translated target segment should be blank$")
    public void the_translated_target_segment_should_be_blank() throws Throwable {
        // Run the asserts here to ensure the expectation has been met
    }
}