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
import java.util.Queue;

public class SolutionMaxQueue {
    // DO NOT MODIFY THE LIST
    public ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
        ArrayList<Integer> result = new ArrayList<>();
        if (A.size() == 0 || B == 0) {
            return result;
        }
        MaxQueue queue = new MaxQueue();
        int upper = A.size() - B;
        int i = 0;
        while (i <= upper) {
            // keep the queue's size equal to B
            if (queue.size() == B) {
                queue.poll();
            }
            queue.offer(A.get(i));
            result.add(queue.getMax());
        }
        return result;
    }

    class MaxQueue {

        private int max = -Integer.MIN_VALUE;

        private Queue<Integer> queue = new LinkedList<>();

        private Queue<Integer> maxQueue = new LinkedList<>();

        public int size() {
            return queue.size();
        }

        /**
         * @return
         */
        public int getMax() {
            return max;
        }

        /**
         * @param integer
         */
        public void offer(int x) {
            queue.offer(x);
            if (x > max) {
                // new max value
                max = x;
                maxQueue.clear();
            } else if (x > maxQueue.peek()) {
                maxQueue.clear();
                maxQueue.offer(x);
            } else {
                maxQueue.offer(x);
            }
        }

        /**
         * 
         */
        public void poll() {
            if (!queue.isEmpty()) {
                if (queue.peek() == max) {
                    max = maxQueue.peek();
                }
                queue.poll();
            }
        }

    }
}
