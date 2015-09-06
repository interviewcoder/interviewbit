/**
 *************************************************************************
 * Description: 
 * 
 * 
 *
 *************************************************************************
 * @date : Jul 14, 2015
 */
package _01_ColorfulNumber;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {
    
    private Map<Point, Integer> memo = new HashMap<>();
    
    public int colorful(int a) {
        List<Integer> digits = new ArrayList<>();
        while (a != 0) {
            digits.add(a % 10);
            a = a / 10;
        }
        Set<Integer> appearred = new HashSet<>();
        int len = digits.size();
        for (int l = 1; l <= len; l++) {
            for (int i = 0; i <= len - l ; i++) {
                // subarray is from i with length l
                int product = calculate(i, l, digits);
                if (appearred.contains(product)) {
                    // not colorful number
                    return 0;
                }
                appearred.add(product);
            }
        }
        // colorful number
        return 1;
    }

    private int calculate(int i, int l, List<Integer> digits) {
        if (l == 1) {
            return digits.get(i);
        } 
        Point point = new Point(i, l);
        if (memo.containsKey(point)) {
            return memo.get(point);
        }
        int product = digits.get(i) * calculate(i + 1, l - 1, digits);
        memo.put(point, product);    
        return product;
    }
}

