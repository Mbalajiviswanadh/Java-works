import java.util.*;
class Solution {
    List<Integer> circuit;
    void dfs(Map<Integer, List<Integer>> graph, int u){


        while(graph.containsKey(u) && !graph.get(u).isEmpty()){
            int v=graph.get(u).remove(0);
            dfs(graph,v);
        }
        circuit.add(u);
    }

    public int[][] validArrangement(int[][] pairs) {
        // (U,V) we have to decrease the map values by -1 for -> U 
        // and for V we have to increase the map values by +1 for -> V

        Map<Integer, List<Integer>> graph = new HashMap<>();

        Map<Integer, Integer> node = new HashMap<>();

        for(int[] i : pairs){

            if(!graph.containsKey(i[0])){
                graph.put(i[0], new ArrayList());
            }

            graph.get( i[0]).add(i[1]);

            node.put(i[0], node.getOrDefault(i[0], 0)-1);  // -> U
            node.put(i[1], node.getOrDefault(i[1], 0)+1);  // -> V
        }

        // selecting the stating nodes

        int startNode = pairs[0][0];
        for(Map.Entry<Integer, Integer> entry: node.entrySet()){
            // the key which value is -1, that is the startingNode
            if(entry.getValue()== -1){
                startNode = entry.getKey();
                break;
            }
        }

        circuit = new ArrayList();

        dfs(graph, startNode);
        Collections.reverse(circuit);

        int[][] res = new int[pairs.length][2];

        for(int i=1;i<circuit.size();i++){
            res[i-1][0] = circuit.get(i-1);
            res[i-1][1]= circuit.get(i);
        }
        return res;

    }
}