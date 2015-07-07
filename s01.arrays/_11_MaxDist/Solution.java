/**
 *************************************************************************
 * Description: 
 * 
 * Given an array A of integers, find the maximum of j - i subjected 
 * to the constraint of A[i] <= A[j]. 
 * 
 * If there is no solution possible, return -1.
 *
 *************************************************************************
 * Time: O(NlgN) ; Space: O(N)
 * @date : Jul 6, 2015
 */
package _11_MaxDist;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/** see test {@link _11_MaxDist.SolutionTest } */
public class Solution {
    int maximumGap(final List<Integer> A) {
        if (A.size() == 0) {
            // no possible gap
            return -1;
        }
        if (A.size() == 1) {
            return 0;
        }
        // map value to its index, and sort list by value
        List<Point> toSort = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            toSort.add(new Point(A.get(i), i));
        }
        Collections.sort(toSort, new Comparator<Point>() {

            @Override
            public int compare(Point o1, Point o2) {
                return (o1.x) - o2.x;
            }

        });
        int len = toSort.size();
        int maxIndex = toSort.get(toSort.size() - 1).y;
        int ans = 0;
        for (int i = len - 2; i >= 0; i--) {
            ans = Math.max(ans, maxIndex - toSort.get(i).y);
            maxIndex = Math.max(maxIndex, toSort.get(i).y);
        }
        return ans;
    }
}
