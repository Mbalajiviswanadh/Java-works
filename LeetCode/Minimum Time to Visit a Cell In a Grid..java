import java.util.*;
class Solution {
    public int minimumTime(int[][] grid) {
        if (Math.min(grid[0][1], grid[1][0]) > 1) {
            return -1;
        }
        
        int rows = grid.length;
        int cols = grid[0].length;

        // ascending order
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        q.offer(new int[]{0, 0, 0}); 
        Set<String> visit = new HashSet<>();
        
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int t = curr[0];
            int r = curr[1];
            int c = curr[2];
            
            if (r == rows - 1 && c == cols - 1) {
                return t;
            }
            
            
            int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
            for (int[] dir : directions) {
                int nr = r + dir[0], nc = c + dir[1];
                String key = nr + "," +nc;
                 
                if (nr < 0 || nc < 0 || nr == rows || nc == cols || 
                    visit.contains(key)) {
                    continue;
                }
                
                int wait = (Math.abs(grid[nr][nc] - t) % 2 == 0) ? 1 : 0;
                int nTime = Math.max(grid[nr][nc] + wait, t + 1);
                q.offer(new int[]{nTime, nr, nc});
                visit.add(key);
            }
        }
        return -1;
    }
}