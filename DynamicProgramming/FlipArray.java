public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int solve(final List<Integer> A) {
        int n = A.size();
        int sum = 0;
        
        for(int i=0; i<n; i++)
            sum += A.get(i);
        
        int m = sum/2;
        
        int[][] dp = new int[n+1][m+1];
        
        for(int i=0; i<=n; i++){
            for(int j=0; j<=m; j++){
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        
        for(int i=0; i<=n; i++){
            dp[i][0] = 0;
        }

        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(j - A.get(i-1) >=0 && dp[i-1][j-A.get(i-1)] != Integer.MAX_VALUE) {
                    dp[i][j] = Math.min(dp[i-1][j], dp[i-1][j-A.get(i-1)]+1);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        int res = Integer.MAX_VALUE;
        for(int i=m; i>=0; i--){
            if(dp[n][i] != Integer.MAX_VALUE){
                res = dp[n][i];
                break;
            }
        }
        return res;
    }
}
