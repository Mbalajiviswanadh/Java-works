import java.util.*;
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
    public int minimumOperations(TreeNode root) {
        
        if(root ==null)
        return 0;


        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);
        
        int op_count=0;

        while(!q.isEmpty()){
            int size =q.size();

            List<Integer> og_level= new ArrayList<>();
            
            for(int i=0;i<size;i++){
                TreeNode node = q.poll();
                og_level.add(node.val);

                if(node.left!=null)
                q.add(node.left);
                if(node.right!=null)
                q.add(node.right);
            }

            List<Integer> sortedLevel = new ArrayList<>(og_level);

            Collections.sort(sortedLevel);

            Map<Integer, Integer> map = new HashMap<>();

            for(int i=0;i<og_level.size();i++){
                map.put(og_level.get(i),i);  //mapping the level values with idx
            }

            for(int i=0;i<og_level.size();i++){
                //if value of og_level is not equal to sotedLevel -> increase the op_count and swap the values
                while(!og_level.get(i).equals(sortedLevel.get(i))){ 
                    op_count++;

                    // getting the idx where og_level is not equal
                    int curr = map.get(sortedLevel.get(i));

                    map.put(og_level.get(i), curr);
                    Collections.swap(og_level, i, curr);
                }
            }
        }
        return op_count;
    }
}