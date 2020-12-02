public class Solution {
    public int uniquePathsWithObstacles(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        
        if(A[0][0] == 1 || n == 0){
            return 0;
        }
        
        int[][] dp = new int[n][m];
        dp[0][0] = 1;
        boolean found = false;
        for(int i=1; i<n; i++){
            if(A[i][0] == 1){
                found = true;
            }
            if(!found){
                dp[i][0] = 1;
            }else{
                dp[i][0] = 0;    
            }
        }
        found = false;
        for(int i=1; i<m; i++){
            if(A[0][i] == 1){
                found = true;
            }
            if(!found){
                dp[0][i] = 1;
            }else{
                dp[0][i] = 0;
            }
        }
        
        for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                if(A[i][j] == 1){
                    dp[i][j] = 0;
                }else{
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }
        return dp[n-1][m-1];
    }
}
