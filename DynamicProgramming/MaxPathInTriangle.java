public class Solution {
    public int solve(int[][] A) {
        int n = A.length;
        int[][] dp = new int[n][n];
        dp[0][0] = A[0][0];
        
        for(int i=1; i<n; i++){
            for(int j=0; j<=i; j++){
                dp[i][j] += A[i][j];
                if(j == 0){
                    dp[i][j] += dp[i-1][j];
                }else if(j == i){
                    dp[i][j] += dp[i-1][j-1];
                }else{
                    dp[i][j] += Math.max(dp[i-1][j], dp[i-1][j-1]);
                }
            }
        }
        
        int ans = Integer.MIN_VALUE;
        for(int j=0; j<n; j++){
            ans = Math.max( ans, dp[n-1][j] );
        }
        return ans;
    }
}
