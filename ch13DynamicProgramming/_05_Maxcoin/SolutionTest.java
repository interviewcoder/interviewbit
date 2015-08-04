package _05_Maxcoin;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _05_Maxcoin.Solution } */
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
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        int actual = solution.maxcoin(a);
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(10, 20));
        int actual = solution.maxcoin(a);
        int expected = 20;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(4));
        int actual = solution.maxcoin(a);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList());
        int actual = solution.maxcoin(a);
        int expected = 0;
        assertEquals(expected, actual);
    }

}
