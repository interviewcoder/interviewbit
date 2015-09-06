package l4_NextGreaterElement;

import java.util.ArrayList;
import java.util.Arrays;

/** see test {@link l4_NextGreaterElement.SolutionWrongTest} */
/**
 * Two pointer cannot do the job because it cannot reflect local changes.
 * For example, [10, 5, 6] v.s. [10, 5, 6, 11]
 * for 1st array, two pointer cannot find the next greater element for 5.
 * It can find next greater element for 5 only when element greater than 10 appears. 
 */
public class SolutionWrong {
    public ArrayList<Integer> nextGreater(ArrayList<Integer> a) {
        int[] res = new int[a.size()];
        Arrays.fill(res, -1);
        int i = 0;
        int j = 0;
        int len = a.size();
        while (i < len) {
            // find the position where next greater element appears
            j = i + 1;
            while (j < len) {
                if (a.get(j) > a.get(i)) {
                    break;
                }
                j++;
            }
            // for [i : j), their next greater should be a[j]
            if (j < len) {
                for (int k = i; k < j; k++) {
                    res[k] = a.get(j);
                }
            }
            i = j;
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : res) {
            result.add(num);
        }
        return result;
    }
}
