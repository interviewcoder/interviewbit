package _03_MaxOne;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {

    /** Test method for {@link _03_MaxOne.Solution } */
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
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 1, 0, 1, 1, 0,
                0, 1, 1, 1));
        int b = 1;
        ArrayList<Integer> actual = solution.maxone(a, b);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(0, 1, 2, 3,
                4));
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 1, 0, 1, 1, 0,
                0, 1, 1, 1));
        int b = 2;
        ArrayList<Integer> actual = solution.maxone(a, b);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(3, 4, 5, 6,
                7, 8, 9));
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 1, 0, 1, 1, 0,
                0, 1, 1, 1));
        int b = 3;
        ArrayList<Integer> actual = solution.maxone(a, b);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(0, 1, 2, 3,
                4, 5, 6, 7, 8, 9));
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1, 0,
                0, 1, 1, 1));
        int b = 0;
        ArrayList<Integer> actual = solution.maxone(a, b);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(0, 1, 2, 3,
                4));
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList());
        int b = 0;
        ArrayList<Integer> actual = solution.maxone(a, b);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList());
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(0));
        int b = 1;
        ArrayList<Integer> actual = solution.maxone(a, b);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(0));
        assertEquals(expected, actual);
    }

    @Test
    public void Test7() {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(0));
        int b = 0;
        ArrayList<Integer> actual = solution.maxone(a, b);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList());
        assertEquals(expected, actual);
    }

    @Test
    public void Test8() {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 0, 0, 0, 0, 0,
                1, 0, 1, 1));
        int b = 2;
        ArrayList<Integer> actual = solution.maxone(a, b);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(5, 6, 7, 8,
                9));
        assertEquals(expected, actual);
    }

    @Test
    public void Test9() {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 0, 1, 0, 1, 1,
                1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0));
        int b = 4;
        ArrayList<Integer> actual = solution.maxone(a, b);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(4, 5, 6, 7,
                8, 9, 10, 11, 12, 13, 14, 15));
        assertEquals(expected, actual);
    }

    @Test
    public void Test10() {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(0, 0, 0, 0));
        int b = 0;
        ArrayList<Integer> actual = solution.maxone(a, b);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList());
        assertEquals(expected, actual);
    }

    @Test
    public void Test11() {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(0, 1, 1, 0, 1, 0));
        int b = 0;
        ArrayList<Integer> actual = solution.maxone(a, b);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2));
        assertEquals(expected, actual);
    }

}
