package _04_DiffK;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {

    /** Test method for {@link _04_DiffK.Solution } */
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
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 3, 5));
        int b = 4;
        int actual = solution.diffPossible(a, b);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 3, 4));
        int b = 4;
        int actual = solution.diffPossible(a, b);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 3, 5, 6));
        int b = 3;
        int actual = solution.diffPossible(a, b);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));
        int b = 0;
        int actual = solution.diffPossible(a, b);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(0, 1, 9, 10, 13,
                17, 17, 17, 23, 25, 29, 30, 37, 38, 39, 39, 40, 41, 42, 60, 64,
                70, 70, 70, 72, 75, 85, 85, 90, 91, 91, 93, 95));
        int b = 83;
        int actual = solution.diffPossible(a, b);
        int expected = 1;
        assertEquals(expected, actual);
    }

}
