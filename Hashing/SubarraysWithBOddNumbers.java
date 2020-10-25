public class Solution {
    public int solve(int[] A, int B) {
        int n = A.length;
        int[] pref = new int[n+1];
        for(int i=1; i<=n; i++){
            if(A[i-1]%2 != 0){
                pref[i] += 1;
            }
            pref[i] += pref[i-1];
        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        int cou = 0;
        for(int i=0; i<=n; i++){
            if(hm.containsKey(pref[i] - B)){
                cou += hm.get(pref[i]-B);
            }
            hm.put(pref[i], hm.getOrDefault(pref[i],0)+1);
        }
        return cou;
    }
}
