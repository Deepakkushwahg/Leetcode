class Solution {
    private int min(int a,int b,int c){
        int l = Math.min(a,b);
        return Math.min(l,c);
    }
    public int minDistance(String word1, String word2) {
        char[] str1 = word1.toCharArray();
        char[] str2 = word2.toCharArray();
        int n = str1.length,m = str2.length;
        int[][] dp = new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                if(i==0)
                    dp[i][j] = j;
                else if(j==0)
                    dp[i][j] = i;
                else if(str1[i-1]==str2[j-1]){
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    dp[i][j] = min(dp[i-1][j],dp[i][j-1],dp[i-1][j-1])+1;
                }
            }
        }
        return dp[n][m];
    }
}