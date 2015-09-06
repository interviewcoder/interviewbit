/**
 *************************************************************************
 * Description: 
 * 
 * 
 *
 *************************************************************************
 * @date : Jul 13, 2015
 */
package _06_Histogram;

import java.util.ArrayList;
import java.util.Stack;

/** see test {@link _06_Histogram.SolutionTest } */
public class Solution {
    public int largestRectangleArea(ArrayList<Integer> A) {
        Stack<Integer> indices = new Stack<>();
        int result = 0;
        for (int i = 0; i <= A.size(); i++) {
            int height = i == A.size() ? -1 : A.get(i);
            while (!indices.isEmpty() && A.get(indices.peek()) >= height) {
                // calculate the area that has 'height' as smallest bar and
                // the right bar
                int h = A.get(indices.pop());
                int w = indices.isEmpty() ? i : i - indices.peek() - 1;
                result = Math.max(result, h * w);
            }
            indices.push(i);
        }
        return result;
    }
}
