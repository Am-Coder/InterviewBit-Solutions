

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int majorityElement(final int[] A) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0; i<A.length; i++){
            hm.put(A[i], hm.getOrDefault(A[i],0)+1);
        }
        int max = -1;
        int maxf = -1;
        for(int key: hm.keySet()){
            if(hm.get(key) > maxf){
                maxf = hm.get(key);
                max = key;
            }
        }
        return max;
    }
}

