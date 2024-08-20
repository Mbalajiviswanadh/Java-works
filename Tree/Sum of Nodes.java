
package Tree;

import java.util.*;

class SumOfNodes {
    
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

    public static int sumofnodes(TreeNode root){

        if(root==null)
        return 0;

        int lsum= sumofnodes(root.left);
        int rsum= sumofnodes(root.right);

        return lsum+rsum+root.data;
    }
    



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nodes[]= sc.nextLine().split(" ");
        BinaryTree bt= new BinaryTree();
        TreeNode res = bt.binarytree(nodes);

        System.out.println();
        int sum=  sumofnodes(res);
        System.out.println(sum);
        
    }
}
