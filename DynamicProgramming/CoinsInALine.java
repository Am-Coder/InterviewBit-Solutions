public class Solution {
    public int maxcoin(int[] A) {
        int n = A.length;
        dp = new int[n+1][n+1];
        for(int i=0; i<=n; i++)
            for(int j=0; j<=n; j++)
                dp[i][j] = -1;
        
        return maxi(A, 0, n-1);
    }
    int[][] dp;
    int maxi(int[] A, int i, int j){
        if(i>=j) return 0;
        if(dp[i][j] == -1){
            
            // We use min becaus opponent plays optimally
            int s1 = A[i] + Math.min(maxi(A, i+1, j-1), maxi(A, i+2,j));
            int s2 = A[j] + Math.min(maxi(A, i+1, j-1), maxi(A, i,j-2));
            dp[i][j] = Math.max(s1,s2);
        }
        return dp[i][j];
    }
}
