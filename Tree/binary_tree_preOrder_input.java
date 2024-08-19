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
        public static TreeNode binarytree(List<Integer> nodes){
            idx++;
            if(nodes.get(idx)==-1)
            return null;

            TreeNode newNode= new TreeNode(nodes.get(idx));

            newNode.left=binarytree(nodes);
            newNode.right=binarytree(nodes);

            return newNode;
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> nodes = new ArrayList<>();
        while(true){
            
            String i=sc.nextLine();
            if(i.isEmpty())
            break;


            int data=Integer.parseInt(i);
            nodes.add(data);
        }

        BinaryT bt=new BinaryT();
        
        TreeNode res =bt.binarytree(nodes);

        System.out.println(res);


        sc.close();
    }
}
