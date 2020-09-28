

    public class Solution {
        public int removeDuplicates(ArrayList<Integer> a) {
            int k = 0;
            int n = a.size();
            int cur = Integer.MAX_VALUE;
            int lc = 0;
            
            for(int i=0; i<n; i++){
                if(cur != a.get(i)){
                    cur = a.get(i);
                    a.set(k,cur);
                    k++;
                    lc = 1;
                } else if(cur == a.get(i) && lc <2){
                    a.set(k,cur);
                    lc++;
                    k++;
                }
            }
            return k;
        }
    }

