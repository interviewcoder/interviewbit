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

import java.awt.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/** 
 * Have an event queue, and sort queue based on happening date. Then iteratate
 * this queue, for an <em>arrival</em> event, add one more active users, for a 
 * <em>depart</em> user, remove one active user.
 * 
 * see test {@link _20_Hotel.SolutionTest } */
public class Solution {

    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
        List<Point> events = new ArrayList<>();
        for (int i = 0; i < arrive.size(); i++) {
            events.add(new Point(arrive.get(i), 1));
            events.add(new Point(depart.get(i), 0));
        }
        Collections.sort(events, new Comparator<Point>() {
            @Override
            public int compare(Point p1, Point p2) {
                if (p1.x != p2.x) {
                    return p1.x - p2.x;
                } else {
                    // happen in the same day, let depart event happen first
                    return p1.y - p2.y;
                }
            }
        });
        int activeUsers = 0;
        for (Point point : events) {
            if (point.y == 1) {
                // one more arrive 
                activeUsers++;
                if (activeUsers > K) {
                    return false;
                }
            } else {
                // one customer leaves
                activeUsers--;
            }
        }
        return true;
    }

}

