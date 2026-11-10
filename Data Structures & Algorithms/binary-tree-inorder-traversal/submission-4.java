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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        TreeNode node = root;

        // First Step in Morris Traversal: check if the node is not equal to null
        while(node != null){
            // Second step: check if the left parent is equal to null
            if(node.left == null){
                // Then we add the value to result array and make the node = right parent
                res.add(node.val);
                // handle right side of the node
                node = node.right;
            } else {
                TreeNode prev = node.left;
                
                System.out.println(node.val);
                // checks if the right parent of prev is not equal to node in memory
                while(prev.right != null && prev.right != node){
                    prev = prev.right;
                }
                // two if condition to handle if the right or left parent is null
                if(prev.right == null){
            
                    prev.right = node;
                    node = node.left;
                } else {
                    // 
                    prev.right = null;
                    res.add(node.val);
                    node = node.right;
                }
            }
        }
        return res;
    }
}