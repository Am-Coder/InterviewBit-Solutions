public class Solution {
    public int adjacent(int[][] A) {
        int n = A[0].length;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = Math.max(A[0][0],A[1][0]);
        int sum = 0;
        for(int i=2; i<=n; i++){
            dp[i] = Math.max(dp[i-1], dp[i-2] + Math.max(A[0][i-1],A[1][i-1]));
        }
        return dp[n];
    }
}
