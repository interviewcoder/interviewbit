package _01_Version;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {
    
    /** Test method for {@link _01_Version.Solution } */
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
        String A = "4444371174137455";
        String B = "5.168";
        int actual = solution.compareVersion(A, B);
        assertEquals(1, actual);
    }

    @Test
    public void Test2() {
        String A = "444444444444444444444444";
        String B = "4444444444444444444444444";
        int actual = solution.compareVersion(A, B);
        assertEquals(-1, actual);
    }

    @Test
    public void Test3() {
        String version1 = "13.1";
        String version2 = "1.12";
        int actual = solution.compareVersion(version1, version2);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        String version1 = "000.1";
        String version2 = "1.000";
        int actual = solution.compareVersion(version1, version2);
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        String version1 = "01.1";
        String version2 = "1";
        int actual = solution.compareVersion(version1, version2);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test6() {
        String version1 = "01.001";
        String version2 = "1.1";
        int actual = solution.compareVersion(version1, version2);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test7() {
        String version1 = "01.001.2555";
        String version2 = "1.1.2556";
        int actual = solution.compareVersion(version1, version2);
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test8() {
        String version1 = "01.001.2555";
        String version2 = "1.1.2554";
        int actual = solution.compareVersion(version1, version2);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test9() {
        String version1 = "1.";
        String version2 = "1.";
        int actual = solution.compareVersion(version1, version2);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test10() {
        String version1 = "1.0";
        String version2 = "1.";
        int actual = solution.compareVersion(version1, version2);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test11() {
        String version1 = "1.0.0";
        String version2 = "1.";
        int actual = solution.compareVersion(version1, version2);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test12() {
        String version1 = "1.0.0.0.0";
        String version2 = "1.0";
        int actual = solution.compareVersion(version1, version2);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void Test13() {
        String version1 = "1.0.0.0.01";
        String version2 = "1.0";
        int actual = solution.compareVersion(version1, version2);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test14() {
        String version1 = "1.1";
        String version2 = "1.2";
        int actual = solution.compareVersion(version1, version2);
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test15() {
        String version1 = "0.1";
        String version2 = "1.12";
        int actual = solution.compareVersion(version1, version2);
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test16() {
        String version1 = "1.1";
        String version2 = "1.2";
        int actual = solution.compareVersion(version1, version2);
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test17() {
        String version1 = "0.1";
        String version2 = "1.12";
        int actual = solution.compareVersion(version1, version2);
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    public void Test18() {
        String A = "1.444444444444444444444444";
        String B = "1";
        int actual = solution.compareVersion(A, B);
        assertEquals(1, actual);
    }

    @Test
    public void Test19() {
        String A = "1.000000000000000000";
        String B = "1.0.000000000000000000000000000000";
        int actual = solution.compareVersion(A, B);
        assertEquals(0, actual);
    }

}
