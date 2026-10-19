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

class pair {
    TreeNode node;
    int level;

    pair(TreeNode node, int level) {
        this.node = node;
        this.level = level;
    }
}

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>arr = new ArrayList<>();
        Queue<pair>q = new LinkedList<>();
        q.add(new pair(root,0));
        if(root==null) return arr;
        int size = findLevel(root);
        for(int i=0;i<size;i++){
            arr.add(new ArrayList<>());
        }
        while(q.size()>0){
            pair f = q.remove();
            TreeNode n = f.node;
            int level = f.level;
            arr.get(level).add(n.val);
            if(n.left!=null) q.add(new pair(n.left,level+1));
            if(n.right!=null) q.add(new pair(n.right,level+1));
        }
        return arr;
    }

    private int findLevel(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(findLevel(root.left),findLevel(root.right));
    }
}