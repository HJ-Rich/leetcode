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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return search(p, q);
    }
    
    public boolean search(TreeNode leftNode, TreeNode rightNode) {
        if (leftNode == null && rightNode == null) {
            return true;
        }

        if (leftNode == null && rightNode != null || leftNode != null && rightNode == null) {
            return false;
        }

        if (leftNode.val != rightNode.val) {
            return false;
        }

        if (hasSameValueWithoutAnyMoreChildren(leftNode, rightNode)) {
            return true;
        }

        if (hasDifferentNullChildren(leftNode, rightNode)) {
            return false;
        }

        return search(leftNode.left, rightNode.left) && search(leftNode.right, rightNode.right);
    }

    private boolean hasSameValueWithoutAnyMoreChildren(TreeNode leftNode, TreeNode rightNode) {
        boolean hasSameValue = leftNode.val == rightNode.val;
        boolean noMoreChildOnLeft = leftNode.left == null && leftNode.right == null;
        boolean noMoreChildOnRight = rightNode.left == null && rightNode.right == null;
        
        if (noMoreChildOnLeft && noMoreChildOnRight && hasSameValue) {
            return true;
        }
        
        return false;
    }

    private boolean hasDifferentNullChildren(TreeNode leftNode, TreeNode rightNode) {
        if (leftNode.left == null && rightNode.left != null ||
                leftNode.left != null && rightNode.left == null ||
                leftNode.right == null && rightNode.right != null ||
                leftNode.right != null && rightNode.right == null) {
            return true;
        }
        
        return false;
    }
}
