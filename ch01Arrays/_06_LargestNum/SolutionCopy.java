/**
 *************************************************************************
 * Description: 
 * 
 * Given a list of non negative integers, arrange them such that they form 
 * the largest number. 
 * 
 * For example: 
 * 
 * Given [3, 30, 34, 5, 9], the largest formed number is 9534330. 
 * 
 * Note: The result may be very large, so you need to return a string 
 * instead of an integer.
 *
 *************************************************************************
 * @date : Jul 5, 2015
 */
package _06_LargestNum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/** see test {@link _06_LargestNum.SolutionTest } */
public class SolutionCopy {

    // DO NOT MODIFY THE LIST
    public String largestNumber(final List<Integer> A) {

        List<Integer> sortList = new ArrayList<>(A);

        // sort list by number's bit
        Collections.sort(sortList, new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                // convert to string and then compare number bit by bit
                // from begin to end
                String s1 = num1 + "" + num2;
                String s2 = num2 + "" + num1;
                // !be careful not s1.compareTo(s2)
                // because we want larger string at the beginning
                return s2.compareTo(s1);
            }
        });

        // append sort list to result
        StringBuilder strBuilder = new StringBuilder();
        for (int num : sortList) {
            strBuilder.append(num);
        }
        // ! corner case: all 0s
        int i = 0;
        for (i = 0; i < strBuilder.length(); i++) {
            if (strBuilder.charAt(i) != '0') {
                return strBuilder.substring(i);
            }
        }
        return "0";
    }

}
