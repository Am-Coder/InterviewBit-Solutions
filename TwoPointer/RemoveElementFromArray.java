

    public class Solution {
        public int removeElement(ArrayList<Integer> a, int b) {
            int n = a.size();
            ArrayList<Integer> sol = new ArrayList<>();
            for(int i=0; i<n; i++){
                if(a.get(i) != b ){
                    sol.add(a.get(i));
                }
            }
            int m = sol.size()-1;
            int i = a.size()-1;
            while(i>m){
                a.remove(i);
                i--;
            }
            for(i=0; i<=m; i++){
                a.set(i,sol.get(i));
            }
            
            return sol.size();
        }
    }

