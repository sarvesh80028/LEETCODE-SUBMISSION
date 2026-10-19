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
 class pair{
    TreeNode node;
    int level;
    pair(TreeNode node,int level){
        this.level = level;
        this.node = node;
    }
 }
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>>arr = new ArrayList<>();
        int size = level(root);
        if(root==null) return arr;
        for(int i=0;i<size;i++) arr.add(new ArrayList<>());
        Queue<pair>q = new LinkedList<>();
        q.add(new pair(root,0));
        while(q.size()>0){
            pair f = q.remove();
            int level = f.level;
            TreeNode n = f.node;
            arr.get(level).add(n.val);
            if(n.left!=null) q.add(new pair(n.left,level+1));
            if(n.right!=null) q.add(new pair(n.right,level+1));
        }
        Collections.reverse(arr);
        return arr;
    }
    private int level(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(level(root.left),level(root.right));
    }
}