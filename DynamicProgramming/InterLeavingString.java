public class Solution {
    public int isInterleave(String A, String B, String C) {
        int i = A.length();
        int j= B.length();
        int k = C.length();
        if(i+j != k){
            return 0;
        }
        dp = new int[i+1][j+1][k+1];
        for(int m = 0; m<=i; m++){
            for(int n=0; n<=j; n++){
                for(int o=0; o<=k; o++){
                    dp[m][n][o] = -1;
                }
            }
        }
        return sol(A,0,B,0,C,0)>0 ? 1:0;
    }
    
    int[][][] dp;
    
    public int sol(String A, int i, String B, int j, String C, int k){
       if(k == C.length()) return 1;
        
        if(dp[i][j][k] != -1){
            return dp[i][j][k];
        }
        
        if(i < A.length() && j < B.length() && A.charAt(i) == C.charAt(k) && B.charAt(j) == C.charAt(k)){
            return dp[i][j][k] = sol(A,i+1,B,j,C,k+1) + sol(A,i,B,j+1,C,k+1);
        }else if(i < A.length() && A.charAt(i) == C.charAt(k)){
            return dp[i][j][k] = sol(A,i+1,B,j,C,k+1);
        }else if(j < B.length() && B.charAt(j) == C.charAt(k)){
            return dp[i][j][k] = sol(A,i,B,j+1,C,k+1);
        }else{
            return dp[i][j][k] = 0;
        }
    }
}
