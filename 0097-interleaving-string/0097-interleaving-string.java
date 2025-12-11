class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        int n=s1.length();
        int m=s2.length();
        int l=s3.length();
        if((m+n)!=l) return false;
        if(s1=="" && s2=="" && s3=="") return true;
        boolean[][] dp=new boolean[m+1][n+1];
        dp[0][0]=true;
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                //left = true j>0  s1(j-1)ch==s3 at i+j-1
                if(j>0 && dp[i][j-1] && (s1.charAt(j-1)==s3.charAt(i+j-1))){
                    dp[i][j]=true;
                }
                //top = true i>0  s2.ch(i-1)==s3.ch(i+j-1)
                if(i>0 && dp[i-1][j] && (s2.charAt(i-1)==s3.charAt(i+j-1))){
                    dp[i][j]=true;
                }
            }
        }
        return dp[m][n];
    }
}