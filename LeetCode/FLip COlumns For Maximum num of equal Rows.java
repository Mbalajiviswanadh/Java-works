class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        Map<String,Integer> map = new HashMap<>();


        for(int row[]: matrix){
            StringBuilder str = new StringBuilder();

            if(row[0]==1){
                for(int i: row){
                    str.append(i==0?1:0);
                }
            }
            else{
                for(int i:row){
                    str.append(i);
                }
            }

            String s = str.toString();
            // map.merge(s, 1, Integer::sum);
            map.put(s, map.getOrDefault(s,0)+1);
        }
        return Collections.max(map.values());
    }
}