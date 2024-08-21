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
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    public TreeNode invertTree(TreeNode root) {
        if(root ==null)
        return root;

        TreeNode leftsub=invertTree(root.left);
        TreeNode rightsub=invertTree(root.right);

        root.left=rightsub;
        root.right=leftsub;

        return root;
    }
}