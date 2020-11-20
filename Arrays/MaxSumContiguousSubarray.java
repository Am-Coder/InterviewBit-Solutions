public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> A) {
        int n = A.size();
        int sum = 0;
        int ans = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            sum = Math.max(A.get(i), sum + A.get(i));
            ans = Math.max(ans,sum);
        }
        return ans;
    }
}
