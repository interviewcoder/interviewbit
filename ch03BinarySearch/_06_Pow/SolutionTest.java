package _06_Pow;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _06_Pow.Solution } */
    Solution solution;

    @Rule
    public Timeout globalTimeout = new Timeout(500);

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
        int A = 5;
        int B = 55;
        int C = 221;
        int actual = solution.pow(A, B, C);
        int expected = 112;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int A = 0;
        int B = 0;
        int C = 1;
        int actual = solution.pow(A, B, C);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int A = -1;
        int B = 1;
        int C = 20;
        int actual = solution.pow(A, B, C);
        int expected = 19;
        assertEquals(expected, actual);
    }

    @Test public void Test4() {
        int A = 79161127;
        int B = 99046373;
        int C = 57263970;
        int actual = solution.pow(A, B, C);
        int expected = 47168647;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        int A = 71045970;
        int B = 41535484;
        int C = 64735492;
        int actual = solution.pow(A, B, C);
        int expected = 20805472;
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        int A = 0;
        int B = 0;
        int C = 2;
        int actual = solution.pow(A, B, C);
        int expected = 0;
        assertEquals(expected, actual);
    }

}
