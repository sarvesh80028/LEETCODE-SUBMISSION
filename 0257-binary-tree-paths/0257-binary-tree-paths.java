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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String>result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        ans(root,sb,result);
        return result;
    }
    private void ans(TreeNode root,StringBuilder sb,List<String>result){
        int n = sb.length();
        if(root==null) return;
        if(root.left==null && root.right==null){
            sb.append(Integer.toString(root.val));
            StringBuilder x = new StringBuilder(sb);
            result.add(x.toString());
            sb.delete(n,sb.length());
            return;
        }
        // int n = sb.length();
        sb.append(Integer.toString(root.val));
        sb.append("->");
        ans(root.left,sb,result);
        ans(root.right,sb,result);
        sb.delete(n,sb.length());
    }
}