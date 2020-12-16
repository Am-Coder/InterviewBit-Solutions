public class Solution {
    int mod = 1000007;
    public int coinchange2(int[] A, int B) {
        int n = A.length;
        int m = B;
        int[][] dp = new int[n+1][m+1];
        for(int i=0; i<=n; i++){
            dp[i][0] = 1;
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                dp[i][j] = dp[i-1][j]%mod;
                if(A[i-1] <= j){
                    dp[i][j] = ((dp[i][j]%mod) + (dp[i][j-A[i-1]]%mod))%mod;
                }
            }
        }
        return dp[n][m]%mod;
    }
}
