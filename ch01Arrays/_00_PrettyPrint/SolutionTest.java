package _00_PrettyPrint;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _00_PrettyPrint.Solution } */
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

    // 1
    @Test
    public void Test0() {
        int A = 0;
        ArrayList<ArrayList<Integer>> actual = solution.prettyPrint(A);
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        assertEquals(expected, actual);
    }

    // 1
    @Test
    public void Test1() {
        int A = 1;
        ArrayList<ArrayList<Integer>> actual = solution.prettyPrint(A);
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(Arrays.asList(1)));
        assertEquals(expected, actual);
    }

    // 2 2 2
    // 2 1 2
    // 2 2 2
    @Test
    public void Test2() {
        int A = 2;
        ArrayList<ArrayList<Integer>> actual = solution.prettyPrint(A);
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(Arrays.asList(2, 2, 2)));
        expected.add(new ArrayList<>(Arrays.asList(2, 1, 2)));
        expected.add(new ArrayList<>(Arrays.asList(2, 2, 2)));
        assertEquals(expected, actual);
    }

    // 3 3 3 3 3
    // 3 2 2 2 3
    // 3 2 1 2 3
    // 3 2 2 2 3
    // 3 3 3 3 3
    @Test
    public void Test3() {
        int A = 3;
        ArrayList<ArrayList<Integer>> actual = solution.prettyPrint(A);
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(Arrays.asList(3, 3, 3, 3, 3)));
        expected.add(new ArrayList<>(Arrays.asList(3, 2, 2, 2, 3)));
        expected.add(new ArrayList<>(Arrays.asList(3, 2, 1, 2, 3)));
        expected.add(new ArrayList<>(Arrays.asList(3, 2, 2, 2, 3)));
        expected.add(new ArrayList<>(Arrays.asList(3, 3, 3, 3, 3)));
        assertEquals(expected, actual);
    }

    // 4 4 4 4 4 4 4
    // 4 3 3 3 3 3 4
    // 4 3 2 2 2 3 4
    // 4 3 2 1 2 3 4
    // 4 3 2 2 2 3 4
    // 4 3 3 3 3 3 4
    // 4 4 4 4 4 4 4
    @Test
    public void Test4() {
        int A = 4;
        ArrayList<ArrayList<Integer>> actual = solution.prettyPrint(A);
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(Arrays.asList(4, 4, 4, 4, 4, 4, 4)));
        expected.add(new ArrayList<>(Arrays.asList(4, 3, 3, 3, 3, 3, 4)));
        expected.add(new ArrayList<>(Arrays.asList(4, 3, 2, 2, 2, 3, 4)));
        expected.add(new ArrayList<>(Arrays.asList(4, 3, 2, 1, 2, 3, 4)));
        expected.add(new ArrayList<>(Arrays.asList(4, 3, 2, 2, 2, 3, 4)));
        expected.add(new ArrayList<>(Arrays.asList(4, 3, 3, 3, 3, 3, 4)));
        expected.add(new ArrayList<>(Arrays.asList(4, 4, 4, 4, 4, 4, 4)));
        assertEquals(expected, actual);
    }

}
