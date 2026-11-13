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

        while(node != null){
            if(node.left == null){
                res.add(node.val);
                node = node.right;
            } else {
                TreeNode prev = node.left;

                while(prev.right != null && prev.right != node){
                    prev = prev.right;
                }

                if(prev.right == null){
                    prev.right = node;
                    node = node.left;
                } else {
                    prev.right = null;
                    res.add(node.val);
                    node = node.right;
                }

            }
        }
        return res;
    }
}