package l3_KthSmallestElement;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {

    /** Test method for {@link l3_KthSmallestElement.Solution } */
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
        List<Integer> A = Arrays.asList(60, 94, 63, 3, 86, 40, 93, 36, 56, 48,
                17, 10, 23, 43, 77, 1, 1, 93, 79, 4, 10, 47, 1, 99, 91, 53, 99,
                18, 52, 61, 84, 10, 13, 52, 3, 9, 78, 16, 7, 6);
        int k = 22;
        int actual = solution.kthsmallest(A, k);
        int expected = 48;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        List<Integer> A = Arrays.asList(2, 1, 4, 3, 2);
        int k = 3;
        int actual = solution.kthsmallest(A, k);
        int expected = 2;
        assertEquals(expected, actual);
    }

}
