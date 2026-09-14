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
//  1 + 2 ^ level
class Solution {
    int preIdx = 0;
    int inIdx = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        // System.out.println((preorder.length - 1) * 2);
        // TreeNode inOrderNode = new TreeNode(inorder[1]);
        // TreeNode preOrderNode = new TreeNode(preorder[0]);


        // TreeNode[] res;
        // if(preorder.length == inorder.length){
        //     res = new TreeNode[inorder.length];
        // }
        // // if(preOrderNode == null && inOrderNode == null){
        // //     res[height--] = null;
        // // }

        // return preOrderNode;

        return dfs(preorder, inorder, Integer.MAX_VALUE);
    }

    public TreeNode dfs(int[] preorder, int[] inorder, int limit){
        if(preIdx >= preorder.length) return null;
        if(inorder[inIdx] == limit){
            inIdx++;
            return null;
        }
        TreeNode root = new TreeNode(preorder[preIdx++]);
        root.left = dfs(preorder, inorder, root.val);
        root.right = dfs(preorder, inorder, limit);

        return root;
    }
}
