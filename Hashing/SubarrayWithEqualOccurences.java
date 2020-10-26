public class Solution {
    public int solve(ArrayList<Integer> A, int B, int C) {
        int n = A.size();
        HashMap<Integer, Integer> hm = new HashMap<>();
        int cou = 0;
        for(int i=0; i<n; i++){
            hm.clear();
            for(int j=i; j<n; j++){
                hm.put(A.get(j), hm.getOrDefault(A.get(j),0)+1);
                if(hm.containsKey(B) && hm.containsKey(C) && hm.get(B) == hm.get(C)){
                    cou++;
                } else if(!hm.containsKey(B) && !hm.containsKey(C) && hm.size() > 0){
                    cou++;
                }
            }
        }
        return cou;
    }
}
