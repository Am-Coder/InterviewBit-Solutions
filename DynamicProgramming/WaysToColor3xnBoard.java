public class Solution {
    int mod = (int)1e9 + 7;
    public int solve(int A) {
        long p2 = 12;
        long p3 = 24;
        for(int i=1; i<A; i++){
            long x = ((7*(p2%mod))%mod) + ((5*(p3%mod))%mod) ;
            long y = ((11*(p3%mod))%mod) + ((10*(p2%mod))%mod) ;
            p2 = x%mod;
            p3 = y%mod;
        }
        
        return (int)((p2%mod + p3%mod)%mod);
    }
}
