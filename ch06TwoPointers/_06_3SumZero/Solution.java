/**
 *************************************************************************
 * Description: 
 * 
 * Given an array S of n integers, are there elements a, b, c in S such 
 * that a + b + c = 0 ? Find all unique triplets in the array which gives 
 * the sum of zero. 
 * Note: 
 * Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤ b ≤ c) 
 * The solution set must not contain duplicate triplets. 
 * 
 * For example, given array S = {-1 0 1 2 -1 -4}, 
 * A solution set is: (-1, 0, 1) (-1, -1, 2) 
 *
 *************************************************************************
 * @date : Jul 27, 2015
 */
package _06_3SumZero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> a) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Collections.sort(a);
        int len = a.size();
        for (int i = 0; i < len - 2 ; i++) {
            if (i > 0 && a.get(i).equals(a.get(i - 1))) {
                continue;
            }
            int num = a.get(i);
            // find two numbers from [i + 1 : end] that sums to -num using two pointers
            int left = i + 1;
            int right = len - 1;
            while (left < right) {
                int sum  = a.get(left)  + a.get(right) + num;
                if (sum == 0) {
                    // found one combination
                    res.add(new ArrayList<>(Arrays.asList(num, a.get(left), a.get(right))));
                    int leftVal = a.get(left);
                    // skip all duplicates
                    while (left < right && a.get(left) == leftVal) {
                        left++;
                    }
                    int rightVal = a.get(right);
                    while (right > left && a.get(right) == rightVal) {
                        right--;
                    }
                } else if (sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
            // skip duplicates
        }
        return res;
    }
}

