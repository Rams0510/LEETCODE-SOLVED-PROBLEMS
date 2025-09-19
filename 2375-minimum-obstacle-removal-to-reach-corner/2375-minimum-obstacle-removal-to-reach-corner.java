class Solution {
    public int minimumObstacles(int[][] grid) {
    //     int n=grid.length;
    //     int m=grid[0].length;
    //     Deque<int[]> q=new ArrayDeque<>();
    //     q.offerLast(new int[]{0,0});
    //     int[][] dp=new int[n][m];
    //     for(int[] row:dp){
    //         Arrays.fill(row,Integer.MAX_VALUE);
    //     }
    //     int[][] direction={{-1,0},{1,0},{0,-1},{0,1}};
    //     while(!q.isEmpty()){
    //         int[] curr = q.pollFirst();
    //         int x=curr[0];
    //         int y=curr[1];
    //         for(int[] dir:direction){
    //             int nx=x+dir[0];
    //             int ny=y+dir[1];
    //             if(nx>=0 && ny>=0 && nx<n && ny<m){
    //                 int nd=dp[x][y] + grid[nx][ny];
    //                 if(nd<dp[nx][ny]){
    //                     dp[nx][ny]=nd;
    //                     if(grid[nx][ny]==0) q.offerFirst(new int[]{nx,ny});
    //                     else q.offerLast(new int[]{nx,ny});
    //                 }
    //             }
    //         }
    //     }
    //     return dp[n-1][m-1];
    // }

        int n = grid.length;
        int m = grid[0].length;

        Deque<int[]> q = new ArrayDeque<>();
        int[][] dp = new int[n][m];
        for (int[] row : dp) Arrays.fill(row, Integer.MAX_VALUE);

        dp[0][0] = 0;  // start cell has cost 0
        q.offerLast(new int[]{0, 0});

        int[][] direction = {{-1,0},{1,0},{0,-1},{0,1}};

        while (!q.isEmpty()) {
            int[] curr = q.pollFirst();
            int x = curr[0], y = curr[1];

            if (dp[x][y] == Integer.MAX_VALUE) continue; // not reached

            for (int[] dir : direction) {
                int nx = x + dir[0];
                int ny = y + dir[1];
                if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                    int nd = dp[x][y] + grid[nx][ny];
                    if (nd < dp[nx][ny]) {
                        dp[nx][ny] = nd;
                        if (grid[nx][ny] == 0) {
                            q.offerFirst(new int[]{nx, ny});
                        } else {
                            q.offerLast(new int[]{nx, ny});
                        }
                    }
                }
            }
        }

        return dp[n-1][m-1];
    }
}