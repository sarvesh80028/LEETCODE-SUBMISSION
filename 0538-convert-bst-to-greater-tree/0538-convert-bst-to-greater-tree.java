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
    public TreeNode convertBST(TreeNode root) {
        ArrayList<TreeNode>arr = new ArrayList<>();
        inorder(root,arr);
        int temp = 0;
        // int sum = 0;
        int n = arr.size();
        for(int i=n-1;i>=0;i--){
            temp+= arr.get(i).val;
            arr.get(i).val = temp;
            // sum = temp;
        }
        return root;
    }
    private void inorder(TreeNode root,ArrayList<TreeNode>arr){
        if(root==null) return;
        inorder(root.left,arr);
        arr.add(root);
        inorder(root.right,arr);
    }
}