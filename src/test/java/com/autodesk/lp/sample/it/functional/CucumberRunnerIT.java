package com.autodesk.lp.sample.it.functional;

import com.autodesk.lp.sample.it.AbstractSpringBootBaseIT;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The cucumber runner which acts as the test class. It defines where to find the feature files and the corresponding
 * step definition classes.
 *
 * @author David.Tegart
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {
                "com.autodesk.lp.sample.it.functional.stepdef"
        },
        features = "src/test/resources/features",
        plugin = {
                "pretty", "html:target/cucumber", "junit:target/junit-report.xml"
        })
public class CucumberRunnerIT extends AbstractSpringBootBaseIT {

    private static final Logger log = LoggerFactory.getLogger(CucumberRunnerIT.class);

    @BeforeClass()
    public static void setUpClass() throws Exception {}

    @AfterClass()
    public static void tearDownClass() throws Exception {}

    @Before()
    public static void before() throws Exception {}

    @After()
    public static void after() throws Exception {}
}