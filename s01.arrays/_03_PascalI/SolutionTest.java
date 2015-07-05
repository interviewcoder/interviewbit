package _03_PascalI;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _03_PascalI.Solution } */
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
        int A = 5;
        ArrayList<ArrayList<Integer>> actual = solution.generate(A);
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(Arrays.asList(1)));
        expected.add(new ArrayList<>(Arrays.asList(1, 1)));
        expected.add(new ArrayList<>(Arrays.asList(1, 2, 1)));
        expected.add(new ArrayList<>(Arrays.asList(1, 3, 3, 1)));
        expected.add(new ArrayList<>(Arrays.asList(1, 4, 6, 4, 1)));
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int A = 1;
        ArrayList<ArrayList<Integer>> actual = solution.generate(A);
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(Arrays.asList(1)));
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int A = 2;
        ArrayList<ArrayList<Integer>> actual = solution.generate(A);
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(Arrays.asList(1)));
        expected.add(new ArrayList<>(Arrays.asList(1, 1)));
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        int A = 0;
        ArrayList<ArrayList<Integer>> actual = solution.generate(A);
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        int A = -1;
        ArrayList<ArrayList<Integer>> actual = solution.generate(A);
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        int A = 7;
        ArrayList<ArrayList<Integer>> actual = solution.generate(A);
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(Arrays.asList(1)));
        expected.add(new ArrayList<>(Arrays.asList(1, 1)));
        expected.add(new ArrayList<>(Arrays.asList(1, 2, 1)));
        expected.add(new ArrayList<>(Arrays.asList(1, 3, 3, 1)));
        expected.add(new ArrayList<>(Arrays.asList(1, 4, 6, 4, 1)));
        expected.add(new ArrayList<>(Arrays.asList(1, 5, 10, 10, 5, 1)));
        expected.add(new ArrayList<>(Arrays.asList(1, 6, 15, 20, 15, 6, 1)));
        assertEquals(expected, actual);
    }

}
