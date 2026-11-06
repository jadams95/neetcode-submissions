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
        List<Integer> result = new ArrayList<>();
        // Set it to a current node to peer into
        TreeNode current = root;
        
        // loop over each one like a Link List till its not equal null
        while(current != null){
            
            // 
            if(current.left == null){
                result.add(current.val);
                // Setting it to the next memory position to peer into memory
                current = current.right;
            } else {

                TreeNode prev = current.left;
                while (prev.right != null && prev.right != current) {
                    prev = prev.right;
                }
                
                if(prev.right == null){
                    prev.right = current;
                    current = current.left;
                }
                else {
                    prev.right = null;
                    result.add(current.val);
                    current = current.right;
                }
            }
        }
        return result;
    }
}