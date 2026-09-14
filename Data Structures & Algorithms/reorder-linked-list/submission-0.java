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
    public void reorderList(ListNode head) {
    
        if(head == null){
            return;
        }

        List<ListNode> nodes = new ArrayList<>();
        ListNode cur = head;


        // int i = 0;

        while(cur != null){
            nodes.add(cur);
            cur = cur.next;
        }


        int i = 0, j = nodes.size() - 1;

        System.out.println(j);
        while(i < j){
    
            nodes.get(i).next = nodes.get(j);
            i++;
            if(i >= j){
                break;
            }
            // increment i
            nodes.get(j).next = nodes.get(i);
            // decrement j
            j--;
        }
        nodes.get(i).next = null;
        // -> 0, 1, 2, 3 
        // <- 6, 5, 4
    }
}
