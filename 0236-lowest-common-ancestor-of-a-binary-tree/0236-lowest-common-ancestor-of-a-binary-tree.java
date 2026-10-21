/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<ArrayList<TreeNode>>result = new ArrayList<>();
        ArrayList<TreeNode>arr = new ArrayList<>();
        dfs(root,p,q,arr,result);
        int m = result.get(0).size();
        // int n = result.get(i).size();
        int i = 0;
        TreeNode lca = null;
        while(i<m){
            if(result.get(0).get(i).val==result.get(1).get(i).val) lca = result.get(0).get(i);
            else break;
            i++;
        }
    return lca;
    }
    private void dfs(TreeNode root,TreeNode p,TreeNode q,ArrayList<TreeNode>arr,ArrayList<ArrayList<TreeNode>>result){
        if(root==null) return;
        // if(root.val==p.val || root.val==q.val) result.add(new ArrayList<>(arr));
        arr.add(root);
        if(root.val==p.val || root.val==q.val) result.add(new ArrayList<>(arr));
        dfs(root.left,p,q,arr,result);
        dfs(root.right,p,q,arr,result);
        arr.remove(arr.size()-1);
    }
}