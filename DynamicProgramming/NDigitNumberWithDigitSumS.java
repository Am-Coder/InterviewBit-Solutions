public class Solution {
    public int solve(int A, int B) {
        dp = new long[A+1][B+1];
        for(int i=0; i<=A; i++){
            for(int j=0; j<=B; j++)
                dp[i][j] = -1;
        }
        return (int)(rec(0, A, B, 0));
    }
    long[][] dp;
    long mod = (long)1e9 + 7;
    
    public long rec(int pos, int n, int s, int sum){
        if(sum > s || pos > n)
            return 0;
        
        if(pos == n){
            if(sum == s)
                return dp[pos][sum] = 1;
            return dp[pos][sum] = 0;
        }
        
        if(dp[pos][sum]!=-1)
            return dp[pos][sum];
        
        long co = 0;
        if(pos != 0){
            co = (co%mod + rec(pos+1, n, s, sum)%mod)%mod;
        }
        for(int i=1; i<=9; i++){
            co = (co%mod + rec(pos+1, n, s, sum+i)%mod)%mod;
        }
        return dp[pos][sum] = (co%mod);
    }
}
