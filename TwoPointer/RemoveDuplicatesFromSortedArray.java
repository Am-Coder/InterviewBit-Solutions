public class Solution {
    public int removeDuplicates(ArrayList<Integer> a) {
        int k =0;
        int N = a.size();
        int cur = Integer.MAX_VALUE;
        for(int i=0; i<N; i++){
            if(cur!=a.get(i)){
                cur=a.get(i);
                a.set(k,cur);
                k++;
            }
        }
        
        return k;
    }
}
