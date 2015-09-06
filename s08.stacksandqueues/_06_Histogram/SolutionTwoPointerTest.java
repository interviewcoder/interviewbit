package _06_Histogram;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTwoPointerTest {
    /** Test method for {@link _06_Histogram.SolutionTwoPointer} */
    SolutionTwoPointer solution;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        solution = new SolutionTwoPointer();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test1() {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(90, 58, 69, 70,
                82, 100, 13, 57, 47, 18));
        int actual = solution.largestRectangleArea(A);
        int expected = 348;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1));
        int actual = solution.largestRectangleArea(A);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 3));
        int actual = solution.largestRectangleArea(A);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(3, 2, 1));
        int actual = solution.largestRectangleArea(A);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(2, 1, 5, 6, 2, 3));
        int actual = solution.largestRectangleArea(A);
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(47, 69, 67, 97,
                86, 34, 98, 16, 65, 95, 66, 69, 18, 1, 99, 56, 35, 9, 48, 72,
                49, 47, 1, 72, 87, 52, 13, 23, 95, 55, 21, 92, 36, 88, 48, 39,
                84, 16, 15, 65, 7, 58, 2, 21, 54, 2, 71, 92, 96, 100, 28, 31,
                24, 10, 94, 5, 81, 80, 43, 35, 67, 33, 39, 81, 69, 12, 66, 87,
                86, 11, 49, 94, 38, 44, 72, 44, 18, 97, 23, 11, 30, 72, 51, 61,
                56, 41, 30, 71, 12, 44, 81, 43, 43, 27));
        int expected = 418;
        int size = A.size() - 1;
        StringBuilder str = new StringBuilder();
        str.append(size);
        for (int i = 0; i < size && i < A.size(); i++) {
            str.append(" ");
            str.append(A.get(i));
        }
        int actual = solution.largestRectangleArea(A.subList(0, size + 1));
        assertEquals(expected, actual);
    }

}
