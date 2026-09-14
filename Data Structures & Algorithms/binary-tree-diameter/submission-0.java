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
    public int diameterOfBinaryTree(TreeNode root) {
        // longest decision path between any two nodes within the tree
        // len(path l or r)
        if(root == null){
            return 0;
        }



        int leftHeight = maxHeight(root.left);
        int rightHeight = maxHeight(root.right);

        int diameter = leftHeight + rightHeight;
        int sub = max(diameterOfBinaryTree(root.left), diameterOfBinaryTree(root.right));

        return max(diameter, sub);
    }


    public int maxHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        return 1 + max(maxHeight(root.left), maxHeight(root.right));
    }


    public int max(int a, int b){
        return (a >= b) ? a : b;
    }
}
