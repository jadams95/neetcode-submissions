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
    public int maxPathSum(TreeNode root) {
        int[] res = new int[]{root.val};
        dfs(root, res);
        System.out.println(Arrays.toString(res));
        return res[0]; 
    }

    private int dfs(TreeNode root, int[] res){
        if(root == null){
            return 0;
        }

        int leftMax = Math.max(dfs(root.left, res), 0);
        System.out.println(Arrays.toString(res));
        System.out.println(leftMax);
        int rightMax = Math.max(dfs(root.right, res), 0);
                System.out.println(Arrays.toString(res));

        System.out.println(rightMax);

        res[0] = Math.max(res[0], root.val + leftMax + rightMax);
        return root.val + Math.max(leftMax, rightMax);
    }
}
