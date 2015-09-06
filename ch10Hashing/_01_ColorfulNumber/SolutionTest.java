package _01_ColorfulNumber;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _01_ColorfulNumber.Solution } */
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
        int a = 23;
        int actual = solution.colorful(a);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int a = 3245;
        int actual = solution.colorful(a);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int a = 22;
        int actual = solution.colorful(a);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        int a = 3426;
        int actual = solution.colorful(a);
        int expected = 0;
        assertEquals(expected, actual);
    }

}
