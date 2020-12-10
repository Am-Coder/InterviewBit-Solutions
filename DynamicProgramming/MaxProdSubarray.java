public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxProduct(final int[] A) {
        int n = A.length;
        int mav = A[0];
        int miv = A[0];
        int mapro = A[0];
        
        for(int i=1; i<n; i++){
            if(A[i] < 0){
                int temp = mav;
                mav = miv;
                miv = temp;
            }
            mav = Math.max(A[i], A[i]*mav);
            miv = Math.min(A[i], A[i]*miv);
            
            mapro = Math.max(mapro, mav);
        }
        return mapro;
    }
}
