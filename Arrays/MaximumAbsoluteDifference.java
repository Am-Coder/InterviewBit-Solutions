public class Solution {
    public int maxArr(ArrayList<Integer> A) {
        int n = A.size();
        
        int ma1 = Integer.MIN_VALUE;
        int ma2 = Integer.MIN_VALUE;
        int ma3 = Integer.MIN_VALUE;
        int ma4 = Integer.MIN_VALUE;
        
        int mi1 = Integer.MAX_VALUE;
        int mi2 = Integer.MAX_VALUE;
        int mi3 = Integer.MAX_VALUE;
        int mi4 = Integer.MAX_VALUE;
        
        for(int i=0; i<n; i++){
            ma1 = Math.max(ma1, A.get(i) + i);
            ma2 = Math.max(ma2, A.get(i) - i);
            ma3 = Math.max(ma3, -A.get(i) + i);
            ma4 = Math.max(ma4, -A.get(i) - i);
            
            
            mi1 = Math.min(mi1, A.get(i) + i);
            mi2 = Math.min(mi2, A.get(i) - i);
            mi3 = Math.min(mi3, -A.get(i) + i);
            mi4 = Math.min(mi4, -A.get(i) - i);
            
        }
        
        int ans = ma1 - mi1;
        ans = Math.max(ans, ma2 - mi2);
        ans = Math.max(ans, ma3 - mi3);
        ans = Math.max(ans, ma4 - mi4);
        
        return ans;
    }
}
