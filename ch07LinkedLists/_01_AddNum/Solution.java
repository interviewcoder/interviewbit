/**
 *************************************************************************
 * Description: 
 * 
 * 
 *
 *************************************************************************
 * @date : Jul 15, 2015
 */
package _01_AddNum;

import com.interviewbit.ListNode;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {

    public ListNode addTwoNumbers(ListNode a, ListNode b) {
        int carry = 0;
        ListNode l1 = a;
        ListNode l2 = b;
        ListNode dummy = new ListNode(0);
        ListNode node = null;
        node = dummy;
        // until both list ends and no positive carry to add on
        while (l1 != null || l2 != null || carry > 0) {
            int n1 = 0;
            int n2 = 0;
            if (l1 != null) {
                n1 = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                n2 = l2.val;
                l2 = l2.next;
            }
            int num = n1 + n2 + carry;
            // digit in this position
            node.next = new ListNode(num % 10);
            carry = num / 10;
            node = node.next;
        }
        return dummy.next;
    }

}

