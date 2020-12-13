public class Solution {
    
    public int canJump(int[] A) {
        int n = A.length;
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        return jumpy(A,0,n);
    }
    
    int[] dp;
    public int jumpy(int[] A, int i, int n){
        if(i>=n-1){
            return 1;
        }
        
        if(A[i] == 0){
            return 0;
        }
        
        if(dp[i] != -1){
            return dp[i];
        }

        int val = 0;
        for(int j=i+1; j<=i+A[i]; j++){
            val |= jumpy(A,j,n);
        }
        return dp[i] = val;
    }
    
}
