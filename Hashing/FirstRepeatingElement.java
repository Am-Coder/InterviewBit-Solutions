public class Solution {
    public int solve(ArrayList<Integer> A) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        
        for(int num: A){
            hs.put(num, hs.getOrDefault(num,0)+1);
        }
        for(int num: A){
            if(hs.get(num)>1)
                return num;
        }
        return -1;
    }
}
