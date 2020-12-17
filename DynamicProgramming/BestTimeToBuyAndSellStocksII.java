public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxProfit(final int[] A) {
        int pro = 0;
        int n = A.length;
        
        for(int i=0; i<n-1; i++){
            if(A[i+1] > A[i]){
                pro += A[i+1] - A[i];
            }
        }
        return pro;
    }
}
