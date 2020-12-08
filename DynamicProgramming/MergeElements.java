public class Solution {
    public int solve(ArrayList<Integer> A) {
        int n = A.size();
        dp = new int[n+1][n+1];
        
        for(int i=0; i<=n; i++){
            Arrays.fill(dp[i], -1);
        }
        return mcm(A,0,n-1);
    }
    
    int[][] dp ;
    public int mcm(ArrayList<Integer> arr, int n, int m){
        if(n>=m) return 0;
        if(dp[n][m] != -1)
            return dp[n][m];
        int ans = Integer.MAX_VALUE;
        int sum1 = 0;
        for(int i=n; i<=m; i++) sum1 += arr.get(i);
        for(int i=n; i<m; i++){
            int l = mcm(arr,n,i);
            int r = mcm(arr,i+1,m);
            ans = Math.min(ans, sum1 + l + r);
        }
        
        return dp[n][m] = ans;
    }
}
