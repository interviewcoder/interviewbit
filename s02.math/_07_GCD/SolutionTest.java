package _07_GCD;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _07_GCD.Solution } */
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
        int B = 9;
        int actual = solution.gcd(A, B);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int A = 6;
        int B = 36;
        int actual = solution.gcd(A, B);
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int A = 1;
        int B = 0;
        int actual = solution.gcd(A, B);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        int A = 0;
        int B = 10;
        int actual = solution.gcd(A, B);
        int expected = 10;
        assertEquals(expected, actual);
    }


}
