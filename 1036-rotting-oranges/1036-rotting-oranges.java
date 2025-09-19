class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q=new LinkedList<>();
        int time=0, fresh=0;
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1) fresh++;
                if(grid[i][j]==2) q.offer(new int[]{i,j});
            }
        }
        int[][] direction={{-1,0},{1,0},{0,-1},{0,1}};
        while(q.size()>0 && fresh>0){
            int size=q.size();
            time++;
            for(int i=0;i<size;i++){
                int[] current=q.poll();
                int x=current[0];
                int y=current[1];
                    for(int[] dir:direction){
                        int nx=x+dir[0];
                        int ny=y+dir[1];
                        if(nx>=0 && ny>=0 && nx<n && ny<m && grid[nx][ny]==1){
                            grid[nx][ny]=2;
                            fresh--;
                            q.offer(new int[]{nx,ny});
                        }
                    }
            }
        }
        return fresh==0? time:-1;
    }
}