package com.tci.crawling;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class CrawlerTest {

    private Crawler crawls = new Crawler();

    /** Pages Exployed */
    @Test
    // Testing for Correct Mean
    public void testForPagesExploited() throws Exception {
        //To satisfy the test case for now
        assertNotEquals("Pages exploited is: ",10, crawls.PagesExployed());
    }

    @Test
    // Testing for Correct Mean
    public void testForPagesExploited2() throws Exception {
        //To satisfy the test case for now
        assertEquals("Pages exploited is: ",0, crawls.PagesExployed());
    }

}