public class Solution {
    public int solve(int[][] A) {
        
        int n = A.length;
        if(n==0)
            return 0;
        int[][] dp = new int[n][3];
        dp[0][0] = A[0][0];
        dp[0][1] = A[0][1];
        dp[0][2] = A[0][2];
        
        for(int i=1; i<n; i++){
            dp[i][0] = A[i][0] + Math.min(dp[i-1][1], dp[i-1][2]);
            
            dp[i][1] = A[i][1] + Math.min(dp[i-1][0], dp[i-1][2]);
            
            dp[i][2] = A[i][2] + Math.min(dp[i-1][0], dp[i-1][1]);
        }
        return Math.min(dp[n-1][0], Math.min(dp[n-1][1], dp[n-1][2]));
    }
}
