/**
 *************************************************************************
 * Description: 
 * 
 * 
 *
 *************************************************************************
 * @date : Jul 6, 2015
 */
package _11_MaxDist;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _11_MaxDist.Solution } */
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
        List<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 3));
        int actual = solution.maximumGap(A);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        List<Integer> A = new ArrayList<>(Arrays.asList(3, 2, 1));
        int actual = solution.maximumGap(A);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        List<Integer> A = new ArrayList<>(Arrays.asList(2, 2, 2));
        int actual = solution.maximumGap(A);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        List<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 3, 1));
        int actual = solution.maximumGap(A);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        List<Integer> A = new ArrayList<>(Arrays.asList(3, 1, 2, 3, 0));
        int actual = solution.maximumGap(A);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        List<Integer> A = new ArrayList<>(Arrays.asList(3, 2, 1, 2, 4));
        int actual = solution.maximumGap(A);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void Test7() {
        List<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 3, 0));
        int actual = solution.maximumGap(A);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void Test8() {
        List<Integer> A = new ArrayList<>(Arrays.asList(1));
        int actual = solution.maximumGap(A);
        int expected = 0;
        assertEquals(expected, actual);
    }

}
