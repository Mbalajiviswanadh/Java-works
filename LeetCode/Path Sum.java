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

    public boolean helperFunc(TreeNode root, int ts, int currSum){
        if(root== null)
        return false;

        if(root.left==null && root.right==null){

            if(currSum+root.val==ts)
            return true;
            else
            return false;
        }
        return helperFunc(root.left, ts, currSum+root.val) || helperFunc(root.right, ts, currSum+root.val);
    }
    public boolean hasPathSum(TreeNode root, int ts) {
        
        if(root==null){
            return false;
        }
        return helperFunc(root, ts, 0);

    }
}