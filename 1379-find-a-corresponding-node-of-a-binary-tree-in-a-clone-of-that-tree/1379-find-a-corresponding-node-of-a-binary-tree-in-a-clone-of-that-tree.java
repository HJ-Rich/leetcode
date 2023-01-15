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
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        return search(cloned, target.val);
    }

    private final TreeNode search(final TreeNode treeNode, final int target) {
        if (treeNode == null) {
            return null;
        }

        if (treeNode.val == target) {
            return treeNode;
        }

        final TreeNode left = search(treeNode.left, target);
        if (left != null) {
            return left;
        }

        return search(treeNode.right, target);
    }
}