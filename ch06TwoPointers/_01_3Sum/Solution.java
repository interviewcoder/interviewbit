/**
 *************************************************************************
 * Description: 
 * 
 * 
 *
 *************************************************************************
 * @date : Jul 16, 2015
 */
package _01_3Sum;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public int threeSumClosest(ArrayList<Integer> a, int b) {
        int result = b;
        int len = a.size();
        if (len < 3) {
            return 0;
        }
        Collections.sort(a);
        for (int i = 0; i < len; i++) {
            int number = a.get(i);

            int leftIndex = i + 1;
            int rightIndex = len - 1;
            while (leftIndex < rightIndex) {
                int threeSum = number + a.get(leftIndex) + a.get(rightIndex);
                if (threeSum == b) {
                    // best result found!
                    return b;
                } else {
                    // update global result
                    if (result == b 
                            || Math.abs(b - threeSum) < Math.abs(b - result)) {
                        result = threeSum;
                    }
                    if (threeSum < b) {
                        while (leftIndex < rightIndex
                                && a.get(leftIndex) == a.get(leftIndex + 1)) {
                            leftIndex++;
                        }
                        leftIndex++;
                    } else {
                        while (leftIndex < rightIndex
                                && a.get(rightIndex) == a.get(rightIndex - 1)) {
                            rightIndex--;
                        }
                        rightIndex--;
                    }
                }
            }
        }
        return result;
    }
}

