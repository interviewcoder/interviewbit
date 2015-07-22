/**
 *************************************************************************
 * Description: 
 * 
 * Given n non-negative integers a1, a2, ..., an, where each represents a 
 * point at coordinate (i, ai). n vertical lines are drawn such that the 
 * two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which 
 * together with x-axis forms a container, such that the container contains 
 * the most water. 
 * 
 * Note: You may not slant the container.
 *
 *************************************************************************
 * @date : Jul 22, 2015
 * [Leetcode][011]
 * {@link http://www.interviewbit.com/courses/programming/topics/two-pointers/problems/container/ }
 */
package _02_Container;

import java.util.ArrayList;

/** see test {@link _02_Container.SolutionTest } */
public class Solution {

    public int maxArea(ArrayList<Integer> a) {
        int len = a.size();
        if (len == 0) {
            return 0;
        }
        int result = 0;
        int left = 0;
        int right = len - 1;
        while (left < right) {
            if (a.get(left) < a.get(right)) {
                // left bar is lower 
                result = Math.max(a.get(left) * (right - left), result);
                left++;
            } else {
                result = Math.max(a.get(right) * (right - left), result);
                right--;
            }
        }
        return result;
    }
}

