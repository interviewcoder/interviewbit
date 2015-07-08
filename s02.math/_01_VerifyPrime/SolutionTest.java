package _01_VerifyPrime;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _01_VerifyPrime.Solution } */
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
        int A = 84923;
        int actual = solution.isPrime(A);
        assertEquals(0, actual);
    }

    @Test
    public void Test2() {
        int A = 36;
        int actual = solution.isPrime(A);
        assertEquals(0, actual);
    }

    @Test
    public void Test3() {
        int A = 11;
        int actual = solution.isPrime(A);
        assertEquals(1, actual);
    }

    @Test
    public void Test4() {
        int A = 29;
        int actual = solution.isPrime(A);
        assertEquals(1, actual);
    }

}
