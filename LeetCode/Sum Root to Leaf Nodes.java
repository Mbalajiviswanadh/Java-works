import java.util.*;

class Sum_ROottoLeafNodes{
    static TreeNode root;
    static class TreeNode{
        int data;
        TreeNode left, right;

        TreeNode(int data){
            this.data=data;
        }
    }
    public int sumNumberHelpers(TreeNode node,String  curr){

        if(node==null){
            return 0;
        }

        curr+=node.data;
        if(node.left==null && node.right==null)
        return Integer.parseInt(curr);

        return sumNumberHelpers(node.left, curr)+sumNumberHelpers(node.right, curr);

    }


    public int sumNumbers(TreeNode root){
        return sumNumberHelpers(root, "");
    }
    public TreeNode buildTree(Sum_ROottoLeafNodes sumNode, String[] strTree){
        if(strTree[0].equals("N"))
        return null;

        sumNode.root=new TreeNode(Integer.parseInt(strTree[0]));
        Queue<TreeNode> q= new LinkedList<TreeNode>();

        q.add(sumNode.root);
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
                curr.right=new TreeNode(Integer.parseInt(strTree[i]));
                q.add(curr.right);
            }
            i++;
        }
        return sumNode.root;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sum_ROottoLeafNodes sumNode=new Sum_ROottoLeafNodes();
        System.out.println("Build the tree :");
        String[] strTree=sc.nextLine().split(" ");

        sumNode.buildTree(sumNode, strTree);

        System.out.println();

        int res=sumNode.sumNumbers(root);
        System.out.println("The sum is : "+res);

    }
}