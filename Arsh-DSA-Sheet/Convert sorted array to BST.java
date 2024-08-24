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

    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    public TreeNode solve(int[] nums, int left, int right){
        if(left > right)
        return null;

        int mid=left+(right-left)/2;

        TreeNode root= new TreeNode(nums[mid]);

        root.left=solve(nums, left, mid-1);
        root.right=solve(nums, mid+1, right);

        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {

        if(nums.length==0)
        return null;

        return solve(nums, 0, nums.length-1);        
        // for(int i=0;i<nums.length;i++){

        //     if(root.val>nums[i]){
        //         TreeNode newleft= new TreeNode(nums[i]);
        //         if(root.left!=null){
        //             if(root.left.val<newleft.val)
        //             root.left.right=newleft;
        //             else
        //             root.left.left=newleft;
        //         }
        //         root.left=newleft;
        //     }
        //     else if(root.val<nums[i]){
        //         TreeNode newright = new TreeNode(nums[i]);
        //         if(root.right!=null){
        //             if(root.right.val<newright.val)
        //             root.right.right=newright;
        //             else
        //             root.right.left=newright;
        //         }
        //         root.right=newright;
        //     }
        //     else if(root.val==nums[i])
        //     i++;            
        // }
        // return root;

    }
}