package Trees;

import java.util.*;

class Binary_tree_Builder {
    TreeNode root;
    static class TreeNode{
        TreeNode left,right;
        int data;
        TreeNode(int data){
            this.data=data;
        }
    }
    
    public  void preOrder(TreeNode currroot){
        if(currroot==null){
            return;
        }

        System.out.print(currroot.data+" ");
        preOrder(currroot.left);
        preOrder(currroot.right);   
    }

    public void levelOrder(){
        Queue<TreeNode> q= new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            TreeNode curr=q.poll();
            System.out.print(curr.data+" ");
            if(curr.left!=null){
                q.offer(curr.left);
            }
            if(curr.right!=null){
                q.offer(curr.right);
            }
        }
    }
    public TreeNode buildTree(String strTree[], Binary_tree_Builder bt){
        

        if(strTree[0].equals("N"))
        return null;

        bt.root=new TreeNode(Integer.parseInt(strTree[0]));
        Queue<TreeNode> q= new LinkedList<TreeNode>();
        q.add(bt.root);
        int i=1;
        while(i<strTree.length){
            TreeNode curr=q.poll();
            if(!strTree[i].equals("N")){
                curr.left=new TreeNode(Integer.parseInt(strTree[i]));
                q.add(curr.left);
            }
            i++;
            if(i>=strTree.length){
                break;
            }

            if(!strTree[i].equals("N")){
                curr.right = new TreeNode(Integer.parseInt(strTree[i]));
                q.add(curr.right);
            }
            i++;
        }
        return bt.root;

    }


    public static void main(String[] args) {
        Binary_tree_Builder bt=new Binary_tree_Builder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Build the Tree : ");
        String[] strTree=sc.nextLine().split(" ");
        bt.buildTree(strTree,bt);


        System.out.println("\nPre Order -B_Tree:");
        bt.preOrder(bt.root);
        System.out.println("\nlevel Order-B_Tree:");
        bt.levelOrder();


    }
}
