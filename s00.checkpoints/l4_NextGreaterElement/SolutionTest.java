package l4_NextGreaterElement;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link l4_NextGreaterElement.Solution } */
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
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(4, 5, 2, 10));
        ArrayList<Integer> actual = solution.nextGreater(a);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(5, 10, 10, -1));
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(3, 2, 1));
        ArrayList<Integer> actual = solution.nextGreater(a);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(-1, -1, -1));
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(4, 2, 1, 5, 3));
        ArrayList<Integer> actual = solution.nextGreater(a);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(5, 5, 5, -1, -1));
        assertEquals(expected, actual);
    }

}
