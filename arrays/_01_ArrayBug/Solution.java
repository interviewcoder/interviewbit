/**
 *************************************************************************
 * Description: 
 * 
 * Rotate an array to the right by k steps. 
 * 
 * For example, with B = 1, the array [1,2,3,4,5,6] is rotated to [2, 3, 4, 5, 6, 1]
 *
 *************************************************************************
 * @date : July 4, 2014
 * see also Leetcode[189] {@link https://leetcode.com/problems/rotate-array/ }
 */
package _01_ArrayBug;

import java.util.ArrayList;

public class Solution {

    public ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i < A.size(); i++) {
            ret.add(A.get((i + B) % A.size()));
        }
        return ret;
    }

}

