/**
 *************************************************************************
 * Description: 
 * 
 * You’re given a read only array of n integers. Find out if any integer 
 * occurs more than n/3 times in the array in linear time and constant additional space. 
 * 
 * If so, return the integer. If not, return -1. 
 * If there are multiple solutions, return any one. 
 * 
 * Example : 
 *  Input : [1 2 3 1 1] Output : 1 
 * 1 occurs 3 times which is more than 5/3 times. 
 *
 *************************************************************************
 * @date : Jul 6, 2015
 */
package _14_Repeat3;

import java.util.List;

public class Solution {
    // DO NOT MODIFY THE LIST
    public int repeatedNumber(final List<Integer> A) {
        int len = A.size();
        if (A.size() == 0) {
            return -1;
        }
        if (A.size() == 1) {
            return A.get(0);
        }
        int candidate1 = 0;
        int candidate2 = 1;
        int count1 = 0;
        int count2 = 0;
        for (int num : A) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int num : A) {
            if (candidate1 == num) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            }
        }
        if (count1 > len / 3) {
            return candidate1;
        } else if (count2 > len / 3) {
            return candidate2;
        } else {
            return -1;
        }
    }
}

