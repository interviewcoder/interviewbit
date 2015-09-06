package _05_Equal;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _05_Equal.Solution } */
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
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(3, 4, 7, 1, 4, 9, 8));
        ArrayList<Integer> actual = solution.equal(a);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(0, 2, 3, 5));
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(9, 5, 4, 9, 3, 6, 8, 7, 1, 2, 8, 7, 2, 9, 7, 1, 3, 9, 7, 8, 1, 0, 5, 5));

        ArrayList<Integer> actual = solution.equal(a);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(0, 1, 3, 22));
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(9, 5, 4, 9, 3, 6, 8, 7, 1, 2, 8, 7, 2, 9, 7, 1, 3, 9, 7, 8, 1, 0, 5));

        ArrayList<Integer> actual = solution.equal(a);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(0, 1, 3, 22));
        assertEquals(expected, actual);
    }

}
