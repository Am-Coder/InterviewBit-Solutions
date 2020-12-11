public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int lis(final int[] A) {
        int n = A.length;
        int[] dp = new int[n];
        
        for(int i=0; i<n; i++){
            dp[i] = 1;
        }
        
        for(int i=1; i<n; i++){
            for(int j=0; j<i; j++){
                if(A[i] > A[j] && dp[i] <= dp[j])
                    dp[i] = dp[j] + 1;
            }
        }
        
        int maxi = -1;
        for(int i=0; i<n; i++)
            maxi = Math.max(maxi,dp[i]);
        
        return maxi;
    }
}
