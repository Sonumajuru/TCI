package com.tci.crawling;

import org.junit.Test;
import java.util.List;
import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

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
        assertEquals("The resulting mean value is now correct for the value",9.5, basicStatistic.getMean(numList));
    }

}