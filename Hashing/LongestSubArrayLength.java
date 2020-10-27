public class Solution {
    // Find maxlen subarray with sum 1, take 0 as -1
    public int solve(int[] A) {
        int n = A.length;
        int sum = 0;
        int mlen = 0;
        int k = 1;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<n; i++){
            if(A[i] == 0){
                sum -= 1;
            }else
                sum += A[i];
            
            if(sum == k)
                mlen = i+1;
            
            if(!hm.containsKey(sum)){
                hm.put(sum,i);
            }
            
            if(hm.containsKey(sum-k)){
                mlen = Math.max(mlen, i - hm.get(sum-k));
            }
        }
        return mlen;
    }       
}

