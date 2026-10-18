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
    static int d;

    public int diameterOfBinaryTree(TreeNode root) {
        d = 0;
        dfs(root);
        return d;

    }

    private int dfs(TreeNode root) {

        if (root == null)
            return 0;
        int l = dfs(root.left);
        int r = dfs(root.right);
        d = Math.max(l + r, d);
        return 1 + Math.max(l, r);
    }
}