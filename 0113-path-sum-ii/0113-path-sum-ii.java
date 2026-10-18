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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        dfs(0, root, targetSum, current, result);
        return result;
    }

    private void dfs(int sum, TreeNode root, int targetSum, List<Integer> current, List<List<Integer>> result) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) {
            sum += root.val;
            current.add(root.val);
            if (sum == targetSum) {
                result.add(new ArrayList<>(current));
            }
            current.remove(current.size() - 1);
            return;
        }
        current.add(root.val);
        sum += root.val;
        dfs(sum, root.left, targetSum, current, result);
        dfs(sum, root.right, targetSum, current, result);
        current.remove(current.size() - 1);
    }
}