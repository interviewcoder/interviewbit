/**
 *************************************************************************
 * Description: 
 * 
 * There are N coins (Assume N is even) in a line. Two players take turns 
 * to take a coin from one of the ends of the line until there are no more 
 * coins left. The player with the larger amount of money wins. Assume that you go first. 
 * 
 * Write a program which computes the maximum amount of money you can win.
 *
 *************************************************************************
 * {@link http://www.interviewbit.com/courses/programming/topics/dynamic-programming/problems/maxcoin/ }
 * @date : Aug 4, 2015
 */
package _05_Maxcoin;

import java.util.ArrayList;

/** see test {@link _05_Maxcoin.SolutionTest } */
public class Solution {

    private int[][] memo;
    
    public int maxcoin(ArrayList<Integer> a) {
        int size = a.size();
        memo = new int[size][size];
        for (int i = 0; i < memo.length; i++) {
            for (int j = 0; j < memo.length; j++) {
                memo[i][j] = -1;
            }
        }
        return maxcoin(0, size - 1, a);
    }
    
    private int maxcoin(int start, int end, ArrayList<Integer> a) {
        if (start > end) {
            return 0;
        } else if (start == end) {
            return a.get(start);
        } else if (memo[start][end] != -1) {
            return memo[start][end]; 
        }
        
        int min1 = a.get(start) + Math.min(maxcoin(start + 2, end, a), maxcoin(start + 1, end - 1, a));
        int min2 = a.get(end) + Math.min(maxcoin(start + 1, end - 1, a), maxcoin(start, end - 2, a));
        int max = Math.max(min1, min2);
        memo[start][end] = max;
        return max;
    }
    
}

