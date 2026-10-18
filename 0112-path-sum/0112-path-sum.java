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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(0,root,targetSum);
    }
    
    private boolean dfs(int sum,TreeNode root,int targetSum){
        if(root==null) return false;
        if(root.left==null && root.right==null){
            sum+= root.val;
            if(sum==targetSum) return true;
            return false;
        }
        sum+= root.val;
        return (dfs(sum,root.left,targetSum) || dfs(sum,root.right,targetSum));
    }
}