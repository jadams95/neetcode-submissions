class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0){
            return null;
        }

        TreeNode root = new TreeNode(0);
        Stack<int[]> stack = new Stack<>();
        Stack<TreeNode> nodes = new Stack<>();
        stack.push(new int[]{0, nums.length - 1});
        nodes.push(root);
        
        while(!stack.isEmpty()){
            int[] range = stack.pop();
            TreeNode node = nodes.pop();
            int l = range[0], r = range[1];
            int m = (l + r) / 2;
            node.val = nums[m];

            if(l <= m - 1){
                node.left = new TreeNode(0);
                stack.push(new int[]{l, m - 1});
                nodes.push(node.left);
                            }

            if(m + 1 <= r){
                node.right = new TreeNode(0);
                stack.push(new int[] {m + 1, r});
                nodes.push(node.right);
            }

        }
        return root;
    }
}
