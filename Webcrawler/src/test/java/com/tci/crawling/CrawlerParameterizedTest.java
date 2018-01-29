package com.tci.crawling;


import junitparams.JUnitParamsRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
@SuppressWarnings("deprecation") // Because we using depreciated
public class CrawlerParameterizedTest {

    //    @Parameterized.Parameters
//    public static Object[] getURL() {
//       return $(
//               $("http://localhost/WebCrawler/Webcrawler/src/main/webapp/sample_site_to_crawl/")
//       );
//    }
    //Crawler crawler;
    String expectedURL = "http://localhost/WebCrawler/Webcrawler/src/main/webapp/sample_site_to_crawl/\"";


    private static final Object[] getURL() {
        return $(
                $("http://localhost/WebCrawler/Webcrawler/src/main/webapp/sample_site_to_crawl/\"")
        );
    }

    /** Testing for Parameterized constructors*/
    @Test
     @Parameterized.Parameters
    public void constructorShouldGetURL() throws Exception {
        Crawler crawler = new Crawler("http://localhost/WebCrawler/Webcrawler/src/main/webapp/sample_site_to_crawl/\"");
        assertEquals(expectedURL, crawler.getURL());
    }
}
