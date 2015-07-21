/**
 *************************************************************************
 * Description: 
 * 
 * 
 *
 *************************************************************************
 * Leetcode 148
 * @date : Jul 20, 2015
 */
package _03_SortList;

import com.interviewbit.ListNode;

/** see test {@link _03_SortList.SolutionTest } */
public class Solution {
    
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        // find the middle node
        ListNode fast = head.next;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        // cut list into two halves
        ListNode second = slow.next;
        slow.next = null;
        
        // merge sort two parts
        ListNode head1 = sortList(head);
        ListNode head2 = sortList(second);
        ListNode dummy = new ListNode(-1);
        ListNode node = dummy;
        while (head1 != null && head2 != null) {
            if (head1.val < head2.val) {
                node.next = head1;
                head1 = head1.next;
            } else {
                node.next = head2;
                head2 = head2.next;
            }
            node = node.next;
        }
        // merge the remaining part
        node.next = head1 != null ? head1 : head2;
        return dummy.next;
    }

}
