/**
 *************************************************************************
 * Description: 
 * Given a string containing only digits, restore it by returning all
 * possible valid IP address combinations. 
 * For example:
 *  Given "25525511135", 
 *  return ["255.255.11.135", "255.255.111.35"]. 
 * (Order does not matter) 
 * 
 *************************************************************************
 * @date : Jul 9, 2015
 */
package _04_RestoreIPAddress;

import java.util.ArrayList;

/** see test {@link _04_RestoreIPAddress.SolutionTest } */
public class Solution {
    public ArrayList<String> restoreIpAddresses(String A) {
        ArrayList<String> path = new ArrayList<>();
        ArrayList<String> comb = new ArrayList<>();
        int index = 0;
        int parts = 4;
        restore(index, A, parts, path, comb);
        return comb;
    }

    private void restore(int index, String A, int parts,
            ArrayList<String> path, ArrayList<String> comb) {
        // base case
        int len = A.length();
        if (index == len) {
            if (parts == 0) {
                // one combination is found
                String combination = String.join(".", path);
                comb.add(combination);
            } else {
                return;
            }
        }
        if (index < len && parts > 0) {
            // recursive case
            if (A.charAt(index) == '0') {
                // '0' must be a separate part
                path.add("0");
                restore(index + 1, A, parts - 1, path, comb);
                path.remove(path.size() - 1);
            } else {
                for (int i = index; (i < index + 3) && (i < len); i++) {
                    // try all possible 3 digits combination
                    int num = Integer.parseInt(A.substring(index, i + 1));
                    if (num <= 255) {
                        path.add("" + num);
                        restore(i + 1, A, parts - 1, path, comb);
                        path.remove(path.size() - 1);
                    }
                }
            }

        }
    }
}
