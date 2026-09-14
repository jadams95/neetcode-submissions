/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {

        if (head == null){
            return null;
        }
        ListNode newHead = head;
        // ListNode prev = null;
        // ListNode current = head;
            // ListNode temp = current.next;
            // current.next = prev;
            // prev = current;
            // current = temp;
            if(newHead.next != null){
               newHead = reverseList(head.next);
               head.next.next = head;
        }
        head.next = null;

        return newHead;
    }
}
