package Tree;

import java.util.*;

class Count_ofNodes {
    
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
    
    public static class BinaryTree{

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

    public static int countofnodes(TreeNode root){

        if(root==null)
        return 0;

        int leftsubTree= countofnodes(root.left);
        int rightsubTree= countofnodes(root.right);

        return leftsubTree+rightsubTree+1;
    }
    



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nodes[]= sc.nextLine().split(" ");
        BinaryTree bt= new BinaryTree();
        TreeNode res = bt.binarytree(nodes);

        System.out.println();
        int count=  countofnodes(res);
        System.out.println(count);
        
    }
}
