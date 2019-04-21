package com.autodesk.lp.sample.it;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testcontainers.containers.PostgreSQLContainer;

/**
 * Provides a singleton postgres container, which can be reused by all integration tests.
 *
 * This singleton avoids the performance cost of creation the database for each test.
 *
 * @author David.Tegart
 */
public class LpITHarnessPostgresqlContainer extends PostgreSQLContainer<LpITHarnessPostgresqlContainer> {

    private static final Logger log = LoggerFactory.getLogger(LpITHarnessPostgresqlContainer.class);

    private static final String IMAGE_VERSION = "postgres:11.1"; // This could be made configurable

    private static LpITHarnessPostgresqlContainer container;

    private LpITHarnessPostgresqlContainer() {
        super(IMAGE_VERSION);
    }

    public static LpITHarnessPostgresqlContainer getInstance() {

        if (container == null) {
            container = new LpITHarnessPostgresqlContainer();
        }
        return container;
    }

    @Override
    public void start() {
        super.start();

        // The url (esp the port) are randomly assigned by testcontainer. These should ne read into env variables and reused
        // wherever necessary such as spring's application.properties file

        System.setProperty("DB_URL", container.getJdbcUrl());
        System.setProperty("DB_USERNAME", container.getUsername());
        System.setProperty("DB_PASSWORD", container.getPassword());
    }

    @Override
    public void stop() {
        // Let JVM handle the shut down
    }
}