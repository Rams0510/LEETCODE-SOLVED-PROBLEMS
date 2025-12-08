class Solution {
    public int minPathSum(int[][] grid) {
        int nr=grid.length;
        int nc=grid[0].length;
        int[][] dp=new int[nr][nc];
        dp[0][0]=grid[0][0];
        for(int i=1;i<nr;i++){
            dp[i][0]=grid[i][0]+dp[i-1][0];
        }
        for(int j=1;j<nc;j++){
            dp[0][j]=grid[0][j]+dp[0][j-1];
        }
        for(int i=1;i<nr;i++){
            for(int j=1;j<nc;j++){
                int mi=Math.min(dp[i][j-1],dp[i-1][j]);
                dp[i][j]=grid[i][j]+mi;
            }
        }
        return dp[nr-1][nc-1];
    }
}