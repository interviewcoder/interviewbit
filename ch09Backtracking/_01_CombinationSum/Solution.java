/**
 *************************************************************************
 * Description: 
 * 
 * Given a set of candidate numbers (C) and a target number (T), find all unique 
 * combinations in C where the candidate numbers sums to T. 
 * The same repeated number may be chosen from C unlimited number of times. 
 * 
 * Note: All numbers (including target) will be positive integers. 
 * Elements in a combination (a1, a2, … , ak) must be in non-descending 
 * order. (ie, a1 ≤ a2 ≤ … ≤ ak). 
 * 
 * The combinations themselves must be sorted in ascending order. 
 * CombinationA > CombinationB iff (a1 > b1) OR (a1 = b1 AND a2 > b2) 
 * OR … (a1 = b1 AND a2 = b2 AND … ai = bi AND ai+1 > bi+1) 
 * The solution set must not contain duplicate combinations. 
 * 
 * Example, Given candidate set 2,3,6,7 and target 7, A solution set is: 
 * 
 * [2, 2, 3] [7]
 *
 *************************************************************************
 * @date : Aug 1, 2015
 */
package _01_CombinationSum;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {

    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> a, int b) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        Collections.sort(a);
        int cursum = 0;
        int index = 0;
        dfs(index, cursum, b, a, list, res);
        return res;
    }
    
    private void dfs(int index, int cursum, int targetsum, ArrayList<Integer> nums, 
        ArrayList<Integer> path, ArrayList<ArrayList<Integer>> res) {
        // base case
        if (cursum == targetsum) {
            res.add(new ArrayList<Integer>(path));
            return;
        }
        
        // recursive case
        for (int i = index; i < nums.size(); i++) {
            int num = nums.get(i);
            // skip duplicates in candidate set
            if (i != index && num == nums.get(i - 1)) {
                continue;
            }
            if (cursum + num > targetsum) {
                // no need to check other siblings
                break;
            }
            path.add(num);
            dfs(i, cursum + num, targetsum, nums, path, res);
            path.remove(path.size() - 1);
        }
    }

}

