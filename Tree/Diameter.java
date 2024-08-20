
package Tree;

import java.util.*;

class Diamater {
    
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

     static class TreeInfo{
        int h;
        int dia;

        TreeInfo(int h, int dia){
            this.h=h;
            this.dia=dia;
        }
    }
    
    public static TreeInfo diameteroftree(TreeNode root){

        if(root==null)
        return new TreeInfo(0, 0);

        TreeInfo leftsub=diameteroftree(root.left);
        TreeInfo rightsub=diameteroftree(root.right);

        int myheight = Math.max(leftsub.h, rightsub.h)+1;
        
        int diam1=leftsub.dia;
        int diam2=leftsub.dia;
        int diam3=leftsub.h + rightsub.h+1;

        int mydia = Math.max(Math.max(diam1,diam2), diam3);

        TreeInfo resInfo = new TreeInfo(myheight, mydia);

        return resInfo;

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nodes[]= sc.nextLine().split(" ");
        BinaryTree bt= new BinaryTree();
        TreeNode res = bt.binarytree(nodes);

        System.out.println();
        System.out.println("Diameter :");
        System.out.print(diameteroftree(res).dia);

        
    }
}
