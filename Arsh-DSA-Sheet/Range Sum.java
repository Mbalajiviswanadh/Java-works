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

    static int sum;
    public void solve(TreeNode root, int l, int h){

        if(root!=null){

            if(root.val >=l && root.val<=h)
            sum+=root.val;

            if(root.val > l)
            solve(root.left, l, h);

            if(root.val < h)
            solve(root.right, l, h);
        }
    }
    public int rangeSumBST(TreeNode root, int low, int high){
        sum=0;
        solve(root, low, high);
        return sum;
    }
    // public int rangeSumBST(TreeNode root, int low, int high) {
    //     int sum=0;

    //     Stack<TreeNode> stack = new Stack<>();

    //     stack.push(root);

    //     while(!stack.isEmpty()){
    //         TreeNode currNode = stack.pop();

    //         if(currNode.val >=low && currNode.val <=high){
    //             sum+=currNode.val;
    //         }

    //         if(currNode.val > low && currNode.left != null)
    //         stack.push(currNode.left);

    //         if(currNode.val < high && currNode.right !=null)
    //         stack.push(currNode.right);

    //     }
    //     return sum;
    // }
}