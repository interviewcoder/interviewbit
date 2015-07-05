package _06_LargestNum;

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
    
    /** Test method for {@link _06_LargestNum.Solution } */
    Solution solution;

    @Rule
    public Timeout globalTimeout = new Timeout(100);

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
        List<Integer> A = new ArrayList<>(Arrays.asList(3, 30, 34, 5, 9));
        String actual = solution.largestNumber(A);
        String expected = "9534330";
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        List<Integer> A = new ArrayList<>(Arrays.asList(0, 0, 0));
        String actual = solution.largestNumber(A);
        String expected = "0";
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        List<Integer> A = new ArrayList<>(Arrays.asList(0, 1, 0));
        String actual = solution.largestNumber(A);
        String expected = "100";
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        List<Integer> A = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1));
        String actual = solution.largestNumber(A);
        String expected = "111111111";
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        List<Integer> A = new ArrayList<>(Arrays.asList(12, 121));
        String actual = solution.largestNumber(A);
        String expected = "12121";
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        List<Integer> A = new ArrayList<>(Arrays.asList(12, 13));
        String actual = solution.largestNumber(A);
        String expected = "1312";
        assertEquals(expected, actual);
    }

    @Test
    public void Test7() {
        List<Integer> A = new ArrayList<>(Arrays.asList(12, 123));
        String actual = solution.largestNumber(A);
        String expected = "12312";
        assertEquals(expected, actual);
    }

    @Test
    public void Test8() {
        List<Integer> A = new ArrayList<>(Arrays.asList(12, 1201));
        String actual = solution.largestNumber(A);
        String expected = "121201";
        assertEquals(expected, actual);
    }

}
