public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxProfit(final int[] A) {
        return solve(A,2);
    }
    
    public int solve(int[] A, int B) {
        int n = A.length;
        if(B>=n) B = n;
        if(n==0) return 0;
        int[][] prof = new int[B+1][n+1];
        
        for(int i=1; i<=B; i++){
            int pdi = Integer.MIN_VALUE;
            for(int j=1; j<n; j++){
                pdi = Math.max(pdi, prof[i-1][j-1] - A[j-1]);
                prof[i][j] = Math.max(prof[i][j-1], pdi + A[j]);
            }
        }
        return prof[B][n-1];
    }
}
