/**
 *************************************************************************
 * Description: 
 * 
 * 
 *
 *************************************************************************
 * @date : Jul 14, 2015
 */
package _02_2Sum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public ArrayList<Integer> twoSum(final List<Integer> a, int b) {
        Map<Integer, Integer> expect = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            int num = a.get(i);
            if (expect.containsKey(num)) {
                // result found, return result uses 1-based index
                result.add(1 + expect.get(num));
                result.add(i + 1);
                return result;
            }
            int exp = b - num;
            // keep the minimum index for index1
            if (!expect.containsKey(exp)) {
                expect.put(exp, i);
            }
        }
        return result;
    }
}

