/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int kthSmallest(TreeNode root, int k) {
        // Store the root node in a temp memory location
        TreeNode curr = root;
        // while curr != null traverse the tree
        while(curr != null){
            // if curr.left == null then we have reached the end decrement back up the tree and if k == 0 return root val
            if(curr.left == null){
                k--;
                if(k == 0) return curr.val;
                // current node is then set to the right tree to start traverseing 
                curr = curr.right;
            } 
            else {
                // else traverse the left tree

                TreeNode pred = curr.left;
                        // while left tree is not equal to null AND current set it to right
                while(pred.right != null && pred.right != curr) pred = pred.right;
            
                if(pred.right == null){
                    pred.right = curr;
                    curr = curr.left;
                } else {
                    pred.right = null;
                    k--;
                    if(k == 0) return curr.val;
                    curr = curr.right;
                }
            }
        }
        return -1;
    }
}
