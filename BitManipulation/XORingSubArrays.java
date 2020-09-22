public class Solution {
    public int solve(int[] A) {
        int xor = 0;
        int n = A.length;
        long ts = (n*(n+1))/2;
        for(int i=1; i<=n; i++){
            long lt = i-1;
            long lc = ((lt)*(lt+1))/2;
            long rt = n - i;
            long rc = ((rt)*(rt+1))/2;
            if((ts - lc - rc)%2 != 0){
                xor ^= A[i-1];
            }
        }
        return xor;
    }
}
