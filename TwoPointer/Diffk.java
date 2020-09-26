

    public class Solution {
        public int diffPossible(ArrayList<Integer> A, int B) {
            HashSet<Integer> hset = new HashSet<>();
            int n=A.size();
            for(int i=0; i<n; i++){
                if(hset.contains(A.get(i) + B) || hset.contains(A.get(i) - B)){
                    return 1;
                }
                hset.add(A.get(i));
            }
            return 0;
        }
    }

