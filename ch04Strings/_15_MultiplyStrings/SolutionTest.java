package _15_MultiplyStrings;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _15_MultiplyStrings.Solution } */
    Solution solution;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

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
        String A = "13";
        String B = "12";
        String actual = solution.multiply(A, B);
        String expected = "156";
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        String A = "99";
        String B = "99";
        String actual = solution.multiply(A, B);
        String expected = "9801";
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        String A = "99999";
        String B = "99999";
        String actual = solution.multiply(A, B);
        String expected = "9999800001";
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        String A = "31243242535342";
        String B = "0";
        String actual = solution.multiply(A, B);
        String expected = "0";
        assertEquals(expected, actual);
    }

}
