public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int solve(final int[] A, final int[] B, final int[] C) {
    
        int n = A.length;
        int W = 0;
        
        for(int i=0; i<n; i++){
            W = Math.max(W,A[i]);
        }
        
        n = B.length;
        int[][] dp = new int[n+1][W+1];
        for(int i=1; i<=W; i++){
            dp[0][i] = Integer.MAX_VALUE/2;
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=W; j++){
                if( j >= B[i-1] ){
                    dp[i][j] = Math.min(dp[i-1][j], dp[i][j-B[i-1]]+C[i-1]);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        int res = 0;
        for(int i=0; i<A.length; i++){
            res += dp[n][A[i]];
        }
        return res;
    
       
    }
}
