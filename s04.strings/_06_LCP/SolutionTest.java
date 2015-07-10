package _06_LCP;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _06_LCP.Solution } */
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
        String[] strs = {"aa", "a"};
        ArrayList<String> A = new ArrayList<>(Arrays.asList(strs));
        String actual = solution.longestCommonPrefix(A);
        String expected = "a";
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        String[] strs = {"abcdefgh", "aefghijk", "abcefgh"};
        ArrayList<String> A = new ArrayList<>(Arrays.asList(strs));
        String actual = solution.longestCommonPrefix(A);
        String expected = "a";
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        String[] strs = {"", "aefghijk", "abcefgh"};
        ArrayList<String> A = new ArrayList<>(Arrays.asList(strs));
        String actual = solution.longestCommonPrefix(A);
        String expected = "";
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        String[] strs = {"bcdefgh", "befghijk", "bcefgh"};
        ArrayList<String> A = new ArrayList<>(Arrays.asList(strs));
        String actual = solution.longestCommonPrefix(A);
        String expected = "b";
        assertEquals(expected, actual);
    }

}
