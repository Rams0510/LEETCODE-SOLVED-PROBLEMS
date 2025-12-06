class Solution {
    public int maxSum(int[][] grid) {
        int nr=grid.length;
        int nc=grid[0].length;
        int mx=0;
        int sum=0;
        for(int i=1;i<=nr-2;i++){
            for(int j=1;j<=nc-2;j++){
                sum=grid[i-1][j-1] + grid[i-1][j] + grid[i-1][j+1]
                                        + grid[i][j] +
                          grid[i+1][j-1] + grid[i+1][j] + grid[i+1][j+1];
                mx=Math.max(mx,sum);
            }
        }
        return mx;
    }
}