package _04_Adjacent;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _04_Adjacent.Solution } */
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
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        ArrayList<Integer> row1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> row2 = new ArrayList<>(Arrays.asList(2, 3, 4, 5));
        matrix.add(row1);
        matrix.add(row2);
        int actual = solution.adjacent(matrix);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        ArrayList<Integer> row1 = new ArrayList<>(Arrays.asList(16,  5, 54, 55, 36, 82, 61, 77, 66, 61));
        ArrayList<Integer> row2 = new ArrayList<>(Arrays.asList(31, 30, 36, 70,  9, 37,  1, 11, 68, 14));
        matrix.add(row1);
        matrix.add(row2);
        int actual = solution.adjacent(matrix);
        int expected = 321;
        assertEquals(expected, actual);
    }

}
