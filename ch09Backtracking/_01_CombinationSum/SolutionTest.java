package _01_CombinationSum;

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
    
    /** Test method for {@link _01_CombinationSum.Solution } */
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
    public void Test4() {
        ArrayList<Integer> candidates = new ArrayList<>(Arrays.asList(8, 10, 6, 11, 1, 16, 8));
        int target = 28;
        ArrayList<ArrayList<Integer>> actuals = solution.combinationSum(candidates,
                target);
        ArrayList<List<Integer>> expecteds = new ArrayList<List<Integer>>();
        expecteds.add(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1));
        expecteds.add(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 1, 1, 1, 1, 1, 6));
        expecteds.add(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 1, 1, 1, 8));
        expecteds.add(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 1, 10));
        expecteds.add(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                1, 1, 1, 11));
        expecteds.add(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                1, 1, 6, 6));
        expecteds.add(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                6, 8));
        expecteds.add(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 6, 10));
        expecteds.add(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 8, 8));
        expecteds.add(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 16));
        expecteds.add(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 6, 11));
        expecteds.add(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 6, 6, 6));
        expecteds.add(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 8, 10));
        expecteds.add(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 8, 11));
        expecteds.add(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 6, 6, 8));
        expecteds.add(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 10, 10));
        expecteds.add(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 10, 11));
        expecteds.add(Arrays.asList(1, 1, 1, 1, 1, 1, 6, 6, 10));
        expecteds.add(Arrays.asList(1, 1, 1, 1, 1, 1, 6, 8, 8));
        expecteds.add(Arrays.asList(1, 1, 1, 1, 1, 1, 6, 16));
        expecteds.add(Arrays.asList(1, 1, 1, 1, 1, 1, 11, 11));
        expecteds.add(Arrays.asList(1, 1, 1, 1, 1, 6, 6, 11));
        expecteds.add(Arrays.asList(1, 1, 1, 1, 6, 6, 6, 6));
        expecteds.add(Arrays.asList(1, 1, 1, 1, 6, 8, 10));
        expecteds.add(Arrays.asList(1, 1, 1, 1, 8, 8, 8));
        expecteds.add(Arrays.asList(1, 1, 1, 1, 8, 16));
        expecteds.add(Arrays.asList(1, 1, 1, 6, 8, 11));
        expecteds.add(Arrays.asList(1, 1, 6, 6, 6, 8));
        expecteds.add(Arrays.asList(1, 1, 6, 10, 10));
        expecteds.add(Arrays.asList(1, 1, 8, 8, 10));
        expecteds.add(Arrays.asList(1, 1, 10, 16));
        expecteds.add(Arrays.asList(1, 6, 10, 11));
        expecteds.add(Arrays.asList(1, 8, 8, 11));
        expecteds.add(Arrays.asList(1, 11, 16));
        expecteds.add(Arrays.asList(6, 6, 6, 10));
        expecteds.add(Arrays.asList(6, 6, 8, 8));
        expecteds.add(Arrays.asList(6, 6, 16));
        expecteds.add(Arrays.asList(6, 11, 11));
        expecteds.add(Arrays.asList(8, 10, 10));
        assertEquals(expecteds, actuals);
    }

}
