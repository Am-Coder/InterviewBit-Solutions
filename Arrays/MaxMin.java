public class Solution {
    public int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        return A.get(0) + A.get(A.size()-1);
    }
}

