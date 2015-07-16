package _07_Rotate2DMatrix;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _07_Rotate2DMatrix.Solution } */
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
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        A.add(new ArrayList<>(Arrays.asList(1, 2)));
        A.add(new ArrayList<>(Arrays.asList(3, 4)));
        solution.rotate(A);
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        B.add(new ArrayList<>(Arrays.asList(3, 1)));
        B.add(new ArrayList<>(Arrays.asList(4, 2)));
        assertEquals(A, B);
    }

    @Test
    public void Test2() {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        A.add(new ArrayList<>(Arrays.asList(1)));
        solution.rotate(A);
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        B.add(new ArrayList<>(Arrays.asList(1)));
        assertEquals(A, B);
    }

    @Test
    public void Test3() {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        A.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        A.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
        A.add(new ArrayList<>(Arrays.asList(7, 8, 9)));
        solution.rotate(A);
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        B.add(new ArrayList<>(Arrays.asList(7, 4, 1)));
        B.add(new ArrayList<>(Arrays.asList(8, 5, 2)));
        B.add(new ArrayList<>(Arrays.asList(9, 6, 3)));
        assertEquals(A, B);
    }

}
