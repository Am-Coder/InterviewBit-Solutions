public class Solution {
    public int solve(String A) {
        int n = A.length();
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0; i<n; i++){
            char ch = A.charAt(i);
            hm.put(ch, hm.getOrDefault(ch,0)+1);
        }
        int odc = 0;
        int evc = 0;
        for(char ch: hm.keySet()){
            if(hm.get(ch)%2 == 0){
                evc++;
            } else {
                odc++;
            }
        }
        if((n%2 == 0 && odc > 0) || (n%2 != 0 && odc > 1)){
            return 0;
        }
        return 1;
    }
}
