package _00_ValidParenthesis;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _00_ValidParenthesis.Solution } */
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
    public void Test0() {
        String s = "[]";
        int actual = solution.isValid(s);
        assertTrue("[]", actual == 1);
    }

    @Test
    public void Test1() {
        String s = "{}";
        int actual = solution.isValid(s);
        assertTrue("{}", actual == 1);
    }

    @Test
    public void Test2() {
        String s = "()";
        int actual = solution.isValid(s);
        assertTrue("()", actual == 1);
    }

    @Test
    public void Test3() {
        String s = "";
        int actual = solution.isValid(s);
        assertTrue("empty string", actual == 1);
    }

    @Test
    public void Test4() {
        String s = ")";
        int actual = solution.isValid(s);
        assertTrue("only right", actual == 0);
    }

    @Test
    public void Test5() {
        String s = "([{}])";
        int actual = solution.isValid(s);
        assertTrue("nested string", actual == 1);
    }

    @Test
    public void Test6() {
        String s = "([{(}])";
        int actual = solution.isValid(s);
        assertTrue("wrong nested string", actual == 0);
    }

    @Test
    public void Test7() {
        String s = "([{}](){[]})";
        int actual = solution.isValid(s);
        assertTrue(s, actual == 1);
    }

    @Test
    public void Test8() {
        String s = "([{})";
        int actual = solution.isValid(s);
        assertTrue(s, actual == 0);
    }

    @Test
    public void Test9() {
        String s = "(}";
        int actual = solution.isValid(s);
        assertTrue(s, actual == 0);
    }

    @Test
    public void Test10() {
        String s = "({}]";
        int actual = solution.isValid(s);
        assertTrue(s, actual == 0);
    }

}
