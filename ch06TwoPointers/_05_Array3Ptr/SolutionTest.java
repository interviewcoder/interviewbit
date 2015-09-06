package _05_Array3Ptr;

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

    /** Test method for {@link _05_Array3Ptr.Solution } */
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
        List<Integer> a = Arrays.asList(1, 2, 3);
        List<Integer> b = Arrays.asList(1, 2, 3);
        List<Integer> c = Arrays.asList(1, 2, 3);
        int actual = solution.minimize(a, b, c);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        List<Integer> c = new ArrayList<>();
        int actual = solution.minimize(a, b, c);
        int expected = Integer.MAX_VALUE;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        List<Integer> a = Arrays.asList(1, 2, 3);
        List<Integer> b = Arrays.asList(4, 5, 6, 7);
        List<Integer> c = Arrays.asList(8, 9);
        int actual = solution.minimize(a, b, c);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        List<Integer> a = Arrays.asList(1, 5);
        List<Integer> b = Arrays.asList(2);
        List<Integer> c = Arrays.asList(3, 8, 9);
        int actual = solution.minimize(a, b, c);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        List<Integer> a = Arrays.asList(4, 6);
        List<Integer> b = new ArrayList<>();
        List<Integer> c = Arrays.asList(1, 3);
        int actual = solution.minimize(a, b, c);
        int expected = Integer.MAX_VALUE;
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        int size = 50000;
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            a.add(2);
            b.add(2);
        }
        List<Integer> c = Arrays.asList(6);
        int actual = solution.minimize(a, b, c);
        int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    public void Test7() {
        int size = 50000;
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            a.add(i);
            b.add(i);
        }
        List<Integer> c = Arrays.asList(size + 1);
        int actual = solution.minimize(a, b, c);
        int expected = 2;
        assertEquals(expected, actual);
    }

}
