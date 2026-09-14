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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // ListNode dummy = new ListNode(0);
        // ListNode node = dummy;

        // Base Case is when it doesn't have a number like case 2 just return the other list;
        // where can we condense the problem and solve the sub optimal problem
        // this statement becomes the base case if it null then return other list 
        // if(list1 != null){
        //     node.next = list1;
        // } else {
        //     node.next = list2;
        // }
        
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }







        // look at the iterative case then recursive sub problem
        // traversing the two Singley Linked Lists
        // the recursive case is seeing if the current value of list 1 or list 2 is less than the next value in list1 or list2
        if(list1.val <= list2.val){
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
            } 
            else {
                list2.next = mergeTwoLists(list1, list2.next);
                return list2;
            }
    }
}