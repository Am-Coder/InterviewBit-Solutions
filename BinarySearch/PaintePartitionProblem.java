public class Solution {    
    public int getRequiredPainters(ArrayList<Integer> C, int n, long maxLengthPerPainter){
        long total = 0;
        int numPainters = 1;
        for(int i =0;i < n; i++){
            total += C.get(i);            
            if(total > maxLengthPerPainter){
                total = C.get(i);
                numPainters++;
            }
            
        }
        return numPainters;
    }

    public int paint(int A, int B, ArrayList<Integer> C) {
        
        int n=C.size();
        long lo = Integer.MIN_VALUE;
        long hi = 0;
        for(int i=0; i<n; i++){
            lo = Math.max(C.get(i),lo);
            hi += C.get(i);
        }
        long res = 0;
        
        while(lo <= hi){
            long mid = (lo + (hi-lo)/2);
            int requiredPainters = getRequiredPainters(C, n, mid);
            if(requiredPainters <= A) {
                res = mid;
                hi = mid-1;
            }
            else {                
                lo = mid + 1;
            }
        }

        return (int)(((res % 10000003 )* (B % 10000003))%10000003);
    }
}

