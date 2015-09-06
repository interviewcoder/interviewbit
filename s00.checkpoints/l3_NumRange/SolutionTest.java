package l3_NumRange;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {

    /** Test method for {@link l3_NumRange.Solution } */
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

//    @Test
//    public void Test1() {
//        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(10, 5, 1, 0, 2));
//        int B = 6;
//        int C = 8;
//        int actual = solution.numRange(A, B, C);
//        int expected = 3;
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void Test2() {
//        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(10, 5, 3));
//        int B = 1;
//        int C = 2;
//        int actual = solution.numRange(A, B, C);
//        int expected = 0;
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void Test3() {
//        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 5, 3));
//        int B = 20;
//        int C = 30;
//        int actual = solution.numRange(A, B, C);
//        int expected = 0;
//        assertEquals(expected, actual);
//    }

    @Test
    public void Test4() {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(10, 5, 1, 0, 2));
        int B = 1;
        int C = 8;
        int actual = solution.numRange(A, B, C);
        int expected = 9;
        assertEquals(expected, actual);
    }
//
//    @Test
//    public void Test5() {
//        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(80, 97, 78, 45,
//                23, 38, 38, 93, 83, 16, 91, 69, 18, 82, 60, 50, 61, 70, 15, 6,
//                52, 90));
//        int B = 99;
//        int C = 269;
//        int actual = solution.numRange(A, B, C);
//        int expected = 58;
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void Test6() {
//        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(80, 34, 71, 40,
//                62, 30, 93, 11, 22, 59, 80, 61, 91, 94, 77, 27, 78, 72, 45, 53,
//                37));
//        int B = 34;
//        int C = 612;
//        int actual = solution.numRange(A, B, C);
//        int expected = 154;
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void Test7() {
//        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(76, 22, 81, 77,
//                95, 23, 27, 35, 24, 38, 15, 90, 19, 46, 53, 6, 77, 96, 100, 85,
//                43, 16, 73, 18, 7, 66));
//        int B = 98;
//        int C = 290;
//        int actual = solution.numRange(A, B, C);
//        int expected = 84;
//        assertEquals(expected, actual);
//    }

}
