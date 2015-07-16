/**
 *************************************************************************
 * Description: 
 *  
 * Implement the next permutation, which rearranges numbers into the 
 * numerically next greater permutation of numbers. 
 * 
 * If such arrangement is not possible, it must be rearranged as the 
 * lowest possible order ie, sorted in an ascending order. 
 * 
 * The replacement must be in-place, do not allocate extra memory. 
 * 
 * Examples: 
 *  1,2,3 → 1,3,2 
 *  3,2,1 → 1,2,3 
 *  1,1,5 → 1,5,1 
 *  20, 50, 113 → 20, 113, 50 
 *  
 * Inputs are in the left-hand column and its corresponding 
 * outputs are in the right-hand column.
 *
 *************************************************************************
 * @date : Jul 5, 2015
 */
package _08_NextPermutation;

import java.util.ArrayList;

public class Solution {

    public void nextPermutation(ArrayList<Integer> A) {
        int start = A.size() - 1;
        // find from the back the ascending order
        while (start > 0 && A.get(start - 1) >= A.get(start)){
            start--;
        }
        // now A[start - 1] < A[start] and 
        // A[start : end] are in ascending order
        if (start > 0) {
            int end = A.size() - 1;
            // find the just-larger-than number to swap with A[start - 1]
            while (A.get(end) <= A.get(start - 1)) {
                end--;
            }
            swap(A, start - 1, end);
        }
        // reverse A[start : end]
        for (int i = start; i < (start + A.size()) / 2; i++) {
            swap(A, i, A.size() - 1 + start - i);
        }
    }
    
    private void swap(ArrayList<Integer> array, int i, int j) {
        int temp = array.get(i);
        array.set(i, array.get(j));
        array.set(j, temp);
    }

}

