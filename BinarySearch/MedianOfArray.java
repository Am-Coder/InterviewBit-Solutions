public class Solution {
    // DO NOT MODIFY BOTH THE LISTS
    public double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {

        int m = a.size();
        int n = b.size();
        if(n>m){
            return findMedianSortedArrays(b,a);
        }
        
        int l = 0, h = 2*n;
        double sol = 0;
        while(l <= h)
        {
            int mid = l + (h-l)/2;
            int mid1 = m+n - mid;
            
            double L1 = (mid1 == 0) ? Integer.MIN_VALUE : a.get((mid1-1)/2);    
            double L2 = (mid == 0) ? Integer.MIN_VALUE : b.get((mid-1)/2);
            double R1 = (mid1 == m*2) ? Integer.MAX_VALUE : a.get((mid1)/2);
            double R2 = (mid == n*2) ? Integer.MAX_VALUE : b.get((mid)/2);
            
            if (L1 > R2) l = mid + 1;        
            else if (L2 > R1) h = mid - 1;    
            else {
                sol = (Math.max(L1,L2) + Math.min(R1, R2)) / 2;
                break;
            }
        }
        return sol;
    }
}
