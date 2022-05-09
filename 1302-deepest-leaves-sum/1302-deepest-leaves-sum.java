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
    public int deepestLeavesSum(TreeNode root) {
        final Map<Integer, Integer> sum = new HashMap<>();
        getSum(root, 0, sum);

        final int maxDepth = sum.keySet()
                .stream()
                .mapToInt(Integer::valueOf)
                .max()
                .orElse(0);
        
        return sum.get(maxDepth);
    }
    
    private void getSum(TreeNode root, int depth, Map<Integer, Integer> sum) {
        if (Objects.isNull(root)) {
            return;
        }

        sum.merge(depth, root.val, Integer::sum);
        depth++;

        getSum(root.left, depth, sum);
        getSum(root.right, depth, sum);
    }
}