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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        TreeNode node = root;
        while(node != null){
            // Same setup between pre-order, in-order, post-order traversal with  morris traversal
            if(node.left == null){
                result.add(node.val);
                node = node.right;
            } else {
                TreeNode prev = node.left;
                while(prev.right != null && prev.right != node){
                    prev = prev.right;
                }
                if(prev.right == null){
                    result.add(node.val);
                    prev.right = node;
                    node = node.left;
                } else {
                    prev.right = null;
                    node = node.right;
                }
            
            }
        }
        return result;
    }
}