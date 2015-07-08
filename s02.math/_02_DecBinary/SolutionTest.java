package _02_DecBinary;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _02_DecBinary.Solution } */
    Solution solution;

    @Rule
    public Timeout globalTimeout = new Timeout(20);

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test1() {
        int A = 6;
        String actual = solution.findDigitsInBinary(A);
        String expected = "110";
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int A = 0;
        String actual = solution.findDigitsInBinary(A);
        String expected = "0";
        assertEquals(expected, actual);
    }


}
