public class Solution {
    public int solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        if(n == 1 && m == 1){
            return 1;
        }
        int[][] dp = new int[n][m];
        dp[0][0] = 1;
        for(int i=1; i<n; i++){
            if(A[i][0] > A[i-1][0]){
                dp[i][0] = 1 + dp[i-1][0];
            }else{
                break;
            }
        }
        
        for(int i=1; i<m; i++){
            if(A[0][i] > A[0][i-1]){
                dp[0][i] = 1 + dp[0][i-1];
            }else{
                break;
            }
        }
        
        for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                if(A[i][j] > A[i-1][j] && dp[i-1][j] != 0){
                    dp[i][j] = 1 + dp[i-1][j];
                }
                if(A[i][j] > A[i][j-1] && dp[i][j-1] != 0){
                    dp[i][j] = Math.max(dp[i][j], 1 + dp[i][j-1]);
                }
            }
        }
        return dp[n-1][m-1] == 0 ? -1: dp[n-1][m-1];
    }
}
