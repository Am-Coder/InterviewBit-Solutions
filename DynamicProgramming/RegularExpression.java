public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int isMatch(final String A, final String B) {
        int n = A.length();
        int m = B.length();
        
        // ---------------TOP DOWN - Space Cmplexity issue ---------------
        // dp = new int[n+1][m+1];
        // for(int i=0; i<=n; i++){
        //     for(int j=0; j<=m; j++){
        //         dp[i][j] = -1;
        //     }
        // }
        // return sol(A,B,0,0) > 0 ? 1 : 0;
        // --------------------------------------------
        
        // -------------Bottom UP-------------------
        boolean[][] dpr = new boolean[n+1][m+1];
        dpr[0][0] = true;
        for(int i=1; i<=m; i++){
            if(B.charAt(i-1) == '*')
                dpr[0][i] = dpr[0][i-1];
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(B.charAt(j-1) == '?'){
                    dpr[i][j] = dpr[i-1][j-1];
                }else if(B.charAt(j-1) == '*'){
                    dpr[i][j] = dpr[i][j-1] || dpr[i-1][j];
                }else if(B.charAt(j-1) == A.charAt(i-1)){
                    dpr[i][j] = dpr[i-1][j-1];
                }else{
                    dpr[i][j] = false;
                }
            }
        }
        return dpr[n][m] ? 1:0;
        // ----------------------------------------------------
    }
    
    int[][] dp;
    
    public int sol(String A, String B, int i, int j){
        if(i == A.length() && j == B.length()) return 1;
        if(j > B.length() || i > A.length()) return 0;
        
        if(dp[i][j] != -1){
            return dp[i][j];
        }    
        if( j<B.length() && B.charAt(j) == '?' ){
            return dp[i][j] = sol(A,B,i+1,j+1);
        }else if(j<B.length() && i < A.length() && B.charAt(j) == A.charAt(i)){
            return dp[i][j] = sol(A,B,i+1,j+1);
        }else if( j < B.length() && B.charAt(j) == '*'){
            return dp[i][j] = sol(A,B,i+1,j) + sol(A,B,i,j+1);
        }else{
            return dp[i][j] = 0;
        }
    }
}
