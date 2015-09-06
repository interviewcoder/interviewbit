/**
 *************************************************************************
 * Description: 
 * 
 * 
 *
 *************************************************************************
 * @date : Jul 13, 2015
 */
package _05_MinStack;

import java.util.Stack;

public class Solution {

    private Stack<Integer> stack = new Stack<>();

    private int min = -1;

    public void push(int x) {
        if (stack.isEmpty() || x <= min) {
            // first element into stack or smaller element
            stack.push(min); // since min = -1 for empty stack, so current min os                         // -1
            min = x;
        }
        stack.push(x);
    }

    public void pop() {
        if (!stack.isEmpty() && min == stack.pop()) {
            // update min when popping the min element from stack
            min = stack.pop();
        }
    }

    public int top() {
        return stack.isEmpty() ? -1 : stack.peek();
    }

    public int getMin() {
        return min;
    }

}
