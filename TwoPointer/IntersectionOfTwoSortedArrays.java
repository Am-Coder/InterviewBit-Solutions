

    public class Solution {
        // DO NOT MODIFY THE LIST. IT IS READ ONLY
        public ArrayList<Integer> intersect(final List<Integer> A, final List<Integer> B) {
            int n = A.size();
            int m = B.size();
            int i=0; 
            int j = 0;
            ArrayList<Integer> sol = new ArrayList<>();
            while(i<n && j<m){
                if(A.get(i) < B.get(j)){
                    i++;
                } else if(A.get(i) > B.get(j)){
                    j++;
                }else{
                    sol.add(A.get(i));
                    i++;
                    j++;
                }
            }
            return sol;
        }
    }

