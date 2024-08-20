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

    public boolean ischeck(TreeNode left, TreeNode right){
        if(left==null && right==null)
        return true;

        if(left==null || right==null)
        return false;

        if(left.val==right.val){
            return ischeck(left.left,right.right) && ischeck(left.right, right.left);
        }
        return false;
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
        return true;

        return ischeck(root.left,root.right);
    }
}