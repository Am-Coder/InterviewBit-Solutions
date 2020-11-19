public class Solution {
    public int mice(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        int max =0 ;
        for(int i=0; i<A.length; i++){
            max = Math.max(max,Math.abs(A[i] - B[i]));
        }
        return max;
    }
}

