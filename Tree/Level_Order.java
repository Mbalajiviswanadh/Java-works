package Tree;

import java.util.*;
class LevelOrder {
    
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
    public static void print_levelOrder(TreeNode root){
        if(root == null)
        return;

        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            TreeNode curr= q.remove();

            if(curr==null){
                System.out.println();
                
                if(q.isEmpty())
                break;
                else
                q.add(null);
            }
            else{
                System.out.print(curr.data+" ");
                
                if(curr.left!=null)
                q.add(curr.left);
                if(curr.right!=null)
                q.add(curr.right);
            }
        }
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nodes[]= sc.nextLine().split(" ");
        BinaryTree bt= new BinaryTree();
        TreeNode res = bt.binarytree(nodes);

        print_levelOrder(res);
        
    }
}