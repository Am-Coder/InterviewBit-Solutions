public class Solution {
    public int solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        int[][] dp = new int[n][m];
        int val = 0;
        for(int i=0; i<n; i++){
            if(A[i][0] == 1) val = 1;
            dp[i][0] = A[i][0];
        }
        for(int i=0; i<m; i++){
            if(A[0][i] == 1) val = 1;
            dp[0][i] = A[0][i];
        }
        
        int max = val;
        for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                if(A[i][j] == 1)
                if(A[i-1][j-1] == 1 && A[i-1][j] == 1 && A[i][j-1] == 1 ){
                    dp[i][j] = 1 + Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1]));
                    max = Math.max(max, dp[i][j]);
                }else{
                    dp[i][j] = 1;
                    max = Math.max(max,dp[i][j]);
                }
            }
        }
        return max*max;
    }
}
