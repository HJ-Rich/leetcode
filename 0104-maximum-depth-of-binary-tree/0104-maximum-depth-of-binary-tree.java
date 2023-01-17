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
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return Math.max(search(root.left, 1), search(root.right, 1));
    }

    private int search(final TreeNode treeNode, final int depth) {
        if (treeNode == null) {
            return depth;
        }

        return Math.max(search(treeNode.left, depth + 1), search(treeNode.right, depth + 1));
    }
}
