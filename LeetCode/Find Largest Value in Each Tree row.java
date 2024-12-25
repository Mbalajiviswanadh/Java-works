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

    public void helper(TreeNode root, int level, List<List<Integer>> vals){
        if(root==null)
        return;
        //If this level doesn't exist in vals, add a new list for this level
        if(vals.size() == level)
        vals.add(new ArrayList<>());

        vals.get(level).add(root.val);

        helper(root.left, level+1, vals);
        helper(root.right, level+1, vals);
    }
    public List<Integer> largestValues(TreeNode root) {
        List<List<Integer>> vals = new ArrayList<>();
        helper(root, 0, vals);

        List<Integer> res = new ArrayList<>();

        for(List<Integer> i : vals){
            res.add(Collections.max(i));
        }

        return res;

    }
}