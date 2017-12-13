package com.tci.crawling;

import static junit.framework.TestCase.assertEquals;
import org.junit.Test;

public class CrawlerTest {

    private Crawler crawls = new Crawler();

    /** Pages Exployed */
    @Test
    // Testing for Correct Mean
    public void testForPagesExploited() throws Exception {
        assertEquals("Pages exploited is: ",0, crawls.PagesExployed());
    }

}