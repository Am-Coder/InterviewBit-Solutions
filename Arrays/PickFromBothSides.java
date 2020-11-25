public class Solution {
    public int solve(int[] A, int B) {
        int len = A.length;
        int sum =0;
        int i=0, j = len-1;
        for(i=0; i<B; i++){
            sum += A[i];
        }
        i--;
        int max = sum;
        while(i>=0){
            sum -= A[i];
            sum += A[j];
            max = Math.max(max,sum);
            j--;
            i--;
        }
        return max;
    }
}
