public class Solution {
    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        int n = A.size();
        ArrayList<ArrayList<Integer>> sol = new ArrayList<>(2*n-1);
        for(int i=0; i<2*n-1; i++){
            ArrayList<Integer> all = new ArrayList<Integer>();
            sol.add(all);
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                sol.get(i+j).add(A.get(i).get(j));
            }
        }
        return sol;
    }
}
