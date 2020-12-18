public class Solution {
    public int solve(int[] A, int[] B, int W) {
        int n = A.length;
        int m = B.length;
        
        int[][] dp = new int[n+1][W+1];
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=W; j++){
                if(j>=B[i-1]){
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-B[i-1]]+A[i-1]);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        
        return dp[n][W];
    }
}
