public class Solution {
    public int solve(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        int max = 0;
        int mask = 0;
        // First we chk for MSB and then the MSB and next bit and so on
        // Thats why mask goes from setting higher bit to lower ones
        for(int i=31; i>=0; i--){
            int newmax = (max|(1<<i));
            mask |= 1<<i;
            for(int j=0; j<n; j++){
                hs1.add(A[j]&mask);
            }    
            for(int j=0; j<m; j++){
                hs2.add(B[j]&mask);
            }
            for(int pre: hs1){
                if(hs2.contains(pre^newmax)){
                    max = newmax;
                    break;
                }
            }
            hs1.clear();
            hs2.clear();
        }
        return max;
    }
}
