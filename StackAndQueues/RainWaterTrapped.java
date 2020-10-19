public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int trap(final List<Integer> A) {
        int n = A.size();
        if(n <= 2){
            return 0;
        }
        int[] lmax = new int[n];
        int[] rmax = new int[n];
        lmax[0] = A.get(0);
        rmax[n-1] = A.get(n-1);
        for(int i=1; i<n; i++){
            lmax[i] = Math.max(A.get(i-1),lmax[i-1]);
        }
        for(int i=n-2; i>=0; i--){
            rmax[i] = Math.max(A.get(i+1), rmax[i+1]);
        }
        int sum = 0;
        for(int i=0; i<n; i++){
            int diff = Math.min(lmax[i],rmax[i]) - A.get(i);
            if(diff>0){
                sum += diff;
            }
        }
        return sum;
    }
}
