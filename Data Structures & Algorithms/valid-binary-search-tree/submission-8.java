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
    public boolean isValidBST(TreeNode root) {
        return dfs(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public boolean dfs(TreeNode node, int left, int right){
        if(node == null){
            // need to return 0, or return nothing 
            // break;
            return true;
        }
        // if(node.left == null || node.right == null && node != null){
        //     return true;
        // }


        if(!(left < node.val  && node.val < right)){
            return false;
        }
        // if(node != null && node.left == null && node.right == null){
        //     return true;
        // }
        // if(((node.left.val < node.val && node.left.val < node.right.val) && node.val < node.right.val)){
        //     return true;
        // }

        // 
        // left subleaf should be less than < right sibling and parent
        
        
        // boolean result = ((node.left.val < node.right.val && node.val) && node.val < node.right.val) ? dfs() || dfs()
        return (dfs(node.left, left, node.val) && dfs(node.right, node.val, right));
    }
}
