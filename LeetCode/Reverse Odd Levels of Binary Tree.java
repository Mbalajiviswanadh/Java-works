import java.util.*;
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
    public void helper(TreeNode left, TreeNode right, int level){
        // if left and right are null-> return 

        if(left==null || right ==null)
        return;

        if(level%2!=0){
            int temp = left.val;
            left.val = right.val;
            right.val = temp;
        }

        helper(left.left, right.right, level+1);
        helper(left.right, right.left, level+1);
    }
    public TreeNode reverseOddLevels(TreeNode root) {
        // taking a helper function
        // and passing root -> left and right nodes as parameters and level
        // we will increase the level++ 
        // when level is odd  we will swap the left and right notes 
        // we are only making changes in the root -> tree, without creating a new space for treenode
        if(root==null)
        return null;

        
        helper(root.left, root.right, 1);

        return root;

    }


}