public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int max = -1;
        int n = A.size();
        ArrayList<Integer> sol = new ArrayList<>();
        for(int i=n-1; i>=0; i--){
            if(A.get(i) > max){
                max = A.get(i);
                sol.add(A.get(i));
            }
        }
        return sol;
    }
}
