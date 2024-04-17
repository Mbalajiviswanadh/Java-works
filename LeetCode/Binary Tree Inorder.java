import java.util.*;


class Solution {
    static class TreeNode{
        int val;
        TreeNode left,right;

        TreeNode(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
        
    }
    List<Integer> l=new ArrayList<>();
public List<Integer> inorderTraversal(TreeNode root) {
    if(root==null)
    return new ArrayList<>();

    inorderTraversal(root.left);
    l.add(root.val);
    inorderTraversal(root.right);

    return l;
}
}