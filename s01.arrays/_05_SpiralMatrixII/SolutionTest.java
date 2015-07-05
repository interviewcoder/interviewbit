package _05_SpiralMatrixII;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _05_SpiralMatrixII.Solution } */
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
        int A = 1;
        ArrayList<ArrayList<Integer>>  actual = solution.generateMatrix(A);
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(Arrays.asList(1)));
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int A = 2;
        ArrayList<ArrayList<Integer>>  actual = solution.generateMatrix(A);
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(Arrays.asList(1, 2)));
        expected.add(new ArrayList<>(Arrays.asList(4, 3)));
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int A = 3;
        ArrayList<ArrayList<Integer>>  actual = solution.generateMatrix(A);
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        expected.add(new ArrayList<>(Arrays.asList(8, 9, 4)));
        expected.add(new ArrayList<>(Arrays.asList(7, 6, 5)));
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        int A = 4;
        ArrayList<ArrayList<Integer>>  actual = solution.generateMatrix(A);
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(Arrays.asList( 1,  2,  3, 4)));
        expected.add(new ArrayList<>(Arrays.asList(12, 13, 14, 5)));
        expected.add(new ArrayList<>(Arrays.asList(11, 16, 15, 6)));
        expected.add(new ArrayList<>(Arrays.asList(10,  9,  8, 7)));
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        int A = 5;
        ArrayList<ArrayList<Integer>>  actual = solution.generateMatrix(A);
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>(Arrays.asList( 1,  2,  3, 4, 5)));
        expected.add(new ArrayList<>(Arrays.asList(16, 17, 18,19, 6)));
        expected.add(new ArrayList<>(Arrays.asList(15, 24, 25,20, 7)));
        expected.add(new ArrayList<>(Arrays.asList(14, 23, 22,21, 8)));
        expected.add(new ArrayList<>(Arrays.asList(13, 12, 11,10, 9)));
        assertEquals(expected, actual);
    }

}
