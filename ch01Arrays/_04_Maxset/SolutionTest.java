package _04_Maxset;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _04_Maxset.Solution } */
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
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 3, -1, 1, 2));
        ArrayList<Integer> actual = solution.maxset(A);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3));
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 1, 2));
        ArrayList<Integer> actual = solution.maxset(A);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 1, 2));
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(0, 0, 0));
        ArrayList<Integer> actual = solution.maxset(A);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(0, 0, 0));
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(-1, -2, -3));
        ArrayList<Integer> actual = solution.maxset(A);
        ArrayList<Integer> expected = new ArrayList<>();
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(-1, 1, 2, -1, 2, 1));
        ArrayList<Integer> actual = solution.maxset(A);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2));
        assertEquals(expected, actual);
    }

    @Test
    public void Test7() {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(-1, 1, 2, -1, 2, 0, 1));
        ArrayList<Integer> actual = solution.maxset(A);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(2, 0, 1));
        assertEquals(expected, actual);
    }

    @Test
    public void Test8() {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1967513926, 1540383426, -1303455736, -521595368));
        ArrayList<Integer> actual = solution.maxset(A);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1967513926, 1540383426));
        assertEquals(expected, actual);
    }

    @Test
    public void Test9() {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, -1303455736, -521595368));
        ArrayList<Integer> actual = solution.maxset(A);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2));
        assertEquals(expected, actual);
    }

    @Test
    public void Test10() {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(-1, -1, -1, -1, -1));
        ArrayList<Integer> actual = solution.maxset(A);
        ArrayList<Integer> expected = new ArrayList<>();
        assertEquals(expected, actual);
    }
}
