public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        HashSet<Integer> hs = new HashSet<>();
        int cou = 0;
        for(int num : A){
            
            if(hs.contains(B^num)){
                cou++;
            }
            hs.add(num);
        }
        return cou;
        
    }
}
