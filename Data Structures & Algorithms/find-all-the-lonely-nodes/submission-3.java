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
    public List<Integer> getLonelyNodes(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        ArrayDeque<TreeNode> queue = new ArrayDeque<TreeNode>();

        if(root != null){
            queue.push(root);
        }

        while(!queue.isEmpty()){
            TreeNode node = queue.pop();
            if(node.left != null && node.right == null) result.add(node.left.val);
            if(node.right != null && node.left == null) result.add(node.right.val);
            if(node.left != null) queue.push(node.left);
            if(node.right != null) queue.push(node.right);

        }
        
        return result;
    }
}
