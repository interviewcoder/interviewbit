package ArrayBug;

import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i < A.size(); i++) {
            ret.add(A.get((i + B) % A.size()));
        }
        return ret;
    }
}

