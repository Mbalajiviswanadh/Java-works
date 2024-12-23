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
    public int maxDepth(TreeNode root) {
        /* Using -> DFS*/

        if(root==null)
        return 0;

        int leftDepth= maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return Math.max(leftDepth, rightDepth)+1;


        
        // using BFS:

        // if(root==null)
        // return 0;

        // Queue<TreeNode> q= new LinkedList<>();
        // q.add(root);

        // int level=0;
        
        // while(!q.isEmpty()){

        //     int size = q.size();


        //     for(int i=0;i<size;i++){

        //         TreeNode curr = q.poll();

        //         if(curr.left!=null)
        //         q.add(curr.left);

        //         if(curr.right!=null)
        //         q.add(curr.right);

        //     }
        //     level++;
        // }
        // return level;


    }
}