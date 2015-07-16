package _12_PlusOne;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {

    /** Test method for {@link _12_PlusOne.Solution } */
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
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> actual = solution.plusOne(A);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 4));
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(0, 0, 1, 2, 3));
        ArrayList<Integer> actual = solution.plusOne(A);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 4));
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 9));
        ArrayList<Integer> actual = solution.plusOne(A);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 3, 0));
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(9, 9, 9));
        ArrayList<Integer> actual = solution.plusOne(A);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 0, 0, 0));
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(0, 0, 1, 9, 9));
        ArrayList<Integer> actual = solution.plusOne(A);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2, 0, 0));
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(0, 0, 9, 9, 9));
        ArrayList<Integer> actual = solution.plusOne(A);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 0, 0, 0));
        assertEquals(expected, actual);
    }

    @Test
    public void Test7() {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1));
        ArrayList<Integer> actual = solution.plusOne(A);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2));
        assertEquals(expected, actual);
    }

}
