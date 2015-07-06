/**
 *************************************************************************
 * Description: 
 * 
 * You are given a read only array of n integers from 1 to n. 
 * 
 * Each integer appears exactly once except A which appears twice and B 
 * which is missing. 
 * 
 * Return A and B. 
 * 
 * Note: Your algorithm should have a linear runtime complexity. 
 * 
 * Could you implement it without using extra memory? 
 * Note that in your output A should precede B. 
 * 
 * Example: Input:[3 1 2 5 3] Output:[3, 4] 
 * A = 3, B = 4.
 *
 *************************************************************************
 * @date : Jul 5, 2015
 */
package _09_NArray;

import java.util.ArrayList;
import java.util.List;

/**
 * deal with auto boxing for integer list, use equals() to compare value.
 * For details see {@link _09_NArray.Test } 
 */
public class Solution {
    // DO NOT MODIFY THE LIST
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        ArrayList<Integer> result = new ArrayList<>();
        List<Integer> B = new ArrayList<>(A);
        
        int duplicated = -1;
        int indexOfMissing = -1;
        for (int i = 0; i < B.size(); i++) {
            // until B[i] stores the right number (i.e. i + 1)
            // or we meet the duplicated number
            while (B.get(i) != i + 1)  {
                int num = B.get(i);
//                // wrong 1: comparing two Integer object's reference
//                if (B.get(i) == B.get(B.get(i) - 1)) {

//                // wrong 2: comparing two Integer object's reference
//                if (B.get(i) == B.get(num - 1)) {

//                // wrong 3: comparing two Integer object's reference
//                if (B.get(i) == B.get(num -1)) {

//                // right 1: 'num == ' cause auto boxing, comparing two int
//                if (num == B.get(num - 1)) {

//                // right 2:  comparing two Integer's value
//                if (B.get(i).equals(B.get(B.get(i) - 1))) {

                // right 3:  comparing two int
                if (num == B.get(B.get(i) -1)) {
                    // met with duplicated number
                    duplicated = B.get(num - 1);
                    indexOfMissing = i;
                    break;
                }
                // swap B[i] with B[num - 1]
                int temp = B.get(i);
                B.set(i, B.get(num - 1));
                B.set(num - 1, temp);
            }
        }
        
        result.add(duplicated);
        result.add(indexOfMissing + 1);
        
        return result;
    }

}

