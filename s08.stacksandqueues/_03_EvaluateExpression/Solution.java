/**
 *************************************************************************
 * Description: 
 * 
 * 
 *
 *************************************************************************
 * @date : Jul 12, 2015
 */
package _03_EvaluateExpression;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {

    public interface Operation {
        // define method as type member
        public int eval(int op1, int op2);
    }

    @SuppressWarnings({ "serial" })
    private static final Map<String, Operation> operator = new HashMap<String, Operation>() {{
        put("+", new Operation() {
            @Override
            public int eval(int op1, int op2) {
                return op1 + op2;
            }
        });
        put("-", new Operation() {
            @Override
            public int eval(int op1, int op2) {
                return op1 - op2;
            }
        });
        put("*", new Operation() {
            @Override
            public int eval(int op1, int op2) {
                return op1 * op2;
            }
        });
        put("/", new Operation() {
            @Override
            public int eval(int op1, int op2) {
                return op1 / op2;
            }
        });
    }};

    public int evalRPN(ArrayList<String> A) {
        Stack<Integer> operands = new Stack<>();
        for (String op : A) {
            if (!operator.containsKey(op)) {
                operands.push(Integer.parseInt(op));
            } else {
                // retrieve the latest two operands from stack and evaluate them
                if (operands.size() >= 2) {
                    int op2 = operands.pop();
                    int op1 = operands.pop();
                    operands.push(operator.get(op).eval(op1, op2));
                }
            }
        }
        return operands.isEmpty() ? 0 : operands.pop();
    }
}
