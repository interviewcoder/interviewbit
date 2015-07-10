package _02_Palindrome;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _02_Palindrome.Solution } */
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
        String A = "A man, a plan, a canal: Panama";
        int actual = solution.isPalindrome(A);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        String A = "race a car";
        int actual = solution.isPalindrome(A);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        String A = "\"";
        int actual = solution.isPalindrome(A);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        String A = "      ";
        int actual = solution.isPalindrome(A);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        String s = "aaa";
        int actual = solution.isPalindrome(s);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        String s = "abaa";
        int actual = solution.isPalindrome(s);
        int expected = 0;
        assertEquals(expected, actual);
    }


}
