public class Solution {    
    final long MOD = 1000000007L;
    
    public int solve(int A) {
        if(A<=2) return 1;
        long[][] m = {{1L, 1L}, {1L, 0L}};
        long[][] resultM = matPow(m, A-1);
        long res = resultM[0][0] % MOD;
        return (int)res;
    }
    
    long[][] matMul(long[][] m1, long[][] m2){
        // Matrix multiplication
        long[][] ans = new long[2][2];
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                long sum = 0;
                for(int k = 0; k < 2; k++) {
                    long prod = (m1[i][k] * m2[k][j]) % MOD;
                    sum = (sum + prod)% MOD;
                }
                
                ans[i][j] = sum;
            }
        }

        return ans;
    }
    
    long[][] matPow(long[][] m, int n){
        if(n==0) return new long[][]{{1L, 0L}, {0L, 1L}}; // Identity matrix. A ^ 0 = I
        long[][] halfPow  = matPow(m, n/2);
        long[][] tmp = matMul(halfPow, halfPow);

        if(n%2 == 0)  
            return tmp;
        return matMul(tmp , m);
    }
    
}
