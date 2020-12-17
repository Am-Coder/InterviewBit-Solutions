public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxProfit(final int[] A) {
        if(A.length == 0)
            return 0;
        int min = A[0];
        int prof = 0;
        
        int n = A.length;
        for(int i=0; i<n; i++){
            min = Math.min(min,A[i]);
            prof = Math.max(prof, A[i] - min);
        }
        return prof;
    }
}
