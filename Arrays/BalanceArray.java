public class Solution {
    public int solve(int[] A) {
        int count = 0;
        int even = 0;
        int odd = 0;
        int n = A.length;
        
        for(int i=0; i<n; i++){
            if(i%2 == 0){
                even += A[i];
            } else {
                odd += A[i];
            }
        }
        
        boolean iseve = false;
        for(int i=n-1; i>=0; i--){
            iseve = false;
            if(i%2 == 0){
                iseve = true;
            }
            if(iseve){
                even -= A[i];
            }else{
                odd -= A[i];
            }
            if(odd == even)
                count++;
            if(iseve) odd += A[i];
            else even += A[i];
        }
        return count;
    }
}
