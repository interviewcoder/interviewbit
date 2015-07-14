/**
 *************************************************************************
 * Description: 
 * 
 * Given an array, find the next greater element G[i] for every element 
 * A[i] in the array. The Next greater Element for an element A[i] is the 
 * first greater element on the right side of A[i] in array. 
 * 
 * More formally, 
 * G[i] for an element A[i] = an element A[j] such that 
 *  j is minimum possible AND 
 *  j > i AND A[j] > A[i] 
 * Elements for which no greater element exist, consider next greater 
 * element as -1. 
 * 
 * Example: Input : A : [4, 5, 2, 10] 
 *          Output : [5, 10, 10, -1] 
 * Example 2: Input : A : [3, 2, 1] 
 *            Output : [-1, -1, -1]
 *
 *************************************************************************
 * @date : Jul 14, 2015
 */
package l4_NextGreaterElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/** see test {@link l4_NextGreaterElement.SolutionTest } */
public class Solution {
    public ArrayList<Integer> nextGreater(ArrayList<Integer> a) {
        int[] res = new int[a.size()];
        Arrays.fill(res, -1);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < a.size(); i++) {
            int height = a.get(i);
            while (!stack.isEmpty() && height > a.get(stack.peek())) {
                res[stack.pop()] = height;
            }
            stack.push(i);
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : res) {
            result.add(num);
        }
        return result;
    }
}

