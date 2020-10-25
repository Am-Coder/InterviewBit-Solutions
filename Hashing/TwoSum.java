

    public class Solution {
        // DO NOT MODIFY THE LIST. IT IS READ ONLY
        public ArrayList<Integer> twoSum(final List<Integer> A, int B) {
            
            int n = A.size();
            HashMap<Integer, Integer> hm = new HashMap<>();
            int s1 = -1;
            int s2 = -1;
                    ArrayList<Integer> sol = new ArrayList<>();
     
            for(int i=0; i<n; i++){
                int num = A.get(i);
                if(hm.containsKey(B - num)){
                    s1 = Math.min(i, hm.get(B-num)) + 1;
                    s2 = Math.max(i, hm.get(B-num)) + 1;
                    sol.add(s1);
            sol.add(s2);
            
                    break;   
                }
                if(!hm.containsKey(num))
                    hm.put(num,i);
            }
            
            
            return sol;
        }
    }

