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
    List<Integer> tree = new ArrayList<>();
    
    public List<Integer> rightSideView(TreeNode root) {
        dfs(root, 0);
        return tree;
    }

    public void dfs(TreeNode node, int depth){
        if(node == null){
            return;
        }

        if(tree.size() == depth){
            tree.add(node.val);
        }

        dfs(node.right, depth + 1);
//  we are still at level 1 so we do not add the node
        dfs(node.left, depth + 1);
    }
}
