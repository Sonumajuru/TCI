package com.tci.crawling;

/** This test class will test for Test Double cases i.e the Mockito Tests */

import org.json.simple.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.*;

/** This test class will test for Test Double cases i.e the Mockito Tests */
@RunWith(MockitoJUnitRunner.class)
public class MockitoTest {

    private List<String> authors = new ArrayList<>();

    @Mock
    private Crawler crawls = new Crawler("http://localhost:9000/sample_site_to_crawl/");
    @Mock
    private Music spyMusic;
    @Mock
    private Music music;

    /** Variable declaration for Music class to be used */
    private static final String name = "Beethoven: Complete Symphonies";
    private static final String genre = "Classical";
    private static final String format = "CD";
    private static final int year = 2012;
    private static final String artistName = "Ludwig van Beethoven";

    /** Testing for Dummy Object */
    @Test
    public void shouldAllowToRetrieve_aSearchForAParticularBook() {
        String name = "Clean Code: A Handbook of Agile Software Craftsmanship";
        String genre = "Tech"; String format = "Ebook";
        int year = 2008;
        authors.add("Robert C. Martin");
        String publisher = "Prentice Hall"; String ISBN = "978-0132350884";
        Book book = new Book(name,genre,format,year,authors,publisher,ISBN);

        JSONObject jsonObj1 = crawls.searchBookAlgorithmWithWordDFS(book, "Clean Code: A Handbook of Agile Software Craftsmanship");
        JSONObject jsonObj2 = crawls.searchBookAlgorithmWithWordDFS(book, "Clean Code: A Handbook of Agile Software Craftsmanship");
        assertSame("objects are same", jsonObj1, jsonObj2);
    }

    /** Testing for Stubs */
    @Test
    public void shouldConnectToJsoup() {
        /*Arrange*/
         /*Act*/
        boolean result = crawls.isConnection();
        /*Assert*/
        assertTrue("Connection Successful ", result);
    }

    /** Testing for Spy */
    @Before
    public void buildSpy(){
        music = new Music(name,genre,format,year,artistName);
    }

    /** Testing to verify if the Spy annotation can be used to call the real objects
     * As seen below the spyMusic is used to call the getArtist in the music class to get the
     * Artist name but method returns false cause initially the artist name is set to final Beethoven but
     * changed to Mozart results into passed test since names of artist are different
     * The methods getArtist and so on are the Retrieval Interface used to
     * access the actual arguments of the call to the Music Class.*/
    @Test
    public void verifySpyEffectOfRealInstanceOfGetMusicArtistName(){

        //   Test Double setup
        String _name = "Beethoven: Complete Symphonies";
        String _genre = "Classical";
        String _format = "CD";
        int _year = 2012;
        String _artistName = "Mozart";
        // exercise
        spyMusic = new Music(_name,_genre,_format,_year,_artistName);

        //verify(spyMusic).getArtist();
        // verify
        assertFalse(music.getArtist().equals(spyMusic.getArtist()));
    }

    /** Testing for Mocks */

    /** Testing to verify if the mock returns a music object.
     * the test case creates a mock class and calls the method getArtist.
     * It enforces the method to use _artistName as it’s return.
     * This is then tested via an assertEquals method as shown.
     * */
    @Test
    public void verifyMockitoForGetMusicArtistName() {
        // create mock
        Music mockito = mock(Music.class);

        // define return value for method getArtist()
       when(mockito.getArtist()).thenReturn(artistName);

        //3. use mock in test..
        assertEquals(mockito.getArtist(), "Ludwig van Beethoven");
    }


    /** Testing to verify if the mock returns a music object.
     * the test case creates a mock class and calls the method getArtist.
     * It enforces the method to use _artistName as it’s return.
     * This is then tested via an verify method as shown.
     * */
    @Test
    public void verifyGetArtistMockitoCall() {
        // create and configure mock
        Music mockito = Mockito.mock(Music.class);

        when(mockito.getArtist()).thenReturn(artistName);

        // call method getArtist on the mock to obtain parameter value
        mockito.getArtist();

        // now check if method getArtist was called
      verify(mockito, atLeastOnce()).getArtist();
    }

}
