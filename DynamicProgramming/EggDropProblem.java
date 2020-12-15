public class Solution {
    public int solve(int A, int B) {
        
        dp = new int[A+1][B+1];
        
        for(int i=1; i<=A; i++){
            dp[i][1] = 1;
            dp[i][0] = 0;
        }
        
        for(int i=1; i<=B; i++){
            dp[1][i] = i;
        }
        int res, mid=0, t1, t2;
        for(int i=2; i<=A; i++){
            for(int j=2; j<=B; j++){
                dp[i][j] = Integer.MAX_VALUE;
                
                int low = 1;
                int high = j;
                while (high>=low){
                    mid = low + (high-low)/2;
                    t1 = dp[i-1][mid-1];
                    t2 = dp[i][j-mid];
                    if (t1 < t2)
                        low = mid+1;
                    else if (t1 > t2)
                        high = mid-1;
                    else
                        break;
                }        
                dp[i][j] = 1 + Math.max(dp[i-1][mid-1], dp[i][j-mid]);
                
                // This gives TLE
                // for(int x = 1; x<=j; x++){
                //     res = 1 + Math.max(dp[i-1][x-1], dp[i][j-x]);
                //     if(res < dp[i][j])
                //         dp[i][j] = res;
                // }
            }
        }
        
        return dp[A][B];
        
        // Memoization gives TLE        
        // dp = new int[A+1][B+1];
        // for(int i=0; i<=A; i++){
        //     Arrays.fill(dp[i], -1);
        // }
        // return eggDrop(A,B);
    }
    int[][] dp;
    int eggDrop(int n, int k) { 
        if (k == 1 || k == 0) 
            return dp[n][k] = k; 
  
        if (n == 1) 
            return dp[n][k] = k; 
        
        if(dp[n][k] != -1){
            return dp[n][k];
        }
        
        int min = Integer.MAX_VALUE; 
        int res; 
  
        for (int i = 1; i <= k; i++) {
            if(dp[n-1][i-1] == -1){
                dp[n-1][i-1] = eggDrop(n - 1, i - 1);
            }
            if(dp[n][k-i] == -1){
                dp[n][k-i] = eggDrop(n, k - i); 
            }
            res = Math.max( dp[n-1][i-1], dp[n][k-i]); 
            min = Math.min(res,min);
        } 
  
        return dp[n][k] = min + 1; 
    } 
}
