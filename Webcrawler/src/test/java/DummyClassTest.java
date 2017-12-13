import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class DummyClassTest {

    public DummyClass basicStatistic = new DummyClass();
    public List<Double> numList = new ArrayList<Double>();
    public List<Integer> numLists = new ArrayList<Integer>();

    public void addToList(){
        for (double i = 0; i < 20; i++) {
            numList.add(i);
        }
    }

    /** Mean */
    @Test
    // Testing for Correct Mean
    public void testToCalculateTheMean() throws Exception {
        addToList();
//      Assert.assertEquals(17, basicStatistic.getMean(numList));
        assertEquals("The resulting mean value is now correct for the value",9.5, basicStatistic.getMean(numList));
    }

}