/**
 *************************************************************************
 * Description: 
 * 
 * 
 *
 *************************************************************************
 * @date : Jul 15, 2015
 */
package _02_InsertionSort;

import com.interviewbit.ListNode;

public class Solution {

    public ListNode insertionSortList(ListNode a) {
        ListNode dummy = new ListNode(0);
        ListNode head = a; // head node of the list to be sorted
        while (head != null) {
            // insert node at head to right position in sorting list
            ListNode node = dummy;
            while (node.next != null && node.next.val < head.val) {
                node = node.next;
            }
            // insert new node after this node
            ListNode newHead = head.next;
            head.next = node.next;
            node.next = head;
            head = newHead;
        }
        return dummy.next;
    }

}
