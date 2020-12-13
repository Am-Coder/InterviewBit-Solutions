public class Solution {
    //The pattern gives Catalan numbers 1,1,2,5,14...
    //So the solution is to find nth catalan number.
    long mod = (int)1e9 + 7;
    public int chordCnt(int A) {
        if(A == 1)
            return 1;
        if(A==2)
            return 2;
        long[] dp = new long[A+1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3;i<=A;i++){
            
            for(int k=0; k<i; k++){
                dp[i]=(dp[i]+dp[k]*dp[i-1-k])%mod;
            }
        }
        return (int)(dp[A]%mod);
    }
}
