/**
 *************************************************************************
 * Description: 
 * 
 * 
 *
 *************************************************************************
 * @date : Jul 13, 2015
 */
package _07_SlidingMax;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    // DO NOT MODIFY THE LIST
    public ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
        ArrayList<Integer> result = new ArrayList<>();
        List<Integer> candidates = new LinkedList<>();
        if (A.size() == 0 || B == 0) {
            return result;
        }
        for (int i = 0; i < A.size(); i++) {
            if (i >= B) {
                result.add(A.get(candidates.get(0)));
            }
            while (!candidates.isEmpty() && A.get(i) >= A.get(candidates.get(candidates.size() - 1))) {
                candidates.remove(candidates.size() - 1);
            }
            if (!candidates.isEmpty() && candidates.get(0) <= (i - B)) {
                // number slides out of the window
                candidates.remove(0);
            }
            candidates.add(i);
        }
        result.add(A.get(candidates.get(0)));
        return result;
    }

}
