package com.tci.crawling;

import org.junit.Test;
import java.util.List;
import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class DummyClassTest {

    private DummyClass basicStatistic = new DummyClass();
    private List<Double> numList = new ArrayList<Double>();

    private void addToList(){
        for (double i = 0; i < 20; i++) {
            numList.add(i);
        }
    }

    /** Mean */
    @Test
    // Testing for Correct Mean
    public void testToCalculateTheMean() throws Exception {
        addToList();
        assertTrue(true);
        assertEquals("The resulting mean value is now correct for the value",9.5, basicStatistic.getMean(numList));
    }

    /** Mean */
    @Test
    // Testing for Incorrect Mean
    public void testInvalidCalculateTheMean() throws Exception {
        addToList();
        assertNotEquals("The resulting mean value is now correct for the value",10.5, basicStatistic.getMean(numList));
    }

}