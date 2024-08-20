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
import java.util.*;
class Solution {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode (int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    private int diameter = 0;

    public int helper(TreeNode root, List<Integer> list) {
        if (root == null) {
            list.add(-1);  // Store -1 when a null node is encountered
            return 0;
        }

        // Recursively get the height of the left and right subtrees
        int leftHeight = helper(root.left, list);
        list.add(root.val);  // Store the value of the current node
        int rightHeight = helper(root.right, list);

        // Update the diameter if the current node gives a larger diameter
        diameter = Math.max(diameter, leftHeight + rightHeight);

        // Return the height of the current node
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root, list);
        return diameter;
    }
}