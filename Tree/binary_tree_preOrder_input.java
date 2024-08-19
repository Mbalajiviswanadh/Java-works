package Tree;

import java.util.*;
class binary_tree_preOrder_input {
    
    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    
    public static class BinaryT{
        static int idx=-1;
        public static TreeNode binarytree(String nodes[]){
            idx++;
            int n=Integer.parseInt(nodes[idx]);
            if(n==-1)
            return null;

            TreeNode newNode= new TreeNode(n);

            newNode.left=binarytree(nodes);
            newNode.right=binarytree(nodes);

            return newNode;
        }
    }

    public static void print_preOrder(TreeNode root){
        if(root==null)
        return;
        System.out.print(root.data+" ");

        print_preOrder(root.left);
        print_preOrder(root.right);
    }

    public static void print_inOrder(TreeNode root){
        if(root ==null)
        return;

        print_inOrder(root.left);
        System.out.print(root.data+" ");
        print_inOrder(root.right);
    }

    public static void print_postOrder(TreeNode root){
        if(root ==null)
        return;

        print_postOrder(root.left);
        print_postOrder(root.right);
        System.out.print(root.data+" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nodes[]= sc.nextLine().split(" ");
        BinaryT bt= new BinaryT();
       TreeNode res = bt.binarytree(nodes);

       print_preOrder(res);
       System.out.println();
       print_inOrder(res);   
       System.out.println();
       print_postOrder(res);     

    }
}
