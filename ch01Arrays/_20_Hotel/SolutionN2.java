/**
 *************************************************************************
 * Description: 
 * 
 * 
 *
 *************************************************************************
 * @date : Jul 27, 2015
 */
package _20_Hotel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SolutionN2 {

    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
        Map<Integer, Integer> dateCount = new HashMap<>();
        for (int i = 0; i < arrive.size(); i++) {
            int arriveDate = arrive.get(i);
            int departDate = depart.get(i);
            for (int d = arriveDate; d < departDate; d++) {
                int count = 1;
                if (dateCount.containsKey(d)) {
                    count += dateCount.get(d);
                }
                if (count > K) {
                    return false;
                }
                dateCount.put(d, count);
            }
        }
        return true;
    }

}

