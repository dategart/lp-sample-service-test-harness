package com.autodesk.lp.sample.util;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author David.Tegart
 */
public class SomeUtilitiesTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void someUtilityMethod() {
        assertEquals(42, SomeUtilities.someUtilityMethod("some input"));
    }
}