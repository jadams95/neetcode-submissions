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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        TreeNode node = root;
        while(node != null){
            if(node.right == null){
                res.add(node.val);
                node = node.left;
            } else {
                TreeNode prev = node.right;
                while(prev.left != null && prev.left != node){
                    prev = prev.left;
                }
                if(prev.left == null){
                    res.add(node.val);
                    prev.left = node;
                    node = node.right;
                } else {
                    prev = null;
                    node = node.left;
                }
            }
        }
        Collections.reverse(res);
        return res;
    }
}