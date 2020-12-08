public class Solution {
    public int solve(int[] A) {
        int n = A.length;
        if(n == 1){
            return A[0];
        }
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += A[i];
        }
        int m = (sum/2) ;
        int[][] dp = new int[n+1][m+1];
        
        for(int i=0; i<=n; i++){
            dp[i][0] = 1;
        }
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(A[i-1] <= j){
                    dp[i][j] = dp[i-1][j] | dp[i-1][j-A[i-1]];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        int min = Integer.MAX_VALUE;
        
        for(int i=1; i<=m; i++){
            if(dp[n][i] == 1)
                min = Math.min(min, sum - 2*i);
        }
        return min;
    }
}
