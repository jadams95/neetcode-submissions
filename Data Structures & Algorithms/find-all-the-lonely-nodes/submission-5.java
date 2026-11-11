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
        ArrayDeque<TreeNode> que = new ArrayDeque<>();
        List<Integer> res = new ArrayList<>();


        if(root != null){
            que.push(root);
        }

        while(!que.isEmpty()){
            TreeNode node = que.pop();

            if(node.left != null && node.right == null) res.add(node.left.val);
            if(node.right != null && node.left == null) res.add(node.right.val);
            if(node.left != null) que.push(node.left);
            if(node.right != null) que.push(node.right);
        }


        return res;
    }
}
