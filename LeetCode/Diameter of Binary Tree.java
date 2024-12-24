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
    public int findDia(TreeNode root, int dia[]){
        if(root==null)
        return 0;

        int leftHeight = findDia(root.left,dia);
        int rightHeight =findDia(root.right, dia);

        dia[0]=Math.max(leftHeight+rightHeight, dia[0]);

        return 1+Math.max(leftHeight, rightHeight);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int dia[]= new int[1];

        findDia(root,dia);
        return dia[0];
    }
}