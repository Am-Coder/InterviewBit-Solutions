public class Solution {
    public int searchMatrix(int[][] A, int B) {
        int r = A.length;
        
        for(int i=0; i<r; i++){
            if(Arrays.binarySearch(A[i], B) >= 0){
                return 1;
            }
        }
        return 0;
    }
}
