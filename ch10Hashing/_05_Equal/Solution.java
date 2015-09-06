/**
 *************************************************************************
 * Description: 
 * 
 * 
 *
 *************************************************************************
 * @date : Jul 14, 2015
 */
package _05_Equal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public ArrayList<Integer> equal(ArrayList<Integer> a) {
        ArrayList<Integer> result = new ArrayList<>();
        int len = a.size();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= len - 4; i++) {
            // A1 is i
            for (int j = i + 1; j < len; j++) {
                // B1 > A1
                int sum = a.get(i) + a.get(j);
                // two sum problem for sublist(i + 1, end) and excludes index j 
                map.clear();
                int C1 = len;
                int D1 = -1;
                for (int p = i + 1; p < len; p++) {
                    // C1 > A1, C1 != B1, C1 < D1
                    if (p != j) { // C1 != B1
                        int num = a.get(p);
                        if (map.containsKey(num)) {
                            // found!! and 0-based index
                            if (map.get(num) < C1) {
                                C1 = map.get(num);
                                D1 = p;
                            }
                        } else if (!map.containsKey(sum - num)) {
                            // maintain the smaller index p
                            map.put(sum - num, p);
                        }
                    }
                }
                if (C1 != len) {
                    result.add(i);
                    result.add(j);
                    result.add(C1);
                    result.add(D1);
                    return result;
                }
            }
        }
        return result;
    }
}
