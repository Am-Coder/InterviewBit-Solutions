

    public class Solution {
        int mod = (int)1e9 + 7;
        public int solve(int A) {
            if(A%2 != 0)
                return 0;
     
            long[] dp = new long[A+1];
            long[] c = new long[A+1];
            dp[0] = 1;
            
            dp[2] = 3;
            c[2] = 3;
            if(A == 2){
                return (int)dp[A];
            }
            
            dp[4] = 11;
            c[4] = c[2] + 11;
            if(A == 4){
                return (int)dp[A];
            }
            
            dp[6] = 41;
            c[6] = c[4] + 41;
            if(A == 6){
                return (int)dp[A];
            }
            for(int i=8; i<=A; i++){
                dp[i] = (3*dp[i-2] + 2)%mod;
                dp[i] = (dp[i] + 2*c[i-4])%mod;
                c[i] = (c[i-2] + dp[i])%mod ;
            }
            return (int)dp[A]%mod;
        }
    }

