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
    public boolean isSymmetric(TreeNode root) {
        mirror(root.left);
        return ans(root.left,root.right);
    }
    private void mirror(TreeNode root){
        if(root==null) return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirror(root.left);
        mirror(root.right);
    }
    private boolean ans(TreeNode r1,TreeNode r2){
        if(r1==null && r2==null) return true;
        if(r1==null || r2==null) return false;
        if(r1.val!=r2.val) return false;
        if(ans(r1.left,r2.left)==false) return false;
        if(ans(r1.right,r2.right)==false) return false;
        return true;
    }
}