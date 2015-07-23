package _05_AssignBooks;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _05_AssignBooks.Solution } */
    Solution solution;

    @Rule
    public Timeout globalTimeout = new Timeout(50);

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
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(12, 34, 67, 90));
        int b = 2;
        int actual = solution.books(a, b);
        int expected = 113;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(73, 58, 30, 72, 44, 78, 23, 9));
        int b = 5;
        int actual = solution.books(a, b);
        int expected = 110;
        assertEquals(expected, actual);
    }

}
