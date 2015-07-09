package _08_Rearrange;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _08_Rearrange.Solution } */
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
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(4, 0, 2, 1, 3));
        solution.arrange(A);
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(3, 4, 2, 0, 1));
        assertEquals(B, A);
    }

    @Test
    public void Test2() {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4));
        solution.arrange(A);
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4));
        assertEquals(B, A);
    }

    @Test
    public void Test3() {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(4, 3, 2, 1, 0));
        solution.arrange(A);
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4));
        assertEquals(B, A);
    }

    @Test
    public void Test4() {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(3, 2, 0, 1, 4));
        solution.arrange(A);
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(1, 0, 3, 2, 4));
        assertEquals(B, A);
    }

    @Test
    public void Test5() {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(2, 4, 1, 0, 3));
        solution.arrange(A);
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(1, 3, 4, 2, 0));
        assertEquals(B, A);
    }

}
