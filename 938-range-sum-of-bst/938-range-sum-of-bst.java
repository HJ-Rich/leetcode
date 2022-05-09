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
    public int rangeSumBST(TreeNode root, int low, int high) {
        return getSum(root, low, high);
    }
    
    private int getSum(TreeNode root, int lowInclusive, int highInclusive) {
        if (Objects.isNull(root)) {
            return 0;
        }

        int sum = 0;
        if (root.val <= highInclusive && root.val >= lowInclusive) {
            sum += root.val;
        }

        sum += getSum(root.left, lowInclusive, highInclusive);
        sum += getSum(root.right, lowInclusive, highInclusive);

        return sum;
    }
}