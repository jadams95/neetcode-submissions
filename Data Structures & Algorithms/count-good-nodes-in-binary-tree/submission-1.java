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
    public int goodNodes(TreeNode root) {
        int count = dfs(root, root.val);
        return count;
    }

    /**
    * First key improvement is to label the recursive funciton TreeNode to node
    */
    private int dfs(TreeNode node, int maxVal){

        if(node == null){
            return 0;
        }
        int res = (node.val >= maxVal) ? 1 : 0;
        // updates the new value for maxVal to allow the conditional check
        maxVal = max(maxVal, node.val);
        res += dfs(node.left, maxVal);
        res += dfs(node.right, maxVal);
        return res;
    }

    public int max(int a, int b){
        return (a >= b) ? a : b;
    }
}
