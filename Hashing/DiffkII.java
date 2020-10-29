public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int diffPossible(final List<Integer> A, int B) {
        int n = A.size();
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int i=0; i<n; i++){
            
            if(hm.containsKey(B + A.get(i)) || hm.containsKey(A.get(i) - B)){
                return 1;
            }
            
            hm.put(A.get(i),i);
        }
        return 0;
    }
}
