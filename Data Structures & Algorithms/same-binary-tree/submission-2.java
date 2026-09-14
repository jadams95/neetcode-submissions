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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Base Case for Tree problem 
        if(p == null && q == null){
            return true;
        }

// p != null && q != null can be null if val is not set

    //     p.left != null 
    //     && q.left != null 
    //     && p.right != null 
    //     && q.right != null) &&
    //    (p.left.val == q.left.val && p.right.val == q.right.val && ) 
        if(p != null && q != null && p.val == q.val){
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        } else {
            return false;
        }
    }
}
