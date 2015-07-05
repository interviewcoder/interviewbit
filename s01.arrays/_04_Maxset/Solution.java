package _04_Maxset;

import java.util.ArrayList;

public class Solution {

    // use long to deal with large sum number
    private long globalSum = -1;
    // -1 indicates globalStart has not been set before
    private int globalStart = -1;

    private int globalEnd = -1;

    public ArrayList<Integer> maxset(ArrayList<Integer> A) {
        long sum = 0;
        int start = -1;
        for (int i = 0; i < A.size(); i++) {
            int num = A.get(i);
            if (num >= 0) {
                sum += num;
                start = (start == -1) ? i : start;
                updateGlobal(sum, i, start);
            } else {
                // met a negative number, reset variables
                start = -1;
                sum = 0;
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        if (globalStart >= 0) {
            // watch out for all negative number array
            result.addAll(A.subList(globalStart, globalEnd + 1));
        }
        return result;
    }

    private void updateGlobal(long sum, int end, int start) {
        if (globalSum == -1) {
            // first time to find a segment
            globalSum = sum;
            globalStart = start;
            globalEnd = end;
        } else if (sum > globalSum
                || (sum == globalSum && (end - start > globalEnd - globalStart))) {
            // if sum is larger or segment's length is longer
            globalSum = sum;
            globalStart = start;
            globalEnd = end;
        }
    }
}
