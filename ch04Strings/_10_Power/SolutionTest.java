package _10_Power;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _10_Power.Solution } */
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
        String A = "128";
        int actual = solution.power(A);
        assertEquals(1, actual);
    }

    @Test
    public void Test2() {
        String A = "127";
        int actual = solution.power(A);
        assertEquals(0, actual);
    }

}
