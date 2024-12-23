import java.util.*;
class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        
        // 1. we have adj array list = neighbour nodes
        // 2. vertex = v
        // 3. to perform bfs, we use Queue Data Structure
        // 4. and one visited array 
        // 5. add the nodes into the queue if the node is not visited, and make it visited after adding
        
        ArrayList<Integer> bfs_res = new ArrayList<>();
        
        boolean visited[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        
        q.add(0);
        visited[0]=true;
        
        while(!q.isEmpty()){
            
            Integer currNode = q.poll();
            bfs_res.add(currNode);
            
            for(Integer i: adj.get(currNode)){
                
                if(visited[i]==false){
                    visited[i]=true;
                    q.add(i);
                }
            }
        }
        return bfs_res;
    }
}