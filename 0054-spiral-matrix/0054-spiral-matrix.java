class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int l=0,t=0,r=matrix[0].length-1,b=matrix.length-1;
        List<Integer> res=new ArrayList<>();
        while(l<=r && t<=b){
            for(int i=l;i<=r;i++){
                res.add(matrix[t][i]);
            }
            t++;
            for(int i=t;i<=b;i++){
                res.add(matrix[i][r]);
            }
            r--;
            if(t<=b){
                for(int i=r;i>=l;i--){
                    res.add(matrix[b][i]);
                }
                b--;
            }
            if(l<=r){
                for(int i=b;i>=t;i--){
                    res.add(matrix[i][l]);
                }
                l++;
            }
        }
        return res;
    }
}