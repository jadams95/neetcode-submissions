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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // we had parts of the setup but I wasn't sure about the 
        // dummy node point to the cur from previous problem 
        ListNode dummy = new ListNode();
        ListNode cur = dummy;

        int carry = 0;


        // val > 0
        // single digit
        //  l1 && l2
        // l1 len l2 len
        // l1 9 + 9  == little endian
        // ListNode curr =
        while(l1 != null || l2 != null || carry != 0){
            int v1 = (l1 != null) ? l1.val : 0;
            int v2 = (l2 != null) ? l2.val : 0;

            int val = v1 + v2 + carry;
            carry = val / 10;
            val = val % 10;
            cur.next = new ListNode(val);
            cur = cur.next;
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }
        // if(l1.next == null && l2.next == null){
        //     // logic for creating temp addTwoNumbers;
        //     return temp;
        // }
        // while(l1.next != null){
        //     if(l1.next.val < 9){
        //     // logic for adding 
        // } else {

        //     }
        // }
        // ListNode temp = new ListNode();
        // int curCountTble = 0;
        // while(l1.next != null  && l2.next != null){
        //     curCountTble += l1.next.val + l2.next.val

            // if(curCountTble > 9){
            //     curCountTble += 1;
            //     ListNode carriedNum = new ListNode(curCountTble);
            //     temp.next = carriedNum;
            // }
        // }
        return dummy.next;
    }
}
