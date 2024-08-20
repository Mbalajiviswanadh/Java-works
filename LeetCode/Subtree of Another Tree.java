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
    public boolean issame(TreeNode root, TreeNode subroot){

        if(root==null && subroot==null)
        return true;

        if(root==null || subroot==null)
        return false;

        if(root.val==subroot.val){
            return issame(root.left,subroot.left) && issame(root.right, subroot.right);
        }
        return false;
    }
    public boolean isSubtree(TreeNode root, TreeNode subroot) {
        if(subroot==null)
        return true;

        if(root==null)
        return false;


        if(root.val==subroot.val){
            if(issame(root,subroot))
            return true;
        }
        
        return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
    }
}