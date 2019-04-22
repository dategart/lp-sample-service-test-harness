package com.autodesk.lp.sample.it;

import com.autodesk.lp.sample.Application;
import org.junit.*;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.testcontainers.containers.PostgreSQLContainer;

/**
 * The base class of all IT tests.
 *
 * In the case of cucumber tests it is mainly responsible for loading the application context
 *
 * Useful resources can be added here so they can be used by sub-classes
 *
 * @author David.Tegart
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@ContextConfiguration
@DirtiesContext // Will reload the application context for each test
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE) // We're not using the default embedded db
public abstract class AbstractSpringBootBaseIT {

    private static final Logger log = LoggerFactory.getLogger(AbstractSpringBootBaseIT.class);

    @ClassRule
    public static PostgreSQLContainer postgresContainer = LpITHarnessPostgresqlContainer.getInstance();

    @Autowired
    ApplicationContext applicationContext;

//    @Autowired
//    TestRestTemplate restTemplate;

    @BeforeClass()
    public static void setUpClass() throws Exception {}

    @AfterClass()
    public static void tearDownClass() throws Exception {}

    @Before
    public void setUp() throws Exception {}

    @After
    public void tearDown() throws Exception {}
}