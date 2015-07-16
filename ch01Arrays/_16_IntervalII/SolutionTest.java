package _16_IntervalII;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.interviewbit.Interval;

public class SolutionTest {
    
    /** Test method for {@link _16_IntervalII.Solution } */
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
        ArrayList<Interval> intervals = new ArrayList<Interval>();
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(2, 6));
        intervals.add(new Interval(8, 10));
        intervals.add(new Interval(15, 18));
        List<Interval> actual = solution.merge(intervals);
        List<Interval> expected = new ArrayList<Interval>();
        expected.add(new Interval(1, 6));
        expected.add(new Interval(8, 10));
        expected.add(new Interval(15, 18));
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        ArrayList<Interval> intervals = new ArrayList<Interval>();
        intervals.add(new Interval(1, 10));
        intervals.add(new Interval(2, 6));
        intervals.add(new Interval(1, 2));
        intervals.add(new Interval(3, 5));
        intervals.add(new Interval(6, 9));
        List<Interval> actual = solution.merge(intervals);
        List<Interval> expected = new ArrayList<Interval>();
        expected.add(new Interval(1, 10));
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        ArrayList<Interval> intervals = new ArrayList<Interval>();
        intervals.add(new Interval(1, 2));
        intervals.add(new Interval(3, 5));
        intervals.add(new Interval(6, 9));
        List<Interval> actual = solution.merge(intervals);
        List<Interval> expected = new ArrayList<Interval>();
        expected.add(new Interval(1, 2));
        expected.add(new Interval(3, 5));
        expected.add(new Interval(6, 9));
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        ArrayList<Interval> intervals = new ArrayList<Interval>();
        intervals.add(new Interval(1, 2));
        intervals.add(new Interval(2, 6));
        List<Interval> actual = solution.merge(intervals);
        List<Interval> expected = new ArrayList<Interval>();
        expected.add(new Interval(1, 6));
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        ArrayList<Interval> A = new ArrayList<>();
        A.add(new Interval(1, 10));
        A.add(new Interval(2, 9));
        A.add(new Interval(3, 8));
        A.add(new Interval(4, 7));
        A.add(new Interval(5, 6));
        A.add(new Interval(6, 6));
        ArrayList<Interval> actual = solution.merge(A);
        ArrayList<Interval> expected = new ArrayList<>();
        expected.add(new Interval(1, 10));
        assertEquals(expected, actual);
    }

}
