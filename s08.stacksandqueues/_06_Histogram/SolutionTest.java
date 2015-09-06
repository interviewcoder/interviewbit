package _06_Histogram;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    /** Test method for {@link _06_Histogram.Solution } */
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
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(90, 58, 69, 70, 82, 100, 13, 57, 47, 18));
        int actual = solution.largestRectangleArea(A);
        int expected = 348;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1));
        int actual = solution.largestRectangleArea(A);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 3));
        int actual = solution.largestRectangleArea(A);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(3, 2, 1));
        int actual = solution.largestRectangleArea(A);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(2, 1, 5, 6, 2, 3));
        int actual = solution.largestRectangleArea(A);
        int expected = 10;
        assertEquals(expected, actual);
    }

}
