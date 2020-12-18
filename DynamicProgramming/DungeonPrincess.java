public class Solution {
    public int calculateMinimumHP(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        int[][] dp = new int[n][m];
        dp[n-1][m-1] = A[n-1][m-1] < 0 ? Math.abs(A[n-1][m-1])+1: 1;
        for(int i=m-2; i>=0; i--){
            dp[n-1][i] = Math.max(dp[n-1][i+1] - A[n-1][i], 1);
        }
        for(int i=n-2; i>=0; i--){
            dp[i][m-1] = Math.max(dp[i+1][m-1] - A[i][m-1], 1);
        }
        
        for(int i=n-2; i>=0; i--){
            for(int j=m-2; j>=0; j--){
                int min_points_on_exit = Math.min(dp[i+1][j], dp[i][j+1]); 
                dp[i][j] = Math.max(min_points_on_exit - A[i][j], 1); 
            }
        }
        return dp[0][0];
    }
}
