public class Solution {
    public int solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        int[][] dp = new int[n+1][m+1];
        for(int i=n-1; i>=0; i--){
            for(int j=m-1; j>=0; j--){
                dp[i][j] = A[i][j] + dp[i][j+1];
            }
        }
        
        for(int j=m-1; j>=0; j--){
            for(int i=n-1; i>=0; i--){
                dp[i][j] += dp[i+1][j];
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                max = Math.max(max, dp[i][j]);
            }
        }
        return max;
    }
}
