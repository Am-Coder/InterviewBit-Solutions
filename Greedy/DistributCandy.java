public class Solution {
    public int candy(int[] A) {
        if(A == null || A.length == 0)
            return 0;
        
        int[] candies = new int[A.length];        
        candies[0] =  1;
        
        for(int i = 1; i < A.length; i++){
            if(A[i] > A[i - 1])
                candies[i] = candies[i-1] + 1;
            else{                
                candies[i] = 1;
            }
        }
        
        int result = candies[A.length - 1];
        for(int i = A.length-2; i >= 0; i--){
             int cur = 1;
             if(A[i] > A[i + 1])
                 cur = candies[i+1] + 1;
             result += Math.max(cur, candies[i]);
             candies[i] = cur;
         }
         
        return result;
    }
}
